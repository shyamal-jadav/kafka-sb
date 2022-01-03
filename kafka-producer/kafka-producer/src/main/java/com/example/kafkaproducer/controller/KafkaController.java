package com.example.kafkaproducer.controller;

import com.example.kafkaproducer.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;

    @Autowired
    KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/send")
    public void sendMessageToKafkaTopic(@RequestBody String message) {
        System.out.println(message);
        this.producer.sendMessage("commentary", message);
    }
}
