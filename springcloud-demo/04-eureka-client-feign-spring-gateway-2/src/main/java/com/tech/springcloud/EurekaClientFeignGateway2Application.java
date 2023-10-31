package com.tech.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientFeignGateway2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientFeignGateway2Application.class, args);
    }

}
