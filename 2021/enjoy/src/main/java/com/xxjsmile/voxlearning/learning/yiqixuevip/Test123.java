package com.xxjsmile.voxlearning.learning.yiqixuevip;

import com.alibaba.fastjson.JSON;
import org.apache.commons.collections.MapUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: 111
 * @author: xiangjie.xiao
 * @create: 2021-08-02 14:12
 **/
public class Test123 {

    public static void main(String[] args) {

       // test123();
        test11();
    }

    private static void test11() {
        System.out.println("上册".compareTo("下册"));
        System.out.println("一年级".compareTo("二年级"));
    }

    private static void test123() {
        List<AiBookMapper> books = new ArrayList<>();
        AiBookMapper aiBook1 = new AiBookMapper();
        aiBook1.setGrade("一年级");
        aiBook1.setVolume("上册");
        aiBook1.setPdfUrl("123.pdf");
        aiBook1.setType("同步版");
        books.add(aiBook1);

        AiBookMapper aiBook2 = new AiBookMapper();
        aiBook2.setGrade("一年级");
        aiBook2.setVolume("上册");
        aiBook2.setPdfUrl("456.pdf");
        aiBook2.setType("基础版");
        books.add(aiBook2);


        AiBookMapper aiBook3 = new AiBookMapper();
        aiBook3.setGrade("一年级");
        aiBook3.setVolume("上册");
        aiBook3.setPdfUrl("789.pdf");
        aiBook3.setType("拔高版");
        books.add(aiBook3);


        AiBookMapper aiBook4 = new AiBookMapper();
        aiBook4.setGrade("一年级");
        aiBook4.setVolume("下册");
        aiBook4.setPdfUrl("123.pdf");
        aiBook4.setType("同步版");
        books.add(aiBook4);

        AiBookMapper aiBook5 = new AiBookMapper();
        aiBook5.setGrade("一年级");
        aiBook5.setVolume("下册");
        aiBook5.setPdfUrl("456.pdf");
        aiBook5.setType("基础版");
        books.add(aiBook5);


        AiBookMapper aiBook6 = new AiBookMapper();
        aiBook6.setGrade("一年级");
        aiBook6.setVolume("下册");
        aiBook6.setPdfUrl("789.pdf");
        aiBook6.setType("拔高版");
        books.add(aiBook6);


        AiBookMapper aiBook7 = new AiBookMapper();
        aiBook7.setGrade("二年级");
        aiBook7.setVolume("上册");
        aiBook7.setPdfUrl("123.pdf");
        aiBook7.setType("同步版");
        books.add(aiBook7);

        AiBookMapper aiBook8 = new AiBookMapper();
        aiBook8.setGrade("二年级");
        aiBook8.setVolume("上册");
        aiBook8.setPdfUrl("456.pdf");
        aiBook8.setType("基础版");
        books.add(aiBook8);


        AiBookMapper aiBook9 = new AiBookMapper();
        aiBook9.setGrade("二年级");
        aiBook9.setVolume("上册");
        aiBook9.setPdfUrl("789.pdf");
        aiBook9.setType("拔高版");
        books.add(aiBook9);


        AiBookMapper aiBook10 = new AiBookMapper();
        aiBook10.setGrade("二年级");
        aiBook10.setVolume("下册");
        aiBook10.setPdfUrl("123.pdf");
        aiBook10.setType("同步版");
        books.add(aiBook10);

        AiBookMapper aiBook11 = new AiBookMapper();
        aiBook11.setGrade("二年级");
        aiBook11.setVolume("下册");
        aiBook11.setPdfUrl("456.pdf");
        aiBook11.setType("基础版");
        books.add(aiBook11);


        AiBookMapper aiBook12 = new AiBookMapper();
        aiBook12.setGrade("二年级");
        aiBook12.setVolume("下册");
        aiBook12.setPdfUrl("789.pdf");
        aiBook12.setType("拔高版");
        books.add(aiBook12);

        Map<String, Map<String, List<AiBookMapper>>> groupMap = books
                .stream()
                .collect(Collectors.groupingBy(AiBookMapper::getGrade, Collectors.groupingBy(AiBookMapper::getVolume)));


        System.out.println(JSON.toJSONString(buildAiBookResponseMapper(groupMap)));
    }

    private static List<AiBookResponseMapper> buildAiBookResponseMapper(Map<String, Map<String, List<AiBookMapper>>> groupMap) {
        if (MapUtils.isEmpty(groupMap)) {
            return Collections.emptyList();
        }
        List<AiBookResponseMapper> aiBookResponseMapperList = new ArrayList<>();

        for (Map.Entry<String, Map<String, List<AiBookMapper>>> gradeEntry :
                groupMap.entrySet()) {
            AiBookResponseMapper aiBookResponseMapper = new AiBookResponseMapper();
            aiBookResponseMapper.setGrade(gradeEntry.getKey());
            Map<String, List<AiBookMapper>> gradeValue = gradeEntry.getValue();

            for (Map.Entry<String, List<AiBookMapper>> volumeEntry :
                    gradeValue.entrySet()) {
                String volumeKey = volumeEntry.getKey();
                if (volumeKey.contains("上")) {
                    //上册
                    aiBookResponseMapper.setOneVolume(volumeEntry.getValue());
                } else {
                    //下册
                    aiBookResponseMapper.setTwoVolume(volumeEntry.getValue());
                }


            }

            aiBookResponseMapperList.add(aiBookResponseMapper);
        }

        return aiBookResponseMapperList;
    }
}
