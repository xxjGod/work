package com.xxj.mymath;

/**
 * @Description: 计算分数范围内的学生
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2022/3/4 15:39
 * All Rights Reserved
 */
public class Math303_2 {
    //0--100
    private static int[] grades = {5, 10, 28, 28, 30, 35, 48, 59, 99, 83, 75, 12, 77, 63, 59, 40};

    private static int[] gradeNums = new int[101];

    public static void main(String[] args) {


        for (int i = 0; i < grades.length; i++) {
            gradeNums[grades[i]]++;
        }
        //构造前缀和
        for (int i = 1; i < gradeNums.length; i++) {
            gradeNums[i] = gradeNums[i] + gradeNums[i - 1];
        }


        System.out.println(returnNums(30, 90));
    }

    private static int returnNums(int begin, int end) {
        return gradeNums[end + 1] - gradeNums[begin];
    }


}
