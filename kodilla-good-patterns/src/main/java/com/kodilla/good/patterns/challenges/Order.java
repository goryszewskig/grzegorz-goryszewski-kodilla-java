package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Order {
    private int orderNumber;
    private Product product;
    private User buyer;
    private User seller;
    private int amount;
    private LocalDate deliveryDate;

    public Order(int orderNumber, Product product, User buyer, User seller, int amount, LocalDate deliveryDate) {
        this.orderNumber = orderNumber;
        this.product = product;
        this.buyer = buyer;
        this.seller = seller;
        this.amount = amount;
        this.deliveryDate = deliveryDate;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Product getProduct() {
        return product;
    }

    public User getBuyer() {
        return buyer;
    }

    public User getSeller() {
        return seller;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
}
