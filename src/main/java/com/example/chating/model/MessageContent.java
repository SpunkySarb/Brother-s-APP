package com.example.chating.model;

import java.io.Serializable;

public class MessageContent implements Serializable {

    
    private String name, message, timestamp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
     
    
    
    
    
    
    
    
    
}
