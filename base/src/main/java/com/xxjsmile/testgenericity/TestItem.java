package com.xxjsmile.base.testgenericity;

import java.util.Arrays;
import java.util.List;

/**
 * @description: test
 * @author: xiangjie.xiao
 * @create: 2021-10-13 11:50
 **/
public class TestItem {

    public static void main(String[] args) {
        Item<List<Integer>> item = Item.getItem(Arrays.asList(9, 8, 7));
    }
}
