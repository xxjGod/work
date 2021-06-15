package com.xxjsmile.voxlearning.test;

import java.util.Arrays;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/6/15 13:47
 * All Rights Reserved
 */
public class TestMain {

    public static void main(String[] args) {
        FromBean fromBean = new FromBean();
        fromBean.setAge(12);
        fromBean.setName("18");

        fromBean.setAddress("aaa");
        fromBean.setIdno("啦啦");
        fromBean.setMoney(123.4);

       // TestBeanCopy.copy(new SpringCopy(),fromBean,10);   //spring copy耗时ms212
        //TestBeanCopy.copy(new ApacheBeanCopy(),fromBean,10); //ApacheBean copy耗时ms47
        //TestBeanCopy.copy(new ApacheProCopy(),fromBean,10);//ApachePro copy耗时ms1
        //TestBeanCopy.copy(new CglibCopy(),fromBean,10);//Cglib copy耗时ms47


        System.out.println("###########################################################");


        //TestBeanCopy.copy(new SpringCopy(),fromBean,10000);//spring copy耗时ms309
        TestBeanCopy.copy(new ApacheBeanCopy(),fromBean,10000);//ApacheBean copy耗时ms678
        TestBeanCopy.copy(new ApacheProCopy(),fromBean,10000);//ApachePro copy耗时ms37
        TestBeanCopy.copy(new CglibCopy(),fromBean,10000);//Cglib copy耗时ms77



    }
}
