package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimpleUser;

import java.util.ArrayList;
import java.util.Arrays;

public class TestingMain {
    public static void main(String[] args){

        ArrayList<Integer> myList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(myList);
        System.out.println(myList);

    }
}
