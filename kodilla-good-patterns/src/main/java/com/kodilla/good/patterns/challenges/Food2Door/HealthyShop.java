package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Shop {

    public void process(Customer customer, ShopOrder shopOrder){

        System.out.println("Order received: " + customer.getName() + ", "
        + shopOrder.getFoodType() + ", " + shopOrder.getFoodQuantity());
    }
}
