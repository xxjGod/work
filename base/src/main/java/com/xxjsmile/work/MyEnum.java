package com.xxjsmile.work;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/7/27 14:39
 * All Rights Reserved
 */
public enum  MyEnum {

    red("红色"),
    YELLOW("黄色");

    private String desc;
    MyEnum(String desc) {
        this.desc = desc;
    }
}
