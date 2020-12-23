package com.example.chating.model;

import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class MessageModel implements Serializable {


    ArrayList<MessageContent> MessageModel = new ArrayList<>();

    public ArrayList<MessageContent> getMessageModel() {
        return MessageModel;
    }

    public void setMessageModel(ArrayList<MessageContent> messageModel) {
        MessageModel = messageModel;
    }

    
    
    
    
    
}
