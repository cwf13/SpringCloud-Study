package com.example.springcloudfeignserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan(basePackages = {"com.example"})
public class SpringcloudFeignServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeignServerApplication.class, args);
        System.out.println("feign注册中心服务启动...");
    }

}
