package com.example.ragchatbot.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.IOException;

import com.example.ragchatbot.service.EmbeddingService;
import com.example.ragchatbot.service.ChatService;

@RestController
@RequestMapping("/api")
public class RAGController {

    @Autowired
    private EmbeddingService embeddingService;

    @Autowired
    private ChatService chatService;

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        return embeddingService.processFile(file);
    }

    @PostMapping("/chat")
    public String chat(@RequestBody String prompt) {
        return chatService.getResponse(prompt);
    }
}
