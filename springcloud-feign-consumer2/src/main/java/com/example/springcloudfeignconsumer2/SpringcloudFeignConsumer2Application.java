package com.example.springcloudfeignconsumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.example"})
public class SpringcloudFeignConsumer2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeignConsumer2Application.class, args);
        System.out.println("feign第二个消费者服务启动...");
    }

}
