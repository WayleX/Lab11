package com.example.task2;


public class MailSender {
    public void sendMail(MailInfo mailInfo){
        System.out.println(mailInfo.generateText());
    }
}
