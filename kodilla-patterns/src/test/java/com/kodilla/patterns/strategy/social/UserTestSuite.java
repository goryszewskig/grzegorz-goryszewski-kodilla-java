package com.kodilla.patterns.strategy.social;


import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Rober Z.");
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        //When
        user1.sharePost();
        //Then
        Assert.assertEquals("[Facebook]", output.toString().trim());

        //Given
        User user2 = new YGeneration("Jola Z.");
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        //When
        user2.sharePost();
        //Then
        Assert.assertEquals("[Twitter]", output.toString().trim());

        //Given
        User user3 = new ZGeneration("Ada Sz.");
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        //When
        user3.sharePost();
        //Then
        Assert.assertEquals("[Snapchat]", output.toString().trim());
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("Grzegorz A.");
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        //When
        user1.setPublisher(new TwitterPublisher());
        user1.sharePost();
        //Then
        Assert.assertEquals("[Twitter]", output.toString().trim());
    }
}
