package com.gj.controller;

import com.gj.domain.User;
import com.gj.repository.UserRepository;
import com.gj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

        @Autowired
        private UserService userService;

        @GetMapping("/getUserById/{id}")
        public User getUserById(@PathVariable Integer id){
            User user =  userService.findOne(id);
            return user;
        }
}
