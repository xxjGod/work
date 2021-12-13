package com.xxjsmile.voxlearning.chain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @Author: xiaoxiangjie
 * @Description:
 * @Date: 2021/6/27
 */
@Getter
@Setter
@Accessors(chain = true)
public class Person {

    private String name;
    private Integer age;

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(18).setName("xxj");

    }
}
