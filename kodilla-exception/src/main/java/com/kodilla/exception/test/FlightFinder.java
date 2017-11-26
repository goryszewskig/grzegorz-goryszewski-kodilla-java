package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightFinder {

    private final Map<String, Boolean> flightsToFly;

    public FlightFinder() {
        flightsToFly = new HashMap<>();
        flightsToFly.put("Heathrow", true);
        flightsToFly.put("Warsaw", true);
        flightsToFly.put("Rome", true);
        flightsToFly.put("Paris", false);
        flightsToFly.put("Latvia", false);
        flightsToFly.put("Kopenhagen", false);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (flightsToFly.containsKey(flight.getArrivalAirport())) {

            Map<String, Boolean> resultMap = flightsToFly.entrySet().stream()
                    .filter(f -> f.getKey().equals(flight.getArrivalAirport()) && f.getValue())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            if (resultMap.size() == 0) {
                System.out.println("No flight to your destination");
            } else {
                resultMap.entrySet().stream().map(e -> "You can take a flight to " + e.getKey()).forEach(System.out::println);
            }

        } else {
            throw new RouteNotFoundException("No such airport in database.");
        }
    }
}
