package com.jcoder.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduceComplexObjectController {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    //let us create topic

    private static final String TOPIC = "ComplexObjectTopic";






}
