package com.kodilla.patterns.factory.tasks;

public class TaskFactory  {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass){
        switch (taskClass){
            case SHOPPING:
                return new ShoppingTask("grosery", "apples", 10);
            case PAINTING:
                return new PaintingTask("paint car", "red", "toyota");
            case DRIVING:
                return new DrivingTask("visit mom", "Gd", "bus");
            default:
                throw new RuntimeException("provide task");
        }
    }

}
