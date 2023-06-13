package com.lolanalysis.project.services;

import com.lolanalysis.project.clients.ChatGptClient;
import com.lolanalysis.project.models.chatGpt.ChatGptRequest;
import com.lolanalysis.project.models.chatGpt.ChatGptResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ChatGptService {

    @Value("${chatgpt.api.key}")
    private String apiKey;

    private final ChatGptClient chatGptClient;

    @Autowired
    public ChatGptService(ChatGptClient chatGptClient) {
        this.chatGptClient = chatGptClient;
    }

    public ChatGptResponse getCompletion(String prompt) {
        ChatGptRequest request = new ChatGptRequest();
        request.setModel("text-ada-001");
        request.setPrompt(prompt);
        request.setMaxTokens(1000); // Configura la cantidad de tokens máximos que deseas recibir en la respuesta

        return chatGptClient.getCompletion(request,apiKey);
    }

}
