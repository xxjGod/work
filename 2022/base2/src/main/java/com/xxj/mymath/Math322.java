package com.xxj.mymath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2022/3/4 11:19
 * All Rights Reserved
 */
public class Math322 {

    private static int i = 0;


    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));

        System.out.println(i);
    }

    // 定义：输⼊⾦额 amount，返回凑出 amount 的最少硬币个数
    public static int coinChange(int[] coins, int amount) {
        // base case
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            i++;
            // 递归计算凑出 amount - coin 的最少硬币个数
            int subProblem = coinChange(coins, amount - coin);
            if (subProblem == -1) continue;
            // 凑出 amount 的最少硬币个数
            res = Math.min(res, subProblem + 1);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

}
