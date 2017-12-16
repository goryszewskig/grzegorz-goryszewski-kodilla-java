package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.patterns.builder.bigmac.Sauce.* ;
import static com.kodilla.patterns.builder.bigmac.Roll.* ;
import static com.kodilla.patterns.builder.bigmac.Ingredient.*;




public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(SESAME)
                .burgers(11)
                .sauce(BBQ)
                .ingredients(LETTUCE)
                .ingredients(ONION)
                .ingredients(BACON)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertTrue(bigmac.getIngredients().contains(ONION));
        Assert.assertFalse(bigmac.getIngredients().contains(CHEESE));
    }
}
