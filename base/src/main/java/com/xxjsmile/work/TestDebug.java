package com.xxjsmile.work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/7/1 16:41
 * All Rights Reserved
 */
public class TestDebug {

    public static void main(String[] args) {

        Object obj = null;
        //System.out.println(obj.equals(null));
        List<String> lists = Arrays.asList("xxj","xxr","xxn");

        List<String> collect = lists.stream().map(t -> t + "a").sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}
