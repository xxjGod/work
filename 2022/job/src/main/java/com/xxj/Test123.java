package com.xxj;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2022-01-05 17:19
 **/
public class Test123 {

    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("365");
        BigDecimal bigDecimal2 = new BigDecimal("365");
        System.out.println(bigDecimal1.equals(bigDecimal2));
        System.out.println(bigDecimal1.compareTo(bigDecimal2));

    }
}
