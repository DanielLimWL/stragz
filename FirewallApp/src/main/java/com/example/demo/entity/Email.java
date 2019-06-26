package com.example.demo.entity;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Email {

    private String stage;
    private String feedName;
    private boolean doFlattening;

    public String toJson(){
        return new Gson().toJson(this);
    }
}
