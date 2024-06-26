package com.starnovskiy.testbot.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.starnovskiy.testbot.model.Message;
import com.starnovskiy.testbot.service.CallbackBotService;
import com.starnovskiy.testbot.service.MessageSenderService;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CallbackBotServiceImpl implements CallbackBotService {

    private final MessageSenderService<Message> messageSenderService;

    @SneakyThrows
    @Override
    public String createCallbackMessage(Message message) {
        ObjectMapper mapper = new ObjectMapper();

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
                .dontParseLinks(message.getDontParseLinks())
                .disableMentions(message.getDisableMentions())
                .intent(message.getIntent())
                .subscribeId(message.getSubscribeId())
                .build();

        messageSenderService.send(callbackMessage);

        return mapper.writeValueAsString(callbackMessage);
    }

}
