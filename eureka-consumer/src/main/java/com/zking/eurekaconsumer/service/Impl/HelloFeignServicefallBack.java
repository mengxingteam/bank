package com.zking.eurekaconsumer.service.Impl;

import com.zking.eurekaconsumer.service.HelloFeignService;
import org.springframework.stereotype.Component;

@Component
public class HelloFeignServicefallBack implements HelloFeignService {
    @Override
    public String hello() {
        return "系统繁忙，稍后再试";
    }
}
