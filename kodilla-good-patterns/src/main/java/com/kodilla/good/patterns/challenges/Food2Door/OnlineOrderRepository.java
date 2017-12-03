package com.kodilla.good.patterns.challenges.Food2Door;

public class OnlineOrderRepository implements OrderRepository {

    @Override
    public void createOrder(ShopOrderRequest shopOrderRequest) {

        System.out.println("Order details: ");
        System.out.println("Supplier: " + shopOrderRequest.getShop().getName());
        System.out.println("Product: " + shopOrderRequest.getShopOrder().getFoodType());
        System.out.println("Quantity: " + shopOrderRequest.getShopOrder().getFoodQuantity());
        System.out.println("Delivery details: " + shopOrderRequest.getCustomer().getName() +
        " , " + shopOrderRequest.getCustomer().getAddress());

    }
}

