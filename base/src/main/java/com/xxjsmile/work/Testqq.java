package com.xxjsmile.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2021-09-08 18:31
 **/
public class Testqq {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {

        List<String> datas = Arrays.asList("2021-07-03", "2021-07-04"
                , "2021-07-05", "2021-07-06", "2021-07-07"
                , "2021-07-08", "2021-07-09", "2021-07-10", "2021-07-11", "2021-07-12", "2021-07-13", "2021-07-14", "2021-07-15",
                "2021-07-16", "2021-07-17", "2021-07-18", "2021-07-19", "2021-07-20", "2021-07-21", "2021-07-22", "2021-07-23", "2021-07-24", "2021-07-25",
                "2021-07-26", "2021-07-27", "2021-07-28", "2021-07-29", "2021-07-30", "2021-07-31",
                "2021-08-01", "2021-08-02", "2021-08-03", "2021-08-03", "2021-08-04", "2021-08-05", "2021-08-06", "2021-08-07", "2021-08-08", "2021-08-09", "2021-08-10", "2021-08-11", "2021-08-12", "2021-08-13"
                , "2021-08-14", "2021-08-15", "2021-08-16", "2021-08-17", "2021-08-18", "2021-08-19", "2021-08-20", "2021-08-21", "2021-08-22", "2021-08-23", "2021-08-24", "2021-08-25", "2021-08-26",
                "2021-08-27", "2021-08-28", "2021-08-29", "2021-08-29", "2021-08-30");


        List<Date> dateList = datas.stream().map(t -> {
            try {
                return simpleDateFormat.parse(t);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return null;
        }).collect(Collectors.toList());
        System.out.println(maxContinuityNum(dateList));

    }

    private static Integer maxContinuityNum(List<Date> dates) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < dates.size(); i++) {
                Date currentItem = dates.get(i);
                if (i == 0) {
                    sb.append("1");
                } else {
                    Date prevItem = dates.get(i - 1);
                    if (currentItem.compareTo(prevItem) != 0) {
                        sb.append("1");
                    }
                }
                //如果到最后一项了那下一项就是当前项了
                Date nextItem = (i + 1) == dates.size() ? currentItem : dates.get(i + 1);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(currentItem);
                calendar.add(Calendar.DATE, 1);
                Date nextDay = calendar.getTime();
                // 如果nextDay不等于nextItem, 代表签到中断, 拿 0 补位 (中断多少天其实咱们不关心)
                if (currentItem.compareTo(nextItem) != 0 && nextItem.compareTo(nextDay) != 0 && i < dates.size() - 1) {
                    sb.append("0");
                }
            }
            return Arrays.stream(sb.toString().split("0")).max(Comparator.naturalOrder()).get().length();
        } catch (Exception e) {
            return 0;
        }
    }
}
