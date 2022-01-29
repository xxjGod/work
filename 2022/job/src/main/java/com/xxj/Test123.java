package com.xxj;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2022-01-05 17:19
 **/
public class Test123 {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,25,12,47,13,18,23);
        integers.parallelStream().forEach(t->{ if(t==12){
                    return;
                }
                    System.out.println("奇数："+t);

        }

                );

    }
}
