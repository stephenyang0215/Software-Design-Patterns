package edu.bu.met.cs665.coffee;

import edu.bu.met.cs665.Beverage;

public class Espresso {
    public Beverage beverage;
    public Espresso() {
        beverage = new Beverage("Espresso"); // HAS-A relationship
        beverage.price = 3;
        beverage.brewCoffee();
    }
}
