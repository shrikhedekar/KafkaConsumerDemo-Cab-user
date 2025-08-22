package com.kafkademo.cab_user_app.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "CabLocation", groupId = "user-group")
    public void cabLocation(String location) {
        System.out.println(location);
    }
}
