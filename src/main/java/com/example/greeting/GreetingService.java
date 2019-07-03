package com.example.greeting;

import org.springframework.stereotype.Service;

/**
 * GreetingService
 */
@Service
public class GreetingService {

    public Greeting helloGreeting(String name) {
        return new Greeting("Hello", name);
    }
}