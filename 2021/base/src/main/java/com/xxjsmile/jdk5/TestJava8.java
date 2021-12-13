package com.xxjsmile.jdk5;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;


/**
 * @description: java8
 * @author: xiangjie.xiao
 * @create: 2021-08-10 17:14
 **/
public class TestJava8 {

    public static void main(String[] args) {
        //test1();
        testFlatMap2();
    }

    private static void testFlatMap1() {
        List<String> strings = Arrays.asList("hello world","hello asd","good night");
        List<Object> collect = strings.stream().map(t -> t.split(" ")).flatMap(Arrays::stream).collect(Collectors.toList());

        System.out.println(collect);
    }

    private static void testFlatMap2() {
        List<String> strings = Arrays.asList("hello world","hello asd","good night");
        List<Object> collect = strings.stream().map(t -> Arrays.asList(t.split(" "))).flatMap(Collection::stream).collect(Collectors.toList());

        System.out.println(collect);
    }

    private static void test1() {
        ArrayList<String> list = new ArrayList<>();
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("xxj");
        List<String> strings = Arrays.asList("abc", "123", "bc", "efg", "abcd", "234", "jkl");
        strings.parallelStream().forEach(t-> list.add(t));
        System.out.println(list);
    }
}
