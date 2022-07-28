package com.feng.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

@SpringBootTest
//@ExtendWith(SpringExtension.class)
class PersonServiceTest {

    @Resource
    private PersonService personService;

    @Test
    public void testService() {
        System.out.println(personService);
        if (personService == null) return;
        personService.findById(1);

    }
}