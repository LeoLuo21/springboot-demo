package com.feng.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RabbitListener(queues = "TestDirectQueue")
public class DirectReceiver2 {
    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("DirectReceiver(2)消费者收到消息  : " + testMessage.toString());
    }
}
