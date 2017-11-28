package com.kodilla.good.patterns.challenges;

public interface OrderRepository {
    void addOrderToExecute(int orderNumber);
    void saveOrderHistory(int orderNumber);
}

