package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Shop {
    @Override
    public void process(Customer customer, ShopOrder shopOrder){

        System.out.println("Set up the following order for " + customer.getName());
        System.out.println("ExtraFood product: " + shopOrder.getFoodType());
        System.out.println("ExtraFood amount: " + shopOrder.getFoodQuantity());
    }
}

