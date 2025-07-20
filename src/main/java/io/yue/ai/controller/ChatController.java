package io.yue.ai.controller;

import io.yue.ai.invoke.ChatLove;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ChatController {
    @Resource
    private ChatLove chatLove;

    @GetMapping("/love")
    public String getLoveMessage(@RequestParam String id, @RequestParam String message) {
        String res = chatLove.doChat(message, id);
        return res;
    }
}
