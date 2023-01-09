package com.tpe.app;

import com.tpe.AppConfiguration;
import com.tpe.domain.Message;
import com.tpe.service.MailService;
import com.tpe.service.MessageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {

    public static void main(String[] args) {

        Message message = new Message();
        message.setMessage("siparisiniz verildi...");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

//        MessageService service = context.getBean(MessageService.class);

        MessageService service= context.getBean("mailService",MessageService.class);
        MessageService service2= context.getBean("mailService",MessageService.class);

        if (service2==service){
            System.out.println("ayni");
        } else System.out.println("farkli");

        service.sendMessage(message);

        context.close(); // programi kapatirken olusan bean leri yok ediyoruz.

    }
}
