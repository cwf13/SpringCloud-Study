package com.example.springcloudribbonconsumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan(basePackages = {"com.example"})
public class SpringcloudRibbonConsumer2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudRibbonConsumer2Application.class, args);
        System.out.println("ribbon第二个消费者服务启动...");
    }

}
