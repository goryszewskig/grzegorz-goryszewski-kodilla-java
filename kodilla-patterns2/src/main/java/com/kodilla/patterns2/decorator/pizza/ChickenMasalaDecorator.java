package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ChickenMasalaDecorator extends AbstractPizzaOrderDecorator {
    protected ChickenMasalaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10.0));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with chicken masala, ";
    }
}
