package com.kodilla.patterns.factory.tasks;

import java.util.HashSet;
import java.util.Set;

public final class PaintingTask implements Task{
    final String taskName;
    final String color;
    final String whatToPaint;
    final Set<String> taskList = new HashSet<>();

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Paint: " + whatToPaint + " in color: " + color);
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
