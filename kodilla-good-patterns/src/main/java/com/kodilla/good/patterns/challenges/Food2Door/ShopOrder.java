package com.kodilla.good.patterns.challenges.Food2Door;



public class ShopOrder {

    private String foodType;
    private double foodQuantity;

    public ShopOrder(String foodType, double foodQuantity) {
        this.foodType = foodType;
        this.foodQuantity = foodQuantity;
    }

    public String getFoodType() {
        return foodType;
    }

    public double getFoodQuantity() {
        return foodQuantity;
    }
}
