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

        Long springCopy = 0L;
        Long apacheBeanCopy = 0L;
        Long apacheProCopy = 0L;
        Long cglibCopy = 0L;
        //Long setCopy = 0L;
        //Long reflectCopy = 0L;
        int count = 100_0000;
        for (int i = 0; i < count; i++) {
            springCopy += TestBeanCopy.copy(new SpringCopy(), fromBean, 1);
            apacheBeanCopy += TestBeanCopy.copy(new ApacheBeanCopy(), fromBean, 1);
            apacheProCopy += TestBeanCopy.copy(new ApacheProCopy(), fromBean, 1);
            cglibCopy += TestBeanCopy.copy(new CglibCopy(), fromBean, 1);
            //setCopy+=TestBeanCopy.copy(new SetCopy(), fromBean, 1);
            //reflectCopy +=TestBeanCopy.copy(new ReflectCopy(), fromBean, 1);
        }
        System.out.println("###########################################################");
        System.out.println("springCopy time ms:" + springCopy);
        System.out.println("apacheBeanCopy time ms:" + apacheBeanCopy);
        System.out.println("apacheProCopy time ms:" + apacheProCopy);
        System.out.println("cglibCopy time ms:" + cglibCopy);
        //System.out.println("setCopy time ms:"+setCopy);
        //System.out.println("reflectCopy time ms:" + reflectCopy);
        System.out.println("###########################################################");


    }
}
