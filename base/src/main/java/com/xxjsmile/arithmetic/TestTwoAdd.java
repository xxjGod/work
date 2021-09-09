package com.xxjsmile.arithmetic;

import java.util.HashMap;
import java.util.Map;



/**
 * @description: 两数之和 1
 * @author: xiangjie.xiao
 * @create: 2021-08-26 14:13
 **/
public class TestTwoAdd {

    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 5, 3, 6};
        int target = 5;
        int[] result = test(nums, target);
        System.out.println(result[0]+"-"+result[1]);
    }

    private static int[] test(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = i;
                result[1] = map.get(nums[i]);
                break;
            } else {
                map.put(target - nums[i], i);
            }

        }
        return result;


    }
}
