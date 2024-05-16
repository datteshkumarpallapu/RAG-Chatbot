package com.example.ragchatbot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.theokanning.openai.OpenAiService;

@Configuration
public class OpenAiConfig {

    @Bean
    public OpenAiService openAiService() {
        return new OpenAiService("your-openai-api-key");
    }
}

