package com.xxjsmile.voxlearning.learning.test;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/6/15 13:33
 * All Rights Reserved
 */
public class SpringCopy implements CopyStrategy {


    @Override
    public String getName() {
        return "spring copy";
    }

    @Override
    public ToBean copy(FromBean fromBean) {
        ToBean toBean = new ToBean();
        org.springframework.beans.BeanUtils.copyProperties(fromBean, toBean);
        return toBean;
    }
}
