package com.example.task2;


import com.example.task2.mailCodeStrategy.MailCode;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode mailcode;

    String generateText(){
        return mailcode.generateText() + ", " + client.getName();
    }
}
