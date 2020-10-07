package com.sunny.api.gateway.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ApiGAtewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGAtewayApplication.class, args);
    }

}
