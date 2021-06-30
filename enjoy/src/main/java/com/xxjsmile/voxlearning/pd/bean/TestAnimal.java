package com.xxjsmile.voxlearning.pd.bean;


import java.beans.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
        MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();

        for (MethodDescriptor methodDescriptor : methodDescriptors) {
            System.out.println("方法名：" + methodDescriptor.getName()+"\t"+"");
            if("setName".equals(methodDescriptor.getName())){
                Bird bird = new Bird();
                Method method = methodDescriptor.getMethod();
                System.out.println(method.invoke(bird, new Object[]{"ww"}));
                System.out.println("method invoke:"+bird.getName());
            }

        }
        PropertyDescriptor pd = new PropertyDescriptor("name", Bird.class);
        Bird p = new Bird();
        Method setNameMethod = pd.getWriteMethod();
        setNameMethod.invoke(p, "黄鹂");
        Method getNameMethod = pd.getReadMethod();
        System.out.println(getNameMethod.invoke(p, null));

    }
}
