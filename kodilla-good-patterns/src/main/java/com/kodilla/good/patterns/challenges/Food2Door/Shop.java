package com.kodilla.good.patterns.challenges.Food2Door;

public interface Shop {

    default String getName(){
        return getClass().getSimpleName();
    }
    void process(Customer customer, ShopOrder shopOrder);
}
