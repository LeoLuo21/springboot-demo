package com.feng.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

class LoginControllerTest {

    @Resource
    private WebApplicationContext wac ;

    @Resource
    private MockMvc mockMvc;

    @Test
    void login() {

    }
}