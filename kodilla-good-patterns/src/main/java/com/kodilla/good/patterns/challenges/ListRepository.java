package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListRepository implements OrderRepository {

    private List<Integer> inProgressList = new LinkedList<>();
    private List<Integer> listOfFinishedOrders = new ArrayList<>();

    @Override
    public void addOrderToExecute(int orderNumber){
        inProgressList.add(orderNumber);
    }

    @Override
    public void saveOrderHistory(int orderNumber){
        listOfFinishedOrders.add(orderNumber);
    }
}

