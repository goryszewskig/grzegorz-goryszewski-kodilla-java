package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;


public class Bigmac {
    private final Roll roll;
    private final int burgers;
    private final Sauce sauce;
    private final List<Ingredient> ingredients;

    public static class BigmacBuilder{
        private Roll roll;
        private int burgers;
        private Sauce sauce;
        private List<Ingredient> ingredients = new ArrayList<>();

        public BigmacBuilder roll(Roll roll){
            this.roll=roll;
            return this;
        }

        public BigmacBuilder burgers(int burgers){
            this.burgers=burgers;
            return this;
        }

        public BigmacBuilder sauce(Sauce sauce){
            this.sauce=sauce;
            return this;
        }

        public BigmacBuilder ingredients(Ingredient ingredient){
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build(){
            return new Bigmac(roll,burgers,sauce,ingredients);
        }
    }

    private Bigmac(final Roll roll, final int burgers, final Sauce sauce, final List<Ingredient> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getRoll() {
        return roll.toString();
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce.toString();
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + this.getRoll() + '\'' +
                ", burgers=" + this.getBurgers() +
                ", sauce='" + this.getSauce() + '\'' +
                ", ingredients=" + this.getIngredients() +
                '}';
    }

}
