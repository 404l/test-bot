package com.starnovskiy.testbot.service;

import com.starnovskiy.testbot.model.Message;
import org.springframework.stereotype.Service;

@Service
public interface CallbackBotService {

    String createCallbackMessage(Message message);

}
