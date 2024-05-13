package edu.bu.met.cs665.Tea;

import edu.bu.met.cs665.Beverage;

public class YellowTea {
    public Beverage beverage;
    public YellowTea() {
        beverage = new Beverage("Yellow Tea"); // HAS-A relationship
        beverage.price = 2.0;
        beverage.brewTea();
    }

}
