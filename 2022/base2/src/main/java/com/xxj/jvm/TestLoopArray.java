package com.xxj.jvm;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2021-12-31 16:58
 **/
public class TestLoopArray {

    public static void main(String[] args) {
        loopArray();
    }


    private static void loopArray() {
        int[][] arrayC = new int[10000][10000];

        long startA = System.currentTimeMillis();
        int sum1 = 0;
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                sum1 += arrayC[i][j];
            }
        }
        long endA = System.currentTimeMillis();
        System.out.println("  Array行遍历结果:" + sum1 + ", 耗时：" + (endA - startA)
                + "ms");

        long startB = System.currentTimeMillis();
        int sum2 = 0;
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                sum2 += arrayC[j][i];
            }
        }
        long endB = System.currentTimeMillis();
        System.out.println("  Array列遍历结果:" + sum2 + ", 耗时：" + (endB - startB)
                + "ms");
    }
}
