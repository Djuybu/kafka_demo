package com.example.demo.controller;

import com.example.demo.kafka.KafkaProducerService;
import com.example.demo.model.Transaction;
import com.example.demo.model.Review;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    private final KafkaProducerService kafkaProducer;
    private final ObjectMapper objectMapper;

    @Autowired
    public ApiController(KafkaProducerService kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
        this.objectMapper = new ObjectMapper();
    }

    @PostMapping("/transactions")
    public ResponseEntity<String> postTransaction(@RequestBody Transaction transaction) throws Exception {
        String json = objectMapper.writeValueAsString(transaction);
        kafkaProducer.send("transactions", json);
        return ResponseEntity.ok("Transaction sent to Kafka");
    }

    @PostMapping("/reviews")
    public ResponseEntity<String> postReview(@RequestBody Review review) throws Exception {
        String json = objectMapper.writeValueAsString(review);
        kafkaProducer.send("reviews", json);
        return ResponseEntity.ok("Review sent to Kafka");
    }
}
