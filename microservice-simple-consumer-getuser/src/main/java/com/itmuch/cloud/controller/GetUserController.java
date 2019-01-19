package com.itmuch.cloud.controller;

import com.itmuch.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Samuel on 2017/7/5.
 */
@RestController
public class GetUserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/getuser/{id}")
    public User findById(@PathVariable Long id){
        return this.restTemplate.getForObject("http://localhost:7900/simple/"+id, User.class);
    }
}
