package com.company;

public class Conversation {
    private String who;
    private String text;

    public Conversation(String who, String text) {
        this.who = who;
        this.text = text;
    }

    public Conversation() {
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
