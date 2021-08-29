package com.xxjsmile.base.threadlocal;

/**
 * @Author: xiaoxiangjie
 * @Description:
 * @Date: 2021/8/1
 */
public class TestThreadlocal {

    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("xxj");
    }
}


