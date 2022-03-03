package com.xxj.myjvm;

import java.io.Serializable;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2021-12-31 11:26
 **/
public class TestStatic implements Serializable {


    public String m = "m1";
    public final String n = "n1";
    private static String hello = "hello1";
    private static final String HELLO = "HELLO1";

    public void test1() {
        String va = "xxjsmile test1";
    }

    public static void test2() {
        String va = "xxjsmile test2";
    }

    public static void main(String[] args) {
        TestStatic testStatic = new TestStatic();
        testStatic.test1();
        //testStatic.
        testStatic.test2();
        TestStatic.test2();
    }
}
