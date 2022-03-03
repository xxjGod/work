package com.xxj.myjava8.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2022/3/2 18:37
 * All Rights Reserved
 */
@Getter
@Setter
public class Item {


    private String name;


    public static void test1() {

        System.out.println("123");
    }

    public void test2() {
        //List<List<Integer>> lists = new ArrayList<>();

//        List<Integer> l1 = new ArrayList<>();
//        l1.add(12);
//        l1.add(13);
//
//        List<Integer> l2 = new ArrayList<>();
//        l2.add(12);
//
//        lists.add(l1);
//        lists.add(l2);
//        List<List<Integer>> collect = lists.stream().sorted(Comparator.comparing(List::hashCode)).collect(Collectors.toList());
//        System.out.println(collect);



    }
}
