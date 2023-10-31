package com.tech.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.filter.RequestContextFilter;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
public class EurekaClientFeignHystrixConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientFeignHystrixConsumerApplication.class, args);
    }

   /* @Bean
    public RequestContextListener requestContextListener(){
        return new RequestContextListener();
    }
*/
  /*  @Bean
    public RequestContextFilter requestContextFilter() {
        RequestContextFilter requestContextFilter = new RequestContextFilter();
        requestContextFilter.setThreadContextInheritable(true);
        return requestContextFilter;
    }*/

}
