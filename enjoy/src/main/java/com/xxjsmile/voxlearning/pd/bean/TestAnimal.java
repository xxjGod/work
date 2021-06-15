package com.xxjsmile.voxlearning.pd.bean;


import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: xiaoxiangjie
 * @Description:
 * @Date: 2021/6/14
 */
public class TestAnimal {


    public static void main(String[] args) throws IllegalAccessException, IntrospectionException, InvocationTargetException {
        BeanInfo beanInfo = Introspector.getBeanInfo(Bird.class);
        // 获取bean的所有属性列表
        PropertyDescriptor[] proDescrtptors = beanInfo.getPropertyDescriptors();

        for (PropertyDescriptor proDescrtptor : proDescrtptors) {
            System.out.println("属性名：" + proDescrtptor.getName() + "\t" + "write：" + proDescrtptor.getWriteMethod() + "\t" + "read：" + proDescrtptor.getReadMethod());
        }
    }
}
