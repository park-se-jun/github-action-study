package com.example.githubactionstudy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.env}")
    private String envTestStr;
    @GetMapping
    public String testing(){
        return envTestStr;
    }
}
