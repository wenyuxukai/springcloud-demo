package com.tech.springcloud.controller;

import org.apache.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(@RequestParam String token){

        return "feign服务者2"+token;
    }
    @RequestMapping("/test02")
    public String test02(){

       // System.out.println(1/0);
        return "feign02服务者2";
    }

}
