package com.xxjsmile.work.util;

import com.xxjsmile.work.service.Pay;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/4/26 20:01
 * All Rights Reserved
 */
public class TestPay {


    public static void main(String[] args) {
        ServiceLoader<Pay> serviceLoader = ServiceLoader.load(Pay.class);
        Iterator<Pay> iterator = serviceLoader.iterator();

        while (iterator.hasNext()) {

            Pay pay = iterator.next();
            pay.pay();

        }
    }
}
