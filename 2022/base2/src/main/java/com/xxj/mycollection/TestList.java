package com.xxj.mycollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2022/3/16 11:04
 * All Rights Reserved
 */
public class TestList {

    public static void main(String[] args) {

        testArrayList();
        testVector();
        testLinkedList();



    }

    private static void testLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("xxj");
        linkedList.add("xxr");


    }

    private static void testVector() {
        Vector<String> vector =new Vector<>();
        vector.add("xxj");
        vector.add("xxr");



    }

    private static void testArrayList() {
        ArrayList<String>  arrayList = new ArrayList<>();
        arrayList.add("xxj");
        arrayList.add("xxr");
    }


}
