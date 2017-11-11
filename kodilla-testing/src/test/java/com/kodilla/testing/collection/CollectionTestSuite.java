package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;


import static java.util.Arrays.asList;

public class CollectionTestSuite {
    //
    //
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");

    }


    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> myList  = new ArrayList<Integer>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(myList);
        System.out.println("Testing " + result);
        //Then
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,4,6));
        //Given
        ArrayList<Integer> myList = new ArrayList<Integer>(asList(1,2,3,4,5,6,7));
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(myList);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(expected, result);
    }



}
