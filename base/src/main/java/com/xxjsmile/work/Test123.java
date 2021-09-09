package com.xxjsmile.work;

import com.google.common.collect.Lists;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/7/1 15:41
 * All Rights Reserved
 */
public class Test123 {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("xxh");
//        list.add("xxr");
        //System.out.println(list);
        //Jso
        /*String name = MyEnum.red.name();
        System.out.println(name);*/


        /*File file = new File("123");

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {

        }*/
        Map map = new HashMap();
        map.put("xxj",12);
        System.out.println(map.get("123").equals(123));


    }

    private static void test1() {

        StringBuffer cacheKey = new StringBuffer();
        LocalDateTime localDateTime = LocalDateTime.now();
        cacheKey.append(localDateTime.toLocalDate()).append(localDateTime.getHour()).append(localDateTime.getMinute());
        System.out.println(cacheKey.toString().replaceAll("-", ""));
    }
}
