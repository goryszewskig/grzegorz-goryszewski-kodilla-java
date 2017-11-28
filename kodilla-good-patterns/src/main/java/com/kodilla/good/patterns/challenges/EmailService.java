package com.kodilla.good.patterns.challenges;

public class EmailService implements InformationService{

    public void sendMessageToBuyer(String productName){
        System.out.println("You've bought: " + productName);
    }

    public void sendMessageToSeller(String productName){
        System.out.println("You've sold: " + productName);
    }
}
