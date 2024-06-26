package com.starnovskiy.testbot.service.impl;

import com.starnovskiy.testbot.model.Message;
import com.starnovskiy.testbot.service.CallbackBotService;
import com.starnovskiy.testbot.service.MessageSenderService;

import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CallbackBotServiceImpl implements CallbackBotService {

    private final MessageSenderService<Message> messageSenderService;

    @Override
    public String createCallbackMessage(Message message){

        Gson gson = new Gson();
        Message callbackMessage = Message.builder()
                .userId(1L)
                .randomId(0L)
                .peerId(message.getPeerId())
                .peerIds(message.getPeerIds())
                .domain(message.getDomain())
                .chatId(message.getChatId())
                .userIds(message.getUserIds())
                .text("Вы сказали: " + message.getText())
                .guid(message.getGuid())
                .lat(message.getLat())
                .longField(message.getLongField())
                .attachment(message.getAttachment())
                .replyTo(message.getUserId())
                .forwardMessages(message.getForwardMessages())
                .stickerId(message.getStickerId())
                .groupId(message.getGroupId())
                .keyboard(message.getKeyboard())
                .template(message.getTemplate())
                .payload(message.getPayload())
                .contentSource(message.getContentSource())
                .dontParseLinks(1)
                .disableMentions(message.getDisableMentions())
                .intent(message.getIntent())
                .subscribeId(message.getSubscribeId())
                .build();

        messageSenderService.send(callbackMessage);
        return gson.toJson(callbackMessage);
    }



}
