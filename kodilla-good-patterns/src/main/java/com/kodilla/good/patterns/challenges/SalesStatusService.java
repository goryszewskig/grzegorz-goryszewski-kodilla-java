package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class SalesStatusService implements OrderService{

    public boolean status(int orderNumber, LocalDate deliveryDate, double orderPrice){
        LocalDate now = LocalDate.now();
        if(deliveryDate.isAfter(now)){
            System.out.println("Delivery at " + deliveryDate + " Price" + orderPrice );
            return true;
        } else {
            System.out.println("Order arrived.");
            return false;
        }
    }
}
