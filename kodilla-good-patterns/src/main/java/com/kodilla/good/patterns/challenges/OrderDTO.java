package com.kodilla.good.patterns.challenges;

public class OrderDTO {
    private int orderNumber;
    private boolean status;

    public OrderDTO(int orderNumber, boolean status) {
        this.orderNumber = orderNumber;
        this.status = status;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public boolean isStatus() {
        return status;
    }
}
