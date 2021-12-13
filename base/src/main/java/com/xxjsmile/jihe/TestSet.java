package com.xxjsmile.base.jihe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: set test
 * @author: xiangjie.xiao
 * @create: 2021-10-27 19:58
 **/
public class TestSet {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        Map<String,Object> map = new HashMap<>();

        map.put("xxj",12);
        map.put("xxr",13);
        map.put("xxd",14);
        System.out.println(map.keySet().contains(Arrays.asList("xxj","xxr","xxd")));


    }
}
