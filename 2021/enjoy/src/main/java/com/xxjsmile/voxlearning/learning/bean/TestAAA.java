package com.xxjsmile.voxlearning.learning.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2021-09-02 14:55
 **/
public class TestAAA {

    public static void main(String[] args) {
        List<Bird> birdList = new ArrayList<>();
        Bird a = new Bird();
        a.setAge(12);
        Bird b = new Bird();
        b.setAge(13);
        Bird c = new Bird();
        c.setAge(14);
        birdList.add(a);
        birdList.add(b);
        birdList.add(c);
        //Map<Integer, List<Bird>> collect = birdList.stream().collect(Collectors.groupingBy(Bird::getAge));
        //System.out.println(collect);

        birdList.stream().forEach(t ->
                {
                    if(t.getAge()==13){
                        return;
                    }
                    System.out.println(t);
                }
        );

        System.out.println("xxj");
    }
}
