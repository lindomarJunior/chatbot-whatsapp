package com.lindomar.chatbotwhatsapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
public class MessageController {

    @GetMapping
    public String testar() {
        return "Helllo world";
    }
}
