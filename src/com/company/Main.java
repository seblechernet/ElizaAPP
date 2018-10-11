package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
//  create a new object of class Eliza
        Eliza eliza=new Eliza();
        System.out.println(eliza.greetings());
        String chat="";
//   Eliza keeps chating until q
        while(!chat.equalsIgnoreCase("q")) {
         chat =sc.nextLine();
         System.out.println(eliza.respond(chat));
        }

// Print the history fo the conversation by calling the history method from Eliza class
        System.out.println("Do you want to see the converasion History?(Y/N)");
        String seeHistory=sc.nextLine();
        if ((seeHistory.equalsIgnoreCase("y"))) {
            for (Conversation eachConversation : eliza.history()) {
                System.out.println(eachConversation.getWho() + " : " + eachConversation.getText());
            }
        }

    }
}
