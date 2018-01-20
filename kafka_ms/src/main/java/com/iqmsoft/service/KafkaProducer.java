package com.iqmsoft.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    
    @Value("${api.kafka.topic}")
    String kafkaTopic = "api-kafka-topic";
    
    public void send(String data) {
        log.info("sending data='{}'", data);
        kafkaTemplate.send(kafkaTopic, data);
    }

}