package com.example.springcloudribbonconsumer2.mycontroller;


import com.example.springcloudribbonconsumer2.myInteface.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {


    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        System.out.println("接受到请求参数:" + name + ",ribbon第二个消费者，进行转发到其他服务");
        return "接受到请求参数:" + name + ",ribbon第二个消费者，进行转发到其他服务";
    }


}
