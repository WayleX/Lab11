package com.example.task2;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MailBox {
    ArrayList<MailInfo> infos;
    MailSender sender;
    public void AddMailInfo(MailInfo mailinfo){
        infos.add(mailinfo);
    }
    public void SendAll(){
        for (int i = 0; i < infos.size(); i++){
            sender.sendMail(infos.get(i));
        }
    }
}
