package com.wl.hrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication//开启springboot
@EnableEurekaClient
@MapperScan("com.wl.hrm.mapper")
public class HrmManagementServer9001Application {
    public static void main(String[] args) {
        SpringApplication.run(HrmManagementServer9001Application.class,args);
    }
}
