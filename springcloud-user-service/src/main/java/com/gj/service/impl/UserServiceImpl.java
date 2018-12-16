package com.gj.service.impl;

import com.gj.domain.User;
import com.gj.repository.UserRepository;
import com.gj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findOne(Integer id) {
        return userRepository.findOne(id);
    }
}
