package com.xxjsmile.enumtest;

import java.io.*;

/**
 * @Author: xiaoxiangjie
 * @Description:
 * @Date: 2021/6/6
 */
public class TestSerial {


    public static void main(String[] args) throws Exception{
        //TestEq();

        TestEnumReflet();

    }

    private static void TestEnumReflet() throws IllegalAccessException, InstantiationException {

//        Class<Day> dayClass = Day.class;
//        Day day = dayClass.newInstance();
//        System.out.println(day);

        Day day = Day.MONDAY;

        Day day1 = Day.class.newInstance();

    }

    private static void TestEq() throws IOException, ClassNotFoundException{
        String enumPath = "D:\\work\\serial\\day.txt";
        Day item = Day.MONDAY;

        test1(item,enumPath);

        System.out.println(item == test2(item, enumPath));

        Bird bird = new Bird();
        bird.setId("12");
        bird.setName("jl");
        String objPath = "D:\\work\\serial\\bird.txt";
        test1(item,objPath);

        System.out.println(bird == test2(item, objPath));
    }


    private static Object  test2(Object item,String path) throws IOException, ClassNotFoundException {

        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(path));
        Object newDay = oin.readObject(); // 没有强制转换到Person类型
        oin.close();
        return newDay;
    }

    private static void test1(Object item,String path) throws IOException, ClassNotFoundException {

        File file = new File(path);
        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));
        //Person person = new Person("John", 101, Gender.MALE);
        oout.writeObject(item);
        oout.close();
    }
}
