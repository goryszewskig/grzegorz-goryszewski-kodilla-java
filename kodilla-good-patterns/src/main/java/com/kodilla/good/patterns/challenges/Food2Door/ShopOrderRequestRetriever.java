package com.kodilla.good.patterns.challenges.Food2Door;

import java.math.BigDecimal;

public class ShopOrderRequestRetriever {

    public ShopOrderRequest retrieve(){

        Customer customer = new Customer("GG", "Gornicza");
        ShopOrder shopOrder = new ShopOrder("coca", 20.0);

        Shop shop = new HealthyShop();
        System.out.println();
        shop.process(customer, shopOrder);

        return new ShopOrderRequest(customer, shop, shopOrder);
    }
}
