package com.xxjsmile.voxlearning.learning.test;

import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/6/15 13:36
 * All Rights Reserved
 */
public class ApacheProCopy implements CopyStrategy {
    @Override
    public ToBean copy(FromBean fromBean) {
        ToBean toBean = new ToBean();
        try {
            PropertyUtils.copyProperties(toBean, fromBean);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return toBean;
    }

    @Override
    public String getName() {
        return "ApachePro copy";
    }
}
