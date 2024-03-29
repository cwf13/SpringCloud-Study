package com.example.springcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServerApplication.class, args);
        System.out.println("注册中心服务启动...");
    }

}
