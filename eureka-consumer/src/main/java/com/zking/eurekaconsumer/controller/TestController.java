package com.zking.eurekaconsumer.controller;

import com.zking.eurekaconsumer.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private HelloFeignService helloFeignService;
    @RequestMapping("/test")
    private String test(){
        return helloFeignService.hello();
    }
}
