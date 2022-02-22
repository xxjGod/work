package com.xxj.mythread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2022-02-08 11:04
 **/
public class RandomKey {

    private static AtomicInteger nextHashCode =
            new AtomicInteger();

    public  int r = nextHashCode();

    private static int nextHashCode() {
        return nextHashCode.getAndAdd(12);
    }
}
