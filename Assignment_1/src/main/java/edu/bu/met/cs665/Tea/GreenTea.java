package edu.bu.met.cs665.Tea;

import edu.bu.met.cs665.Beverage;

public class GreenTea {
    //Refactoring: Replace Inheritance with Delegation
    public Beverage beverage;
    public GreenTea() {
        beverage = new Beverage("Green Tea"); // HAS-A relationship
        beverage.price = 2.0;
        beverage.brewTea();
    }
}
