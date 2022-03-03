package com.xxj.mymath;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2022/3/2 16:29
 * All Rights Reserved
 */
public class Math303 {

    int[] preSum;


    public Math303(int[] nums) {
        preSum = new int[nums.length + 1];
        preSum[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            preSum[i] = preSum[i-1] + nums[i-1];
        }

    }

    public int sumRange(int left, int right) {

        return preSum[right + 1] - preSum[left];

    }

    public static void main(String[] args) {
        Math303 math303 = new Math303(new int[]{1, 4, 5, 6, 7});
        System.out.println(math303.sumRange(0, 3));
    }
}
