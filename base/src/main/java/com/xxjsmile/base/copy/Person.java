package com.xxjsmile.base.copy;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @Author: xiaoxiangjie
 * @Description:
 * @Date: 2021/8/1
 */
@Getter
@Setter
@Accessors(chain = true)
public class Person implements Cloneable {

    private String name;
    private Integer age;

    private Book book;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
