package com.tech.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.tech.springcloud.service.TestService;
import org.apache.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {

    @Resource
    public TestService testService;

    @RequestMapping("/test")
    @HystrixCommand
    public String test(@RequestParam String token){
        try{
            String str = testService.test(token);
            return "test="+str;
        }catch (Exception e){
            return e.getMessage();
        }

    }
    @RequestMapping("/test02")
    @HystrixCommand(fallbackMethod = "error")
    public String test02(){

        String str = testService.test02();
        return "test=02"+str;
    }
    public String error(Throwable throwable){
        return "错误:"+throwable.getMessage();
    }
}
