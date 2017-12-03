package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Shop {

    @Override
    public void process(Customer customer, ShopOrder shopOrder){

        System.out.println("Gluten-free food was ordered for: " + customer.getName());
        System.out.println("Prepare " + shopOrder.getFoodQuantity() + " " + shopOrder.getFoodType());
    }
}
