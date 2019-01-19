package com.sunbuck.cloud.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.converters.Auto;
import com.sunbuck.cloud.dao.UserRepository;
import com.sunbuck.cloud.model.User;
import org.omg.CORBA.ServiceInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sunbuck on 2017/4/25.
 */
/*
* @RestController相当于@Controller和@Response两个注解
* */

@RestController
@EnableDiscoveryClient
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("eureka-instance")
    public String serivceUrl(){
        //MICROSERVICE-PROVIDER-USER就是我们在yml文件中指定的服务Name
        InstanceInfo instance = eurekaClient.getNextServerFromEureka("MICROSERVICE-PROVIDER-USER",false);
        return instance.getHomePageUrl();
    }

    //@GetMapping相当于@RequestMapping(value = "simple/{id}",method = RequestMethod.GET)
    //@PostMapping相当于@PostMapping(value = "simple/{id}",method = RequestMethod.POST)
    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id){
        return userRepository.findOne(id);
    }
}
