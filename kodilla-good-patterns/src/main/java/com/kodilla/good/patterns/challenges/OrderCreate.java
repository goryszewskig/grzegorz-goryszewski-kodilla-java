package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class OrderCreate {

    public List<Order> create(){
    List<Order> orderList = new ArrayList<>();

    User buyer = new User("smithj", "John Smith");
    User seller = new User("doej", "John Doe");
    Product product = new Product("xbox", 1111.99, "console");
    LocalDate deliveryDate = LocalDate.of(2123, Month.JANUARY, 11);
    orderList.add(new Order(1,product,buyer,seller,2,deliveryDate));

    return orderList;
    }



}
