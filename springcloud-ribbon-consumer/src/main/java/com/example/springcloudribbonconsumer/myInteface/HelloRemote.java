package com.example.springcloudribbonconsumer.myInteface;

import com.example.springcloudribbonconsumer.myInterfaceImpl.HelloRemoteImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//负载均衡/转发服务
//@FeignClient(name= "springcloud-ribbon-consumer2")

//加入Hystrix机制 实现接口,友好提示


@FeignClient(name = "springcloud-ribbon-consumer2", fallback = HelloRemoteImpl.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello/{name}")
    public String hello(@PathVariable("name") String name);
}
