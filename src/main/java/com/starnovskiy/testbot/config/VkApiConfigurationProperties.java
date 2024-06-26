package com.starnovskiy.testbot.config;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@PropertySource(value = "classpath:vk.properties")
@ConfigurationProperties(prefix = "vk.api")
public class VkApiConfigurationProperties {
    @NonNull
    private String accessToken;
    @NonNull
    private Double v;
    @NonNull
    private String secret;
    @NonNull
    private String confirmation;
}