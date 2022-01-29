package com.xxj.jvm;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2022-01-25 11:07
 **/
public class StackErrorMock {

    private static int index = 1;

    public void call() {
        index++;
        call();
    }

    public static void main(String[] args) {
        StackErrorMock mock = new StackErrorMock();
        try {
            mock.call();
        } catch (Throwable e) {
            System.out.println("Stack deep : " + index);
            e.printStackTrace();
        }
    }
}
