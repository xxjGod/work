package com.xxjsmile.innerclass;

/**
 * @Author: xiaoxiangjie
 * @Description:
 * @Date: 2021/8/1
 */
public class Outer {

    private static int i = 1;
    private int j = 10;
    private int k = 20;

    public static void outer_f1() {
    }

    public void outer_f2() {
        System.out.println(Outer.this.j);
    }

    class Inner {
        //static int inner_i = 100;
        int j = 100;



        void inner_f1() {
            System.out.println(i);

            System.out.println(j);

            System.out.println(this.j);

            System.out.println(Outer.this.j);

            System.out.println(k);
            outer_f1();
            outer_f2();
        }
    }

    public void outer_f3() {
        Inner inner = new Inner();
        inner.inner_f1();
    }


    public static void outer_f4() {

        Outer out = new Outer();

        Inner inner = out.new Inner();

        inner.inner_f1();
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner outin = out.new Inner();
        outin.inner_f1();
    }
}


