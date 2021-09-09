package com.xxjsmile.arithmetic;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2021-09-08 15:49
 **/
public class FirstBadVersion {
    public static void main(String[] args) {

    }

    public static int firstBadVersion(int n) {
        int begin = 1;
        int end = n;

        while (begin < end) {
            int mid = begin + (end - begin) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                begin = mid + 1;
            }
        }
        return end;
    }

    public static boolean isBadVersion(int version) {

        return false;
    }


}
