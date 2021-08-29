package com.xxjsmile.voxlearning.pd.bean;

/**
 * @Author: xiaoxiangjie
 * @Description:
 * @Date: 2021/6/14
 */
public class Bird extends Animal {

    private Integer id;

    private String name;

    public Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public void play(){
        System.out.println("i can fly");
    }
}
