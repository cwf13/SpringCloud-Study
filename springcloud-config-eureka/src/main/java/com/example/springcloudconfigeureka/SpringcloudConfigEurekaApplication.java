package com.example.springcloudconfigeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudConfigEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigEurekaApplication.class, args);
        System.out.println("config服务端启动成功!");
    }

}
