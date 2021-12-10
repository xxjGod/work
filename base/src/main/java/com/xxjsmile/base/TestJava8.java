package com.xxjsmile.base;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/10 17:24
 * All Rights Reserved
 */

public class TestJava8 {


    public int a() {
        return 12;
    }

    public int b() {
        return 2;
    }

    public static void main(String[] args) {

        //test1();
        //test2();
        //test3();
        //test4();
        //test5();
        //test6();
        test7();
    }

    private static void test7() {
        List<String> list = Arrays.asList("xxj", "123", "xxr");
        String collect = list.stream().collect(Collectors.joining(","));
        System.out.println(collect);


    }

    private static void test6() {
        List<String> list = null;
        List<String> collect = list.stream().map(t -> t + "").collect(Collectors.toList());
    }

    private static void test5() {
        List<Integer> nums = Arrays.asList(12,19,20,28);
        List<Integer> finalNums = new ArrayList<>();
        Optional.ofNullable(nums).orElseGet(() -> new LinkedList<>()).stream().forEach(item -> finalNums.add(item));
        System.out.println(finalNums);
    }

    private static void test4() {
        String[] words = new String[]{"Hello","World"};
        List<String> a = Arrays.stream(words)
                .map(word -> word.split("")).flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        a.forEach(System.out::print);


    }

    private static void test3() {
        String[] words = new String[]{"Hello","World"};
        List<String[]> a = Arrays.stream(words)
                .map(word -> word.split(""))
                .distinct()
                .collect(Collectors.toList());
        a.forEach(System.out::print);
    }

    private static void test2() {

        Arrays.asList(new TestJava8()).
                stream().
                collect(Collectors.groupingBy(TestJava8::b));
    }

    /**
     * 类实例方法  接口入参参数比Test1的a方法多一个，且Test1::a的Test1与该入参类型Test1相同
     */
    private static void test1() {
        MyInter m = TestJava8::a;
        //m.d(13,123,123);
    }
}

@FunctionalInterface
interface MyInter {

    public int d(TestJava8 f);

}
