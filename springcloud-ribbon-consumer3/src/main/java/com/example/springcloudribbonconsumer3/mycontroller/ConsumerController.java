package com.example.springcloudribbonconsumer3.mycontroller;


import com.example.springcloudribbonconsumer3.myInteface.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        System.out.println("接受到请求参数:" + name + ",ribbon第三个消费者，进行转发到其他服务");
        return "接受到请求参数:" + name + ",ribbon第三个消费者，进行转发到其他服务";
    }

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        System.out.println("第三个服务hi客户端66666666");
        return name + ",Hello World";
    }


}
