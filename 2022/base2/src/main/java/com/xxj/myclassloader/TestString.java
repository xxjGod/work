package com.xxj.myclassloader;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2021-12-16 15:05
 **/
public class TestString {

    public static void main(String[] args) {
        String s = new String();
        Bird bird = new Bird();
        String userDir = System.getProperty("user.dir");
        System.out.println(userDir);

    }
}
