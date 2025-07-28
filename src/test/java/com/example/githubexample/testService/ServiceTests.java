package com.example.githubexample.testService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTests {

    private final GitHubService service = new GitHubService();

    @Test
    void testGreet() {
        String result = service.greet("World");
        assertEquals("Hello, Sowmya", result);
    }
}
