package com.example.sampleProject.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin(origins = { "http://frontend-sample-project-dl-f73-sandbox.apps.ocp3.eu-west-1.stable.aws.vwdl.de/", "http://frontend-sample-project-dl-f73-sandbox.apps.ocp3.eu-west-1.stable.aws.vwdl.de" })
public class StatelessController {
    @GetMapping("/info")
    public String getInfo() {
        return "This is an sample Project V2";
    }
}
