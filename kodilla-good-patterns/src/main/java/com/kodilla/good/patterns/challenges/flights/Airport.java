package com.kodilla.good.patterns.challenges.flights;

import java.util.Arrays;

public class Airport {

    private String name;
    private String[] destinations;

    public Airport(String name, String[] destinations) {
        this.name = name;
        this.destinations = destinations;
    }

    public String getName() {
        return name;
    }

    public String[] getDestinations() {
        return destinations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;

        Airport airport = (Airport) o;

        if (name != null ? !name.equals(airport.name) : airport.name != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(destinations, airport.destinations);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(destinations);
        return result;
    }
}
