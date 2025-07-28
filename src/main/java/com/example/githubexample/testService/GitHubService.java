package com.example.githubexample.testService;

import org.springframework.stereotype.Service;

@Service
public class GitHubService {

    public String greet(String name) {
            return "Hello, " + name;
        }

}
