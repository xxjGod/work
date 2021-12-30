package com.xxjsmile.obj;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/7/14 15:08
 * All Rights Reserved
 */
@Getter
@Setter
public class Bird {


    static {
        System.out.println("1："+Bird.class.getClassLoader());
    }

    private String name;


    public static void invokeMain() {

        System.out.println("2："+Thread.currentThread().getContextClassLoader() );

    }



    private Integer age;

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
