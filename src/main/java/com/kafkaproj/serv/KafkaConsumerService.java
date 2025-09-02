package com.kafkaproj.serv;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "test-topic", groupId = "group1")
    public void listenGroup1(String message) {
        System.out.println("📥 Consumer-Group1 received: " + message);
    }

    @KafkaListener(topics = "test-topic", groupId = "group2")
    public void listenGroup2(String message) {
        System.out.println("📥 Consumer-Group2 received: " + message);
    }
}
