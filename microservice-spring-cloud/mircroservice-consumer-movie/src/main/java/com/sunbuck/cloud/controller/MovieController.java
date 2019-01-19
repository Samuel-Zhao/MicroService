package com.sunbuck.cloud.controller;

import com.sunbuck.cloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Sunbuck on 2017/4/26.
 */

@RestController
public class MovieController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/movie/{id}")
    public User findById(@PathVariable Long id){
        /*
         * 做到服务发现之后就不需要硬性指定ip和端口了,
         * 那样的好处就是,服务提供者是集群模式的时候,只要知道服务名就可以调用,且做到了负载均衡
         * */
        return this.restTemplate.getForObject("localhost:7900/simple/"+id,User.class);
    }
}
