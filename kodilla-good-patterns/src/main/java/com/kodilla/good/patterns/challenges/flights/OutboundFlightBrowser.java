package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class OutboundFlightBrowser implements FlightBrowser {
    private FlightDatabase flightDatabase = new FlightDatabase();
    private HashMap<String, String[]> mapOfFlights = flightDatabase.getFlightDatabase();

    private List<String> flightList = new ArrayList<>();

    @Override
    public String search(String airport) {
        flightList = Arrays.stream(mapOfFlights.get(airport))
        .collect(Collectors.toList());

        String message = "From " + airport + " you can fly to ";
        String resultList = flightList.stream().collect(Collectors.joining(" or "));

        return message + resultList ;
    }
}
