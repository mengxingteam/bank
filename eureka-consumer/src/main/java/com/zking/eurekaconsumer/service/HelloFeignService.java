package com.zking.eurekaconsumer.service;

import com.zking.eurekaconsumer.service.Impl.HelloFeignServicefallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(value = "eureka-provider",fallback = HelloFeignServicefallBack.class)
public interface HelloFeignService {
    @RequestMapping("/hello")
    String hello();
}
