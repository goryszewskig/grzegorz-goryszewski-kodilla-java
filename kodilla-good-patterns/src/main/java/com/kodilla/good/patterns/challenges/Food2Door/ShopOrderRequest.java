package com.kodilla.good.patterns.challenges.Food2Door;

public class ShopOrderRequest {

    private Customer customer;
    private Shop shop;
    private ShopOrder shopOrder;

    public ShopOrderRequest(Customer customer, Shop shop, ShopOrder shopOrder) {
        this.customer = customer;
        this.shop = shop;
        this.shopOrder = shopOrder;


    }

    public Customer getCustomer() {
        return customer;
    }

    public Shop getShop() {
        return shop;
    }

    public ShopOrder getShopOrder() {
        return shopOrder;
    }
}
