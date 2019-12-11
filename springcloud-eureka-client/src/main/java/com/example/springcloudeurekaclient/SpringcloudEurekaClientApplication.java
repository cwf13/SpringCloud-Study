package com.example.springcloudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaClientApplication.class, args);
        System.out.println("客户端服务启动...");
    }

}
