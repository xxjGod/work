package com.xxjsmile.reference;


import com.xxjsmile.obj.Bird;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/7/14 15:08
 * All Rights Reserved
 */
public class TestList {

    public static void main(String[] args) {
        List<Bird> list = new ArrayList<>();
        Bird b1 = new Bird();
        b1.setAge(12);
        list.add(b1);
        Bird b2 = new Bird();
        b2.setAge(13);
        list.add(b2);
        System.out.println(list);

        Bird bird = list.get(0);
        bird = new Bird();
        bird.setAge(19);
        System.out.println(list);
        System.out.println("很开心");
    }
}
