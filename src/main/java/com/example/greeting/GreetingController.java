package com.example.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * GreetingController
 */
@Controller
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return greetingService.helloGreeting("Moises").toString();
    }
}