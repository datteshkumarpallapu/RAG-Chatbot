package com.example.ragchatbot.service;

import org.springframework.stereotype.Service;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.OpenAiService;

@Service
public class ChatService {

    private OpenAiService openAiService;

    public ChatService() {
        openAiService = new OpenAiService("your-openai-api-key");
    }

    public String getResponse(String prompt) {
        CompletionRequest completionRequest = CompletionRequest.builder()
            .prompt(prompt)
            .model("text-davinci-003")
            .maxTokens(150)
            .build();
        return openAiService.createCompletion(completionRequest).getChoices().get(0).getText();
    }
}
