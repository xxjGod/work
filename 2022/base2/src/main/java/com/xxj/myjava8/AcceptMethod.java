package com.xxj.myjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2022/3/3 11:27
 * All Rights Reserved
 */
public class AcceptMethod {


    int age;

    public AcceptMethod() {
    }

    public static int printValur(String str) {

        //System.out.println("print value : "+str);
        return 12;

    }

    public int printValur1(String str) {

        //System.out.println("print value : "+str);
        return 12;

    }

    public int test3(AcceptMethod method) {
        return this.age - method.age;

    }


    public static void main(String[] args) {

        //https://blog.csdn.net/weixin_41126303/article/details/81187002
        AcceptMethod[] list = {};
        Arrays.sort(list, AcceptMethod::test3);
        List<AcceptMethod> list1 = new ArrayList<>();
        list1.sort(AcceptMethod::test3);
        //Arrays.sort(list,AcceptMethod::test3);


    }
}
