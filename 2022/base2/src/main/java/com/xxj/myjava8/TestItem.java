package com.xxj.myjava8;

import com.xxj.myjava8.bean.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2022/3/2 18:38
 * All Rights Reserved
 */
public class TestItem {

    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("123");
        });

        //thread1.start();
        List<Item> list = new ArrayList<>();
        list.stream().forEach(Item::test2);
    }
}
