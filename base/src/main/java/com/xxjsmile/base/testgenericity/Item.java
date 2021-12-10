package com.xxjsmile.base.testgenericity;

import java.util.Objects;

/**
 * @description: 元素
 * @author: xiangjie.xiao
 * @create: 2021-10-13 11:33
 **/
public class Item<T> {

    T value;

    private Item(T value) {
        this.value = Objects.requireNonNull(value);
    }


    /**
     * 泛型方法，调用的时候指明类型
     * @param value
     * @param <T>
     * @return
     */
    public static <T> Item<T> getItem(T value) {
        return new Item<>(value);
    }
}
