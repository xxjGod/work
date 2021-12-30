package com.xxj.myInherit;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2021-12-15 18:52
 **/
public class Birld extends Animal{

    public Birld(){
        this("default");
    }
    public Birld(String zooName) {
        //diao
        //System.out.println("123");
        super(zooName);
    }
}
