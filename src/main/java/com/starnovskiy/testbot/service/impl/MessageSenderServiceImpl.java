package com.starnovskiy.testbot.service.impl;

import com.starnovskiy.testbot.exception.MessageSenderException;
import com.starnovskiy.testbot.model.Message;
import com.starnovskiy.testbot.model.ResponseSendMessage;
import com.starnovskiy.testbot.service.MessageSenderService;
import com.starnovskiy.testbot.config.VkUriCreator;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class MessageSenderServiceImpl implements MessageSenderService<Message> {

    private final VkUriCreator vkUriCreator;
    private final RestTemplate restTemplate;

    @Override
    public void send(Message message) {

        URI uri = vkUriCreator.createUri(message);
        ResponseEntity<ResponseSendMessage> responseEntity = restTemplate.postForEntity(uri, null, ResponseSendMessage.class);
        validateResponse(responseEntity);
    }

    private void validateResponse(ResponseEntity<ResponseSendMessage> responseEntity) {
        ResponseSendMessage.ResponseSendError error = Objects.requireNonNull(responseEntity.getBody()).getError();
        if (error != null && error.getErrorCode() != null) {
            throw new MessageSenderException(error.getErrorMsg());
        }
    }
}