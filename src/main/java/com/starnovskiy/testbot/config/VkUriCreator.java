package com.starnovskiy.testbot.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.starnovskiy.testbot.exception.MessageSenderException;
import com.starnovskiy.testbot.model.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
@RequiredArgsConstructor
public class VkUriCreator {
    private final VkApiConfigurationProperties vkApiProperties;
    private final ObjectMapper objectMapper;

    public URI createUri(Message message) {
        try {
            MultiValueMap<String, String> map = objectMapper.convertValue(message, LinkedMultiValueMap.class);
            return UriComponentsBuilder.fromHttpUrl("https://api.vk.com/method/messages.send")
                    .queryParam("access_token", vkApiProperties.getAccessToken())
                    .queryParam("v", vkApiProperties.getV())
                    .queryParams(map)
                    .build()
                    .toUri();
        } catch (ClassCastException e) {
            throw new MessageSenderException(e);
        }
    }
}