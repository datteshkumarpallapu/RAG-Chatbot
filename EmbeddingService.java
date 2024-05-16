package com.example.ragchatbot.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import io.zilliz.milvus.client.MilvusClient;
import io.zilliz.milvus.client.MilvusServiceClient;

@Service
public class EmbeddingService {

    private MilvusClient milvusClient;

    public EmbeddingService() {
        milvusClient = new MilvusServiceClient();
    }

    public String processFile(MultipartFile file) {
       
        return "File processed and embeddings stored.";
    }

    private List<float[]> generateEmbeddings(String text) {
        
        return List.of(new float[]{0.0f}); 
    }
}

