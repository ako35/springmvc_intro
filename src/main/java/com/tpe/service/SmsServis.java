package com.tpe.service;

import com.tpe.domain.Message;
import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsServis implements MessageService{
    @Override
    public void sendMessage(Message message) {
        System.out.println("ben sms servisiyim, size mesaj gonderiyorum: "+message.getMessage());
    }
}
