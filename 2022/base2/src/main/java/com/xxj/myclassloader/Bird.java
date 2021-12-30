package com.xxj.myclassloader;

import lombok.Getter;
import lombok.Setter;



/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2021-12-16 16:48
 **/
@Getter
@Setter
public class Bird {


    static {
        System.out.println(Bird.class.getClassLoader());
    }

    private String name;


    public static void invokeMain() {

        System.out.println(Thread.currentThread().getContextClassLoader() + "个数：" + TestMyClassLoader.count);

    }
}
