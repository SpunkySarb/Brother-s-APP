package com.example.chating.controller;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.chating.model.MessageContent;
import com.example.chating.model.MessageModel;
import com.google.gson.Gson;

@org.springframework.stereotype.Controller
public class Controller {

    MessageModel duplicate;
    
    
    @RequestMapping("login")
    public String loginPage() {

        return "login.jsp";
    }

    @RequestMapping("dashboard")
    public ModelAndView dashboard() throws IOException {
        ModelAndView mv = new ModelAndView("dashboard.jsp");
        URL url = null;
        url = new URL("https://brothers007.herokuapp.com/read");
        Gson json = new Gson();
try {
        Reader reader = new InputStreamReader(url.openStream());

        MessageModel obj = json.fromJson(reader, MessageModel.class);
        duplicate = obj;
        String messageData = "";

        for (MessageContent x : obj.getMessageModel()) {

            messageData = messageData + "<br>\n" + "<div id=\"posts\" >\n" + "\n"
                    + " <img src=\"profile.png\"  width=\"50\" height=\"50\"> <br>\n" + " <span id=\"userName\">  "
                    + x.getName() + " </span><br>\n" + "<span id=\"text\"> " + x.getMessage() + " </span>\n" + "\n"
                    + "\n" + "<br><br>"+x.getTimestamp()+"</div>";

        }

        
        mv.addObject("messages", messageData);
}catch(Exception e) {
    
    mv = new ModelAndView("error.jsp");
}
        return mv;
    }
    
    
    @RequestMapping("send")
    public ModelAndView sendMessage(@RequestParam("name") String name,
            @RequestParam("message") String message) throws IOException {
        
        System.out.println(duplicate.getMessageModel().get(duplicate.getMessageModel().size()-1).getMessage());
        System.out.println(message);
        if(duplicate.getMessageModel().get(duplicate.getMessageModel().size()-1).getMessage().contentEquals(message)==false) {
        
        URL url = null;
        String request =("https://brothers007.herokuapp.com/send?name="+name+"&message="+message).replace(" ", "%20");
        url = new URL(request);
        
        
try {
    java.util.concurrent.TimeUnit.SECONDS.sleep(2);
        Reader reader = new InputStreamReader(url.openStream());
}catch(Exception e) {
    System.out.println(e);
    
}
        }
        ModelAndView mv = new ModelAndView("dashboard.jsp");
        URL url2 = null;
        url2 = new URL("https://brothers007.herokuapp.com/read");
        Gson json = new Gson();
try {
    java.util.concurrent.TimeUnit.SECONDS.sleep(2);

        Reader reader2 = new InputStreamReader(url2.openStream());

        MessageModel obj = json.fromJson(reader2, MessageModel.class);
        duplicate = obj;
        String messageData = "";

        for (MessageContent x : obj.getMessageModel()) {

            messageData = messageData + "<br>\n" + "<div id=\"posts\" >\n" + "\n"
                    + " <img src=\"profile.png\"  width=\"50\" height=\"50\"> <br>\n" + " <span id=\"userName\">  "
                    + x.getName() + " </span><br>\n" + "<span id=\"text\"> " + x.getMessage() + " </span>\n" + "\n"
                    + "\n" + "<br><br>"+x.getTimestamp()+"</div>";

        }

        
        mv.addObject("messages", messageData);
}catch(Exception e) {
    System.out.println(e);
    mv = new ModelAndView("error.jsp");
}
        return mv;
    }
    
        
    
    
    
    
    
}
