package com.company;

import java.util.*;

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
//  instantiate a new Conversation class to use it for the user
        Conversation conv1=new Conversation();
        conv1.setWho("User");
        conv1.setText(chat);
// add the new Conversation object to the Arraylist of conversations
        conversations.add(conv1);
// Create a new string array to hold the responses of eliza and add all thye responses in to the array
        String[] elizaResp=new String[3];
        elizaResp[0]="Why do you say ";
        elizaResp[1]="Please tell me more ";
        elizaResp[2]="You seem to think that ";

// Split the input from the user in to words and reaplace the words i with you, am with are, my with your,me with you

        String[] response=chat.split("\\s");
        Random rd=new Random();
// Generate a random number and use it to select a random index of response from elisa's responses
        int index=rd.nextInt(3);
        String sentence=elizaResp[index];
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
          if(index==1){
              sentence=elizaResp[1];
          }
          else
            sentence=sentence.concat(response[i]);
            sentence=sentence.concat(space);


        }
//  instantiate a new Conversation class to use it for Eliza
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
