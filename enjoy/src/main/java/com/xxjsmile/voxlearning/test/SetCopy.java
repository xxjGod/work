package com.xxjsmile.voxlearning.test;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/6/30 15:23
 * All Rights Reserved
 */
public class SetCopy implements CopyStrategy {
    @Override
    public String getName() {
        return "set copy";
    }

    @Override
    public ToBean copy(FromBean fromBean) {
        ToBean toBean = new ToBean();
        toBean.setAddress(fromBean.getAddress());
        toBean.setAge(fromBean.getAge());
        toBean.setIdno(fromBean.getIdno());
        toBean.setMoney(fromBean.getMoney());
        toBean.setName(fromBean.getName());
        return toBean;
    }
}
