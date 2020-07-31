package com.wl.hrm;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication//开启springboot
@EnableZuulProxy//zull注解
public class ZuulServer9527Application {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServer9527Application.class,args);
    }
}
