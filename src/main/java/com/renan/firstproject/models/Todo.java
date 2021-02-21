package com.renan.firstproject.models;

import com.renan.firstproject.utils.RandomStringId;

import javax.validation.constraints.NotEmpty;

public class Todo {
    private String id;

    @NotEmpty(message="The text can not be null")
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
