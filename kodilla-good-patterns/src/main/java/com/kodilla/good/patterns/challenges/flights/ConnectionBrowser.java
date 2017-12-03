package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ConnectionBrowser {

    private FlightDatabase flightDatabase = new FlightDatabase();
    private HashMap<String,String[]> mapOfFlights = flightDatabase.getFlightDatabase();

    private List<String> flightList = new ArrayList<>();

    public boolean checkIfDirect(String start, String end){
        List<String> flightConnectionEntry = Arrays.stream(mapOfFlights.get(start))
                .collect(Collectors.toList());

        if(flightConnectionEntry.contains(end)) {
            return true;
        }else{
            return false;
        }
    }

    public String search(String start, String end){

        if(!checkIfDirect(start,end)){
            for(String entryVal: mapOfFlights.get(start)){
                Arrays.stream((mapOfFlights.get(entryVal)))
                        .filter(f->f.contains(end))
                        .map(m->entryVal)
                        .forEach(flightList::add);
            }

            String message = "No direct connection for this flight, please change to ";
            String resultList = flightList.stream().collect(Collectors.joining(" or "));

            return message + resultList;
        }

        String message = "Direct connection found for";
        return message + start + " <-> " + end;

    }
}
