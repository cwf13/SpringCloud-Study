package com.example.springcloudribbonconsumer.myInterfaceImpl;

import com.example.springcloudribbonconsumer.myInteface.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteImpl implements HelloRemote {
    @Override
    public String hello(@PathVariable(value = "name") String name) {
        System.out.println("88888888");
        return name + ", 请求另一个服务失败!";
    }
}
