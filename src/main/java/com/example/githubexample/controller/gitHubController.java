package com.example.githubexample.controller;

import com.example.githubexample.testService.GitHubService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gitHubController {

    private final GitHubService greetingService;

    public gitHubController(GitHubService greetingService) {
        this.greetingService = greetingService;
    }


    // this is the controller layer
    @GetMapping("/gitHub")
    public String greet(@RequestParam(defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/greetings")
    public String greetSer(@RequestParam String name) {
        return greetingService.greet(name);
    }
}
