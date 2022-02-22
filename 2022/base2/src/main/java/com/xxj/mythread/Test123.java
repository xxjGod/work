package com.xxj.mythread;

import com.xxj.test.Student;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2022-02-07 17:52
 **/
public class Test123 {


    public static void main(String[] args) {

        RandomKey r1 = new RandomKey();
        System.out.println(r1.r);
        RandomKey r2 = new RandomKey();
        System.out.println(r2.r);
        RandomKey r3 = new RandomKey();
        System.out.println(r3.r);
        int n = 16;
        n >>>= 1;
        System.out.println(n);
        Student student = new Student();
        //student.test1();

    }
}
