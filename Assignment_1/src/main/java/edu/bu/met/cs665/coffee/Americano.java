package edu.bu.met.cs665.coffee;

import edu.bu.met.cs665.Beverage;

public class Americano {
    public Beverage beverage;
    public Americano() {
        beverage = new Beverage("Americano"); // HAS-A relationship
        beverage.price = 3.5;
        beverage.brewCoffee();
        System.out.println("Pouring boiling water into the mug.");
    }
}
