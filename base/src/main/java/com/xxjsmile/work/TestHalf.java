package com.xxjsmile.work;

import java.util.List;

public class TestHalf {

    public static void main(String[] args) {
        int[] nums = {5, 7, 12, 14, 15, 18, 20};
        System.out.println(search(nums, 18));


    }

    public static int search(int[] nums, int target) {

        int begin = 0;
        int end = nums.length - 1;
        while (begin < end) {
            int middle = begin + (end-begin)/2;
            if (nums[middle] > target) {
                end = middle-1;
            } else if (nums[middle] < target) {
                begin = middle+1;
            } else {
                return middle;
            }

        }
        return -1;
    }
}
