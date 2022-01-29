package com.xxj.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2022-01-25 14:26
 **/
public class StringOomMock {


    static String  base = "string";
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i=0;i< Integer.MAX_VALUE;i++){
            String str = base + base;
            base = str;
            list.add(str.intern());
        }
    }
}
