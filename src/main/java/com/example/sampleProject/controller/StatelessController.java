package com.example.sampleProject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatelessController {
    @GetMapping("/info")
    public String getInfo() {
        return "This is an sample Project V2";
    }
}
