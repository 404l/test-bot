package com.starnovskiy.testbot.controller;

import com.starnovskiy.testbot.model.Message;
import com.starnovskiy.testbot.service.CallbackBotService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class CallbackBotController {

    private final CallbackBotService callbackBotService;

    @PostMapping("/callback")
    ResponseEntity<String> createResponse(@RequestBody Message message) {
        return new ResponseEntity<>(callbackBotService.createCallbackMessage(message), HttpStatus.OK) ;
    }
}
