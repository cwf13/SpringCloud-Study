package com.example.springcloudfeignconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringcloudFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeignConsumerApplication.class, args);
        System.out.println("feign第一个消费者服务启动...");
    }

}
