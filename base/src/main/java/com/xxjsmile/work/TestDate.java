package com.xxjsmile.work;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2021-09-13 11:13
 **/
public class TestDate {

    public static void main(String[] args) throws ParseException {
        /*long maxDayToExpire =4L;
        System.out.println(maxDayToExpire>3);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Long l = (new Date().getTime() -simpleDateFormat.parse("2021-09-14 12:07:23").getTime() ) / 1000 / 3600 / 24;
        System.out.println(l);

        if(12l==13l){}*/
        String x = "吃饭X天Z个".replace("X", "1").replace("Z","2").replace("M","q");
        System.out.println(x);

        System.out.println(new Integer(2).compareTo(new Integer(3)));


        System.out.println("您已失去轻课会员权益${passMemberDays}天".replace("${passMemberDays}", 12+""));

    }
}
