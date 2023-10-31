package com.tech.springcloud.service;

import feign.hystrix.FallbackFactory;
import org.apache.http.HttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestHeader;

@Component
public class DoService implements FallbackFactory<TestService>{

    /*@Override
    public String test( String token){
        return "test ques";
    }

    @Override
    public String test02(){
        return "test02 ques";
    }*/

    @Override
    public TestService create(Throwable throwable) {
        return new TestService() {
            @Override
            public String test(String token) {
                return "test: "+ throwable.getMessage();
            }

            @Override
            public String test02() {
                return "test02: "+throwable.getMessage();
            }
        };
    }
}
