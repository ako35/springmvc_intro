package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.FileRepository;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mailService")
@Scope("prototype")
public class MailService implements MessageService{

    // Field Injection
//    @Autowired  // dependency injection
//    @Qualifier("fileRepository")
//    private Repository repository;

    //Setter Injection
//    private Repository repository;
//
//    @Autowired
//    @Qualifier("fileRepository")
//    public void setRepository(Repository repository) {
//        this.repository = repository;
//    }

    // Constructor Injection
    private Repository repository;

    @Autowired
    public MailService(@Qualifier("fileRepository") Repository repository) {
        this.repository = repository;
    }

    @Override
    public void sendMessage(Message message) {
        System.out.println("ben mail servisiyim, size mesaj gonderiyorum: "+message.getMessage());
        repository.saveMessage(message);
    }
}
