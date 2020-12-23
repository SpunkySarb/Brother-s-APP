package com.example.chating.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class MessageModel {


    ArrayList<MessageContent> MessageModel = new ArrayList<>();

    public ArrayList<MessageContent> getMessageModel() {
        return MessageModel;
    }

    public void setMessageModel(ArrayList<MessageContent> messageModel) {
        MessageModel = messageModel;
    }

    
    
    
    
    
}
