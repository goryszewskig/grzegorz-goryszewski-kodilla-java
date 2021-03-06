package com.kodilla.patterns.factory.tasks;

import java.util.HashSet;
import java.util.Set;

public class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    //final Set<String> taskList = new HashSet<>();
    private boolean taskExecuted = false;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("buy: " + whatToBuy + ", amount: " + quantity);
        taskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted ;
    }
}
