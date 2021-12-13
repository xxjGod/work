package com.xxjsmile.voxlearning.learning.test;

import org.springframework.cglib.beans.BeanCopier;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/6/15 13:39
 * All Rights Reserved
 */
public class CglibCopy implements CopyStrategy{
    @Override
    public ToBean copy(FromBean fromBean) {

        ToBean toBean = new ToBean();
        BeanCopier beanCopier = BeanCopier.create(fromBean.getClass(),toBean.getClass(),false);
        beanCopier.copy(fromBean,toBean,null);
        return toBean;
    }
    @Override
    public String getName() {
        return "Cglib copy";
    }
}
