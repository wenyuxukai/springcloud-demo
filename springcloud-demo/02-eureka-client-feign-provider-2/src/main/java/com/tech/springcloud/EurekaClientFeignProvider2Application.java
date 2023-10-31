package com.tech.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientFeignProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientFeignProvider2Application.class, args);
    }

}
