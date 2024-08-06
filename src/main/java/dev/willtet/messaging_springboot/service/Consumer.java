package dev.willtet.messaging_springboot.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "topic", groupId = "group-1")
    public void receiveMessage(String message){
        System.out.println("Consumer Message: " + message);
    }
}
