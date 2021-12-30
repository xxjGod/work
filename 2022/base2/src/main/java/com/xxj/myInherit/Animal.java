package com.xxj.myInherit;

import lombok.Getter;
import lombok.Setter;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2021-12-15 18:51
 **/
@Getter
@Setter
public class Animal {

    private String zooName;

//    public Animal(){
//        System.out.println("init");
//    }
    public Animal(String zooName){
        this.zooName = zooName;
    }



}
