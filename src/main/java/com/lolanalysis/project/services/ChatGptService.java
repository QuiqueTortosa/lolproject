package com.lolanalysis.project.services;

import com.lolanalysis.project.clients.ChatGptClient;
import com.lolanalysis.project.models.chatGpt.ChatGptRequest;
import com.lolanalysis.project.models.chatGpt.ChatGptResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatGptService {

    private final ChatGptClient chatGptClient;

    @Autowired
    public ChatGptService(ChatGptClient chatGptClient) {
        this.chatGptClient = chatGptClient;
    }

    public ChatGptResponse getChatCompletion(String prompt) {
        ChatGptRequest request = new ChatGptRequest();
        request.setPrompt(prompt);
        request.setMaxTokens(100); // Configura la cantidad de tokens máximos que deseas recibir en la respuesta

        return chatGptClient.getChatCompletion(request);
    }

}
