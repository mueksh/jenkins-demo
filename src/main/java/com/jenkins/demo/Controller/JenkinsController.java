package com.jenkins.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping("hello-jenkins")
    public String helloWorld(){
        return "Jenkins Hello-World-Program in Spring Boot";

    }
}
