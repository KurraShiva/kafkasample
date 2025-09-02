package com.kafkaproj.controller;

import org.springframework.web.bind.annotation.*;

import com.kafkaproj.serv.KafkaProducerService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/kafka")
@Slf4j
public class KafkaController {

    private final KafkaProducerService producerService;

    public KafkaController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/publish")
    public String sendMessage(@RequestParam String topic, @RequestParam String message) {
    	log.info("kafka topic name :{} and the producer message : {} ",topic,message);
        producerService.sendMessage(topic, message);
        return "✅ Message sent to Kafka!";
    }
}



//{"properties": [
//                {
//                  "name": "spring.kafka.consumer.key-serializer",
//                  "type": "java.lang.String",
//                  "description": "A description for 'spring.kafka.consumer.key-serializer'"
//                },
//                {
//                  "name": "spring.kafka.consumer.value-serializer",
//                  "type": "java.lang.String",
//                  "description": "A description for 'spring.kafka.consumer.value-serializer'"
//                }
//              ]}