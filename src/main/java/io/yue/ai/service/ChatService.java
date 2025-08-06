package io.yue.ai.service;

import io.yue.ai.entity.LoveReport;
import io.yue.ai.service.impl.ChatServiceImpl;
import reactor.core.publisher.Flux;

public interface ChatService {
    String doChat(String message, String chatId);
    Flux<String> doChatByStream(String message, String chatId);
    LoveReport doChatWithReport(String message, String chatId);
    String doChatWithLocalRag(String message, String chatId);
    String doChatWithCloudRag(String message, String chatId);
    String doChatWithTools(String message, String chatId);
    String doChatWithMcp(String message, String chatId);
}
