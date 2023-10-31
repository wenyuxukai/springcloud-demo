package com.tech.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerFeign2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerFeign2Application.class, args);
    }

}
