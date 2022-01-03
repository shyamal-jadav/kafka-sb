package com.example.kafka.kafkaconsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    private final Logger logger = LoggerFactory.getLogger(Consumer.class.getName());

    @KafkaListener(topics = "commentary")
    public void consume(String msg) {
        logger.info(String.format("->> %s", msg));
    }
}
