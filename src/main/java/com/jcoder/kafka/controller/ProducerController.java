package com.jcoder.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    // To publish message we need to use KafkaTemplate so let us create a KafkaTemplate and pass a topic and message to it

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    //let us create topic

    private static final String TOPIC = "FirstTopic";

    @GetMapping("/publish/{message}")
    public String publishMessage(@PathVariable("message") final  String message){

        kafkaTemplate.send(TOPIC,message);
        return "Published Successfully!";
    }

    //Passing Complex object to Topic i.e json, for this we need to create Kafkaconfig

}
