package com.xxjsmile.rpc;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/7/1 17:34
 * All Rights Reserved
 */
public class RpcSayHiServiceImpl implements RpcSayHiService{
    @Override
    public String sayHi(String name) {
        return "Hi," + name;
    }
}
