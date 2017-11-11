package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // kolejny test
        System.out.println("Test - pierwszy test jednostkowy");
        Calculator calculator = new Calculator();
        int addResult = calculator.add(1,2);
        int subResult = calculator.subtract(2,1);

        if((addResult == 3) && (subResult == 1)){
            System.out.println("Calculator ok!");

        } else {
            System.out.println("Calculator has errors!");
        }

    }
}
