package com.xxjsmile.voxlearning.pd.bean;

import com.xxjsmile.voxlearning.pd.BeanInfoUtil;
import org.apache.commons.beanutils.PropertyUtils;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: xiaoxiangjie
 * @Description:
 * @Date: 2021/6/14
 */
public class TestAnimal {


    public static void main(String[] args) throws IllegalAccessException, IntrospectionException, InvocationTargetException {
        BeanInfoUtil.getPropDesc(new Bird());
    }
}
