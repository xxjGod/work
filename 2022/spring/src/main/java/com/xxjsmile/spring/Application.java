package com.xxjsmile.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        //ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext${xxjsmile}.xml");
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object person = ac.getBean("person");
        System.out.println(person);


    }

}
