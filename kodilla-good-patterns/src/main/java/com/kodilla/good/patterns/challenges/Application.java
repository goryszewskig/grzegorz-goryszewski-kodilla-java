package com.kodilla.good.patterns.challenges;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        OrderCreate orderCreate = new OrderCreate();
        List<Order> order = orderCreate.create();

        ProductOrderService productOrderService =
                new ProductOrderService(new EmailService(), new SalesStatusService(), new ListRepository());
        productOrderService.process(order);
    }

}
