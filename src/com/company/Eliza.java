package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Eliza {

    private ArrayList<Conversation> conversations=new ArrayList<>();

    public Eliza() {

    }

    public ArrayList<Conversation> getConversations() {
        return conversations;
    }

    public void setConversations(ArrayList<Conversation> conversations) {
        this.conversations = conversations;
    }

    public String respond(String chat) {
//  instatiate a new Converastion class to use it for the user
        Conversation conv1=new Conversation();
        conv1.setWho("User");
        conv1.setText(chat);
// add the new Conversation object to the Arraylist of conversations
        conversations.add(conv1);
        String sentence="";
// Split the in put from the user in to words and reaplace the words i with you, am with are, my with your,me with you
        String[] response=chat.split("\\s");

        for(int i=0;i<response.length;i++){
            if(response[i].equalsIgnoreCase("i")){
                response[i]="you";
            }
            if(response[i].equalsIgnoreCase("am")){
                response[i]="are";
            }
            if(response[i].equalsIgnoreCase("my")){
                response[i]="your";
            }
            if(response[i].equalsIgnoreCase("me")){
                response[i]="you";
            }
            String space = " ";
            sentence=sentence.concat(response[i]);
            sentence=sentence.concat(space);


        }
//  instatiate a new Converastion class to use it for the Eliza
        Conversation conv2=new Conversation();
        conv2.setWho("Eliza");
        conv2.setText(sentence);
//  add the new Conversation object to the Arraylist of conversations
        conversations.add(conv2);

        return sentence;
    }

    public String greetings() {
        String greetings= "Good Day. What is your Problem?\n Enter your response here or Q to quit:";
        return greetings;

    }

    public ArrayList<Conversation> history() {
        return conversations;

    }
}
