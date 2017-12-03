package com.kodilla.good.patterns.challenges.flights;

public class FlightApplication {

    public static void main(String[] args){

        FlightBrowser browse1 = new InboundFlightBrowser();
        System.out.println(browse1.search("KRK"));

        FlightBrowser browse2 = new OutboundFlightBrowser();
        System.out.println(browse2.search("KRK"));

        ConnectionBrowser browse3 = new ConnectionBrowser();
        System.out.println(browse3.search("KRK","RZE"));
    }
}
