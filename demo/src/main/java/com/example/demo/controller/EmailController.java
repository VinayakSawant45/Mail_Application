package com.example.demo.controller;

import com.example.demo.dto.EmailRequestDto;
import com.example.demo.dto.EmailResponseDto;
import com.example.demo.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmailController {

    @Autowired
    private SendEmailService sendEmailService;

    @PostMapping("/sendEmail")
    public EmailResponseDto sendEmail(@RequestBody EmailRequestDto emailRequestDto) {
        sendEmailService.sendEmail(emailRequestDto);
        return new EmailResponseDto("Send Successfully");
    }
}

