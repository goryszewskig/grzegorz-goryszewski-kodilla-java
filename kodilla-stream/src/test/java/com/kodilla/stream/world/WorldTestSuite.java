package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", BigDecimal.valueOf(38476269));
        Country holland = new Country("Holland", BigDecimal.valueOf(17000000));
        Country estonia = new Country("Estonia", BigDecimal.valueOf(10000000));
        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(poland);
        europeCountries.add(holland);
        europeCountries.add(estonia);
        Continent europa = new Continent("Europe", europeCountries);

        Country usa = new Country("USA", BigDecimal.valueOf(336625791));
        Country canada = new Country("Canada", BigDecimal.valueOf(34623680));
        List<Country> americaCountries = new ArrayList<>();
        americaCountries.add(usa);
        americaCountries.add(canada);
        Continent america = new Continent("America", americaCountries);


        List<Continent> continentList = new ArrayList<>();
        continentList.add(europa);
        continentList.add(america);

        World world = new World(continentList);

        //When
        BigDecimal poepleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectationalQuantity = BigDecimal.valueOf(38476269 + 17000000 + 10000000 + 336625791 + 34623680);
        Assert.assertEquals(expectationalQuantity, poepleQuantity);


    }
}
