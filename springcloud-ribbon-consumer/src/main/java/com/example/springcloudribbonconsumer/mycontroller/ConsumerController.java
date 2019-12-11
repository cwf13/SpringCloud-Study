package com.example.springcloudribbonconsumer.mycontroller;

import com.example.springcloudribbonconsumer.myInteface.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello1")
    public String hello() {
        //进行远程调用
        return restTemplate.getForObject("http://springcloud-ribbon-consumer2/hello/xuwujing", String.class);
    }

    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        System.out.println("接受到请求参数:" + name + ",进行转发到其他服务!");
        return helloRemote.hello(name);
    }
}