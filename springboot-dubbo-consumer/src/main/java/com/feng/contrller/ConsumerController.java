package com.feng.contrller;

import com.feng.bean.User;
import com.feng.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/")
    public String getUserbyId(@RequestParam int id) {
        User user = consumerService.getUserById(id);
        return "found user: "+ user;
    }
}
