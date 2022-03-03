package com.xxj;

import com.xxj.bean.Person;

import java.util.Optional;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2022/2/25 16:37
 * All Rights Reserved
 */
public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("xxj");
        String s = Optional.of(person).map(t->t.getName()).get();
        System.out.println(s);
    }
}
