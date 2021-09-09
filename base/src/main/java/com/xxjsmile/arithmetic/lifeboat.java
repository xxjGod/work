package com.xxjsmile.arithmetic;

import java.util.Arrays;

/**
 * @description: 救生艇 881
 * @author: xiangjie.xiao
 * @create: 2021-08-26 14:37
 **/
public class lifeboat {


    public static void main(String[] args) {
        int[] people = {1, 1, 2, 2, 3, 4, 1};
        int limit = 5;
        System.out.println(test(people, limit));
    }

    private static int test(int[] people, int limit) {

        int result = 0 ;
        Arrays.sort(people);
        int first = 0;
        int end = people.length - 1;
        while (first <= end) {
            if(first==end){
                result++;
                break;
            }
            if(people[first]+people[end]<=limit){
                result++;
                first++;
                end --;

            }else {
                result++;
                end --;
            }
        }
        return result;


    }
}
