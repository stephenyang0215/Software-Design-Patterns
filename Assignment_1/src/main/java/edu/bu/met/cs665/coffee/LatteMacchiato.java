package edu.bu.met.cs665.coffee;

import edu.bu.met.cs665.Beverage;

public class LatteMacchiato {
    public Beverage beverage;
    public LatteMacchiato() {
        beverage = new Beverage("LatteMacchiato"); // HAS-A relationship
        beverage.price = 4;
        beverage.brewCoffee();
        System.out.println("Pour milk into the shot of espresso");
        System.out.println("Add milk foam to the top");
    }
}
