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

        TestBeanCopy.copy(new SpringCopy(), fromBean, 10);
        TestBeanCopy.copy(new ApacheBeanCopy(), fromBean, 10);
        TestBeanCopy.copy(new ApacheProCopy(), fromBean, 10);
        TestBeanCopy.copy(new CglibCopy(), fromBean, 10);


        System.out.println("###########################################################");


        //TestBeanCopy.copy(new SpringCopy(), fromBean, 10000);
//        TestBeanCopy.copy(new ApacheBeanCopy(), fromBean, 10000);
//        TestBeanCopy.copy(new ApacheProCopy(), fromBean, 10000);
//        TestBeanCopy.copy(new CglibCopy(), fromBean, 10000);

        System.out.println("###########################################################");


        //TestBeanCopy.copy(new SpringCopy(), fromBean, 10_0000);
        //TestBeanCopy.copy(new ApacheBeanCopy(), fromBean, 10_0000);
        //TestBeanCopy.copy(new ApacheProCopy(), fromBean, 10_0000);
        //TestBeanCopy.copy(new CglibCopy(), fromBean, 10_0000);

    }
}
