package com.example.springcloudribbonconsumer3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan(basePackages = {"com.example"})
public class SpringcloudRibbonConsumer3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudRibbonConsumer3Application.class, args);
        System.out.println("ribbon第三个消费者服务启动...");
    }

}
