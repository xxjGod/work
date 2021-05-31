package com.xxjsmile.test;

import com.xxjsmile.bean.A;
import com.xxjsmile.bean.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/18 10:56
 * All Rights Reserved
 */
public class TestMain {
    static double aDouble;

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("xxj","");

        System.out.println(map.get("xxj")==null);
    }
}
