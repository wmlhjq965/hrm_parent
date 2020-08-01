package com.wl.hrm;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.wl.hrm.mapper")
public class HrmCourseServer9002Application {
    public static void main(String[] args) {
        SpringApplication.run(HrmCourseServer9002Application.class,args);
    }
}
