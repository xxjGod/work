package com.xxjsmile.voxlearning.test;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/6/15 13:35
 * All Rights Reserved
 */
public class ApacheBeanCopy implements CopyStrategy {
    @Override
    public ToBean copy(FromBean fromBean) {
        ToBean toBean = new ToBean();
        try {
            BeanUtils.copyProperties(toBean, fromBean);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return toBean;
    }

    @Override
    public String getName() {
        return "ApacheBean copy";
    }
}
