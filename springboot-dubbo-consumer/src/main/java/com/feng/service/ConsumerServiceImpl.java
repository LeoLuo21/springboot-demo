package com.feng.service;

import com.feng.bean.User;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @DubboReference
    private UserService userService;

    @Override
    public User getUserById(int id) {
        return userService.getById(id);
    }
}
