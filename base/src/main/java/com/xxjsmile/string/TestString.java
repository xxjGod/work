package com.xxjsmile.string;

import java.util.StringTokenizer;

/**
 * @Author: xiaoxiangjie
 * @Description:
 * @Date: 2021/8/1
 */
public class TestString {

    public static void main(String[] args) {
        String str = " ";
        String str2 = "xxj\t123";
        System.out.println(str2.equals("xxj 123"));


        //test1();

    }

    private static void test1() {
        StringTokenizer stringTokenizer = new StringTokenizer("hello world");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}


