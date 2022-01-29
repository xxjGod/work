package com.xxj.mycollection;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2022-01-27 18:19
 **/
public class TestPlace<T> {


    public static void main(String[] args) {

    }


    public <M> void show1(List<? extends Person> list) {
        for (Object object : list) {
            System.out.println(object.toString());
        }
    }

    public static void show2(List<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }

}
