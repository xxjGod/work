package com.xxjsmile.voxlearning.test;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/6/15 13:30
 * All Rights Reserved
 */
public interface CopyStrategy {


    String getName();

    ToBean copy(FromBean fromBean);
}
