package com.xxjsmile.enumtest;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/26 15:46
 * All Rights Reserved
 */
public class TestEnum {

    public static void main(String[] args) {
        //Day day = Day.MONDAY;
//        Day day2 = Day.TUESDAY;
//        //System.out.println(day.name);
//        Class<?> superclass = day.getClass().getSuperclass();
//        Class<?>[] interfaces = superclass.getName().getClass().getInterfaces();
//        for (Class<?> anInterface : interfaces) {
//            System.out.println(anInterface.getName());
//        }
//
//        System.out.println(day.compareTo(day2));
//        System.out.println(day instanceof Serializable);
        String day = "MONDAY";
        Day day1 = Day.valueOf(day);
        String name = day1.name();
        //Day.values()
        System.out.println(name);
        System.out.println(day1);
        int[] m = new int[3];
    }
}


