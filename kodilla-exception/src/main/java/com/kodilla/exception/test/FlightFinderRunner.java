package com.kodilla.exception.test;

public class FlightFinderRunner {

   public static void main(String[] args) throws RouteNotFoundException{

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(new Flight("Warsaw", "Nice"));
        } catch (RouteNotFoundException e) {
            System.out.println("Unrecognized destination.");
        }
        System.out.println("And we are still running.");
        System.out.println();

        try {
            flightFinder.findFlight(new Flight("Warsaw", "Latvia"));
        } catch (RouteNotFoundException e) {
            System.out.println("Unrecognized destination.");
        }
        System.out.println("And we are still running.");
        System.out.println();

        try {
            flightFinder.findFlight(new Flight("Warsaw", "Rome"));
        } catch (RouteNotFoundException e) {
            System.out.println("Unrecognized destination.");
        }
        System.out.println("And we are still running.");

    }

}
