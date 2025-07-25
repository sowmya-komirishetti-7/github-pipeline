package com.example.githubexample.testcontroller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TestController {

    private final MockMvc mockMvc;

    public TestController(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @Test
    void testGreeting() throws Exception {
        mockMvc.perform(get("/api/greet?name=ChatGPT"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, ChatGPT!"));
    }
}
