package com.xxj.bean;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2022/3/1 15:50
 * All Rights Reserved
 */
public class Test456 {

    public static void main(String[] args) {
        int[] nums = {1,2,5,10,5,2,1,1,};
        int amount = 8;
        System.out.println(coinChange(nums, amount));


    }

    static int coinChange(int[] coins, int amount) {
        // base case
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            // 递归计算凑出 amount - coin 的最少硬币个数
            int subProblem = coinChange(coins, amount - coin);
            if (subProblem == -1) continue;
            // 凑出 amount 的最少硬币个数
            res = Math.min(res, subProblem + 1);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
