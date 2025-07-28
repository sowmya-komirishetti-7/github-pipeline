package com.example.githubexample.testcontroller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TestController.class)
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
