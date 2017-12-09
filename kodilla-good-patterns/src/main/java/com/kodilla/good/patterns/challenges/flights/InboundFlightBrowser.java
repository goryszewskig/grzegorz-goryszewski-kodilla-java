package com.kodilla.good.patterns.challenges.flights;

import java.util.*;
import java.util.stream.Collectors;

public class InboundFlightBrowser implements FlightBrowser {

    private FlightDatabase flightDatabase = new FlightDatabase();
    private HashMap<String,String[]> mapOfFlights = flightDatabase.getFlightDatabase();



    @Override
    public String search(String airport) {
        List<String> flightList = new ArrayList<>();
        for(Map.Entry<String,String[]> entry: mapOfFlights.entrySet()){
            Arrays.stream(entry.getValue())
                    .filter(f->f.contains(airport))
                    .map(m->entry.getKey())
                    .forEach(flightList::add);
        }

        String message = " To " + airport + " possible flights from ";
        String resultList = flightList.stream().collect(Collectors.joining(" , "));

        return message + resultList ;
    }
}
