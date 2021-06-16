package com.xxjsmile.voxlearning.test;

import java.util.Date;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/6/15 13:41
 * All Rights Reserved
 */
public class TestBeanCopy {



    public static void copy(CopyStrategy strategy, FromBean fromBean, Integer count) {

        long begin = new Date().getTime();
        //Long a = System.currentTimeMillis();
        //System.nanoTime();

        ToBean toBean = null;
        for (int i = 0; i < count; i++) {
            toBean = strategy.copy(fromBean);
        }
        long end = new Date().getTime();

        System.out.println(strategy.getName()+"耗时ms" + (end - begin));

    }


}
