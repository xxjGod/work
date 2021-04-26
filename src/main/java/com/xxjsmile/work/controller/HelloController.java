package com.xxjsmile.work.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/4/26 18:38
 * All Rights Reserved
 */

@RestController
@RequestMapping("/helloController")
public class HelloController {


    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return "hello world";
    }
}
