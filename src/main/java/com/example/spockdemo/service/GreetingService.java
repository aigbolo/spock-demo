package com.example.spockdemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greeting(String name) {
        return "Hello "+name;
    }
}
