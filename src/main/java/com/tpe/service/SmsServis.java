package com.tpe.service;

import com.tpe.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component("smsService")
public class SmsServis implements MessageService {

    @Autowired
    private Properties properties;

    @Override
    public void sendMessage(Message message) {
        System.out.println("ben sms servisiyim, size mesaj gonderiyorum: " + message.getMessage());
        System.out.println("Email: " + properties.get("email"));
        System.out.println("JAVA_HOME: " + properties.get("MYJAVA_HOME"));
    }
}
