package com.lolanalysis.project.clients;

import com.lolanalysis.project.models.chatGpt.ChatGptRequest;
import com.lolanalysis.project.models.chatGpt.ChatGptResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "chatGtp", url = "https://api.openai.com/v1")
public interface ChatGptClient {

    @PostMapping("/completions")
    ChatGptResponse getCompletion(@RequestBody ChatGptRequest request, @RequestHeader(value = "Authorization", required = true) String apiKey);

}
