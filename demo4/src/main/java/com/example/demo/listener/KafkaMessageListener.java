package com.example.demo.listener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageListener {
    @KafkaListener(topics = "transactions", groupId = "spring-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
