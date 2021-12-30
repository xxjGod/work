package com.xxj.myInherit;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2021-12-16 15:10
 **/
public class TestBirld {

    //父类有无参构造器，子类默认调用父类无参构造器
    //父类无 无参构造器，子类构造器第一行调用父类有参构造器
    public static void main(String[] args) {
        Birld birld = new Birld("黄鹂");

    }

}
