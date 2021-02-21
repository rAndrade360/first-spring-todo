package com.renan.firstproject.models;

import com.renan.firstproject.utils.RandomStringId;

import java.nio.charset.Charset;
import java.util.Random;

public class Todo {
    private String id;
    private String text;

    public Todo(String text) {
        this.text = text;
        RandomStringId random = new RandomStringId();
        this.id = random.execute();
    }
    public Todo(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public Todo(){
        RandomStringId random = new RandomStringId();
        this.id = random.execute();
    }



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
