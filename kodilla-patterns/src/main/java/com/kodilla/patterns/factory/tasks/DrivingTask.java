package com.kodilla.patterns.factory.tasks;

import java.util.HashSet;
import java.util.Set;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    final Set<String> taskList = new HashSet<>();

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("go to: " + where+ ", use: " + using);
        taskList.add(taskName);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskList.contains(taskName);
    }
}
