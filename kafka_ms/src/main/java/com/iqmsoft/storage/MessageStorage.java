package com.iqmsoft.storage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MessageStorage {
    
    private List<String> storage = new ArrayList<>();
    
    public void put(String message){
        storage.add(message);
    }
    
    public String toString(){
        StringBuilder info = new StringBuilder();
        storage.forEach(msg->info.append(msg).append("<br/>"));
        return info.toString();
    }
    
    public void clear(){
        storage.clear();
    }

}