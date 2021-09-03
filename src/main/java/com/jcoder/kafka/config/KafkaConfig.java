package com.jcoder.kafka.config;

import com.jcoder.kafka.entity.Book;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration  //We want this to start at the loading time of spring boot application
public class KafkaConfig {
    // we need to add ProducerFactory that will accept type String and pass a Book Object

    @Bean //Here we need to do the configuration for producer factory, producerFactory will be used to create our kafkaTemplate
    public ProducerFactory<String, Book> producerFactory(){
        Map<String,Object> config = new HashMap<>();

        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"127.0.0.1:9092"); // need to provide type of key and value
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

        return new DefaultKafkaProducerFactory<>(config);

    }

    //Let us create KafkaTemplate that will use default kafka Producer Factory

    @Bean
    public KafkaTemplate kafkaTemplate(){
        return new KafkaTemplate<>(producerFactory());
    }

}
