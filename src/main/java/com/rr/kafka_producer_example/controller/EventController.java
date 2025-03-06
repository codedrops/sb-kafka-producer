package com.rr.kafka_producer_example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rr.kafka_producer_example.service.KafkaMessagePublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/producer-app")
public class EventController {

    @Autowired
    private KafkaMessagePublisher kafkaMessagePublisher;


    @GetMapping("/publish/{message}")
    public ResponseEntity<?> publishMessage(@PathVariable String message) {
        try {
            kafkaMessagePublisher.publishMessage(message);
            return ResponseEntity.ok("Message published successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error publishing message");
        }
    }
}
