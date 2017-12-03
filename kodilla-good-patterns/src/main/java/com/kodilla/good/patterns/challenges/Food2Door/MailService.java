package com.kodilla.good.patterns.challenges.Food2Door;

public class MailService implements InformationService{

    @Override
    public void inform(ShopOrderRequest shopOrderRequest){
        System.out.println("Order for " + shopOrderRequest.getCustomer().getName()
        + " about to be delivered.");
    }
}
