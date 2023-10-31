package com.tech.springcloud.service;

import com.tech.springcloud.conf.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "04-eureka-client-feign-spring-gateway/api-gateway",configuration = FeignConfiguration.class
        , fallbackFactory = DoService.class)
public interface TestService {

    @RequestMapping("/test")
    public String test(@RequestParam(value = "token") String token);
    @RequestMapping("/test02")
    public String test02();
}
