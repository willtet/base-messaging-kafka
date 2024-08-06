package dev.willtet.messaging_springboot.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    private KafkaTemplate<String, String>  kafkaTemplate;

    public Producer(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;

    }

    public void sendMessage(String message){
        kafkaTemplate.send("topic",message);
    }
}
