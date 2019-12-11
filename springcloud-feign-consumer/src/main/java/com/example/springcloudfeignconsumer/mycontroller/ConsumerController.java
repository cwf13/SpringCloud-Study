package com.example.springcloudfeignconsumer.mycontroller;


import com.example.springcloudfeignconsumer.myInteface.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        System.out.println("接受到请求参数:" + name + ",进行转发到其他服务");
        return helloRemote.hello(name);
    }


}
