package com.starnovskiy.testbot.service;

import org.springframework.stereotype.Service;

@Service
public interface MessageSenderService<T> {

    void send(T message);
}
