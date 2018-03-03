package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza bottom and tomatoes with cheese", description);
    }
    @Test
    public void testAllToppingsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChickenMasalaDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);

        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza bottom and tomatoes with cheese with chicken masala,  onions,  pepperoni ", description);
    }
    @Test
    public void testAllToppingsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChickenMasalaDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(31.0), calculatedCost);
    }

}

