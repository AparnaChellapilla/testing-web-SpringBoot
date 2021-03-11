package com.tts.testingwebSpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {


    public String greet() {
        return "Hello,World";
    }
}
