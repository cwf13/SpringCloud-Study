package com.example.mycontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        System.out.println("第二个服务客户端66666666");
        return name + ",Hello World";
    }

    @RequestMapping("/index")
    public String e() {
        return "9999999999";
    }
}

