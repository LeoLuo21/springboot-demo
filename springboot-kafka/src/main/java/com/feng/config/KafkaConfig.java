package com.feng.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;

import java.util.List;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic initialTopic() {
        return new NewTopic("topic1",2,(short) 1);
    }

    @Bean
    public NewTopic updateTopic() {
        return new NewTopic("topic2",2,(short) 1);
    }

    @Bean
    public ConsumerAwareListenerErrorHandler consumerAwareErrorHandler() {
        return ((message, e, consumer) -> {
            System.out.println("消费异常："+message.getPayload());
            return e.getMessage();
        });
    }
}
