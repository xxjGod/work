package com.xxj.mythread;

import com.xxj.myInherit.Birld;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2022-02-07 14:49
 **/
public class TestThread {


    public static void main(String[] args) {

        List<Birld> birlds = new ArrayList<>();
        System.setProperty("xxj","18");

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                birlds.add(new Birld());
            }

            while (true) {
                Birld birld = new Birld();
                birld.setZooName("望京");
                birld = null;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.gc();
                System.out.println("打印："+System.getProperty("xxj"));
            }
        });
        thread.start();
    }
}
