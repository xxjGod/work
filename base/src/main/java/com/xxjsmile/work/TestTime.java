package com.xxjsmile.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: test
 * @author: xiangjie.xiao
 * @create: 2021-11-25 11:11
 **/
public class TestTime {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) throws ParseException {
        Date begin1 = simpleDateFormat.parse("2021-09-10 12:22:01");

        Date end1 = simpleDateFormat.parse("2021-10-10 12:22:01");

        Date begin2 = simpleDateFormat.parse("2021-10-09 12:22:01");

        Date end2 = simpleDateFormat.parse("2022-03-10 12:22:01");
    }
}
