package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String done = secondChallenge.probablyIWillThrowException(11, 2);
            System.out.println(done);
        } catch (Exception e) {
            System.out.println("Error -> " + e);
        } finally {
            System.out.println("Final block");
        }
    }
}
