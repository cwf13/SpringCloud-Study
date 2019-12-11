package com.example.springcloudribbonconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrixDashboard//EnableHystrixDashboard:启用 HystrixDashboard 断路器看板 相关配置。
@EnableCircuitBreaker//EnableCircuitBreaker:表示启用hystrix功能。
@EnableFeignClients
@ComponentScan(basePackages = {"com.example"})
public class SpringcloudRibbonConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudRibbonConsumerApplication.class, args);
        System.out.println("ribbon第一个消费者服务启动...");
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
