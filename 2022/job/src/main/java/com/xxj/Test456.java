package com.xxj;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2022-01-14 14:19
 **/
public class Test456 {

    public static void main(String[] args) {
//        Integer m = 128;
//        Integer m1 = Integer.valueOf(12);
//        Integer n = 128;
//        System.out.println(m==n);
        HashSet<String> stringSet = new HashSet<>();

        stringSet.add("xxj");
        stringSet.add("xxr");
        String[] strings = stringSet.toArray(new String[]{});
        System.out.println(strings);


    }
}
