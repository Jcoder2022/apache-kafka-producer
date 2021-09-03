package com.jcoder.kafka.controller;

import com.jcoder.kafka.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProduceComplexObjectController {

    @Autowired
    private KafkaTemplate<String,Book> kafkaTemplate;

    //let us create topic

    private static final String TOPIC = "ComplexObjectTopic";


    @PostMapping("/book")
    public String publishMessage(@RequestBody Book book){

        kafkaTemplate.send(TOPIC,book);
        return "Published Successfully!";
    }



}
