package com.xxj;

import com.xxj.bean.Person;

import java.io.File;
import java.math.BigDecimal;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2022-01-05 17:19
 **/
public class Test123 {
    static{

        System.out.println("123");

    }

    public static void main(String[] args) {
//        BigDecimal bigDecimal1 = new BigDecimal("365");
//        BigDecimal bigDecimal2 = new BigDecimal("365");
//        System.out.println(bigDecimal1.equals(bigDecimal2));
//        System.out.println(bigDecimal1.compareTo(bigDecimal2));
//        String param = "123456|xxjsmile|nmcv23";
//        String[] split = param.split("\\|");
//        System.out.println(split[0]);
        /*Arrays.asList(1,2,3).stream().forEach(t->{if(t==1){
            return;
        }else {
            System.out.println(t);
        }});*/
//        List<String> str = Arrays.asList("12355", "12");
//        str.stream().filter(e -> e.length() > 3)
//                .peek(e -> {
//                    e = e + "a";
//                });
//        System.out.println(str);

        //System.out.println(File.separator);
        //System.out.println("\\202C");
        //Map<String, Boolean> result = new HashMap<>();
        //System.out.println(result.get("123"));
        List<Person>  list = new ArrayList<>();
        list.add(new Person("xxj"));
        list.add(new Person("xx"));
//        list.stream().forEach(t->{
//            if(t.getName().equals("xxj")){
//                t.setName("jl");
//            }
//
//
//        });
        List<Person> collect = list.stream().peek(t -> {
            if (t.getName().equals("xxj")) {
                t.setName("jl");
            }

        }).collect(Collectors.toList());
        System.out.println(list);

    }
}
