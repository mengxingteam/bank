package com.zking.eurekaprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "您好，我是生产者今天为大家介绍zuul"+System.currentTimeMillis();
    }
}
