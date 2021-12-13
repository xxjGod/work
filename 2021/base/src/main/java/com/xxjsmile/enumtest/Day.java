package com.xxjsmile.enumtest;


/**
 * @Author: xiaoxiangjie
 * @Description:
 * @Date: 2021/6/6
 */
public enum Day {

    MONDAY("周一",1),
    TUESDAY("周二",2),
    SUNDAY("周日",3),
    SATURDAY("周日",4);
    String name;
    Integer sort;


    Day(){}
    Day(String name, Integer sort) {
        this.name = name;
        this.sort = sort;
    }
}
