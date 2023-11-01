package com.tech.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@Component
public class AuthFilter implements GlobalFilter, Ordered {

    @Autowired
    private AuthMapper authMapper;
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        List<Map<String,Object>> list = authMapper.queryInfo();
        System.out.println(list);

        String token = exchange.getRequest().getQueryParams().getFirst("token");
        if(token == null){
            HttpHeaders headers = exchange.getRequest().getHeaders();
            token =  headers.getFirst("token");
        }

        if(token != null &&"123".equals(token)){

            System.out.println("通过");
        }else{

            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();

        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 1;
    }

}
