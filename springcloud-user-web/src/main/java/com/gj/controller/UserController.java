package com.gj.controller;

import com.gj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getUserById/{id}")
    @ResponseBody
    public User getUserById(@PathVariable Integer id){
        User user = restTemplate.getForObject("http://localhost:8762/user/getUserById/" + id, User.class);
        return user;
    }

}
