package com.kodilla.good.patterns.challenges.flights;

import java.util.HashMap;

public class FlightDatabase  {
    private HashMap<String, String[]> flightDatabase = new HashMap<>();

    Airport airport1 = new Airport("KRK", new String[]{"WAW","WRO","GDA"});
    Airport airport2 = new Airport("WAW", new String[]{"RZE","KRK","WRO","GDA"});
    Airport airport3 = new Airport("WRO", new String[]{"RZE","WAW","KRK"});
    Airport airport4 = new Airport("RZE", new String[]{"WAW"});
    Airport airport5 = new Airport("GDA", new String[]{"WAW","RZE"});

    public HashMap<String,String[]> getFlightDatabase(){
        flightDatabase.put(airport1.getName(),airport1.getDestinations());
        flightDatabase.put(airport2.getName(),airport2.getDestinations());
        flightDatabase.put(airport3.getName(),airport3.getDestinations());
        flightDatabase.put(airport4.getName(),airport4.getDestinations());
        flightDatabase.put(airport5.getName(),airport5.getDestinations());

        return flightDatabase;
    }


}
