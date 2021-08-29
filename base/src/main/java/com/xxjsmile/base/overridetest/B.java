package com.xxjsmile.base.overridetest;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/28 17:48
 * All Rights Reserved
 */
public class B extends A{

    @Override
    public Integer get(String name) throws RuntimeException{
        return 7;
    }

    private Integer get(Integer age){
        return 2;
    }

    private Object get(Object age){
        return 2;
    }
}
