package com.xxjsmile.work.service.impl;


import com.xxjsmile.work.service.Pay;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/4/26 19:55
 * All Rights Reserved
 */
public class ZhiFuBaoPay implements Pay {

    static {

        System.out.println("支付宝初始化");
    }
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
