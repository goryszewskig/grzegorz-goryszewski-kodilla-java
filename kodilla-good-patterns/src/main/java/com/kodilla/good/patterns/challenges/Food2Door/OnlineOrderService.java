package com.kodilla.good.patterns.challenges.Food2Door;

public class OnlineOrderService implements OrderService {

    @Override
    public boolean placeOrder(ShopOrderRequest shopOrderRequest) {

        if (shopOrderRequest.getShop().getName().equals("ExtraFoodShop")
                || shopOrderRequest.getShop().getName().equals("HealthyShop")
                || shopOrderRequest.getShop().getName().equals("GlutenFreeShop")){

            System.out.println("Processing order.");
            System.out.println("Order processed.");
            System.out.println("Order details " + shopOrderRequest.getShopOrder().getFoodType()
            + " " + shopOrderRequest.getShopOrder().getFoodQuantity());

            return true;
        }
        System.out.println("Something wrong!");
        return false;
    }
}
