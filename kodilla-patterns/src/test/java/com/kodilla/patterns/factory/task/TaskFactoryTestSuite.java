package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        //When
        Task shoppingTask = factory.createTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("grosery", shoppingTask.getTaskName());
        Assert.assertEquals("buy: apples, amount: 10.0", output.toString().trim());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        //When
        Task paintingTask = factory.createTask(TaskFactory.PAINTING);
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("paint car", paintingTask.getTaskName());
        Assert.assertEquals("Paint: toyota in color: red", output.toString().trim());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        //When
        Task drivingTask = factory.createTask(TaskFactory.DRIVING);
        drivingTask.executeTask();
        //Then
        Assert.assertEquals("visit mom", drivingTask.getTaskName());
        Assert.assertEquals("go to: Gd, use: bus", output.toString().trim());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}
