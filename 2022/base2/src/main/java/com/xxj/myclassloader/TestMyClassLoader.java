package com.xxj.myclassloader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2021-12-16 15:36
 **/
public class TestMyClassLoader {


    public static Integer count = 0;


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        count++;

        MyClassLoader loader = new MyClassLoader("C:\\work\\demoproject\\work\\2022\\base2\\target\\classes\\com\\xxj\\myclassloader\\Birld.class");
Class<?> aClass = loader.loadClass("com.xxj.myclassloader.Bird");
       
//        MyClassLoader loader = new MyClassLoader("C:\\work\\demoproject\\work\\2021\\base\\target\\classes\\com\\xxjsmile\\obj\\Bird.class");
//        Class<?> aClass = loader.loadClass("com.xxjsmile.obj.Bird");

        Method invokeMain = aClass.getDeclaredMethod("invokeMain");
        invokeMain.invoke(aClass);
    }
}
