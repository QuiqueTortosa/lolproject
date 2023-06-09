package com.lolanalysis.project.clients;

import com.lolanalysis.project.models.chatGpt.ChatGptRequest;
import com.lolanalysis.project.models.chatGpt.ChatGptResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "chatGtp", url = "https://api.openai.com/v1")
public interface ChatGptClient {

    @PostMapping("/chat/completions")
    ChatGptResponse getChatCompletion(@RequestBody ChatGptRequest request);

}
