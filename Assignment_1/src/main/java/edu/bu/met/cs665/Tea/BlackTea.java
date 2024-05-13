package edu.bu.met.cs665.Tea;

import edu.bu.met.cs665.*;

public class BlackTea {
    public Beverage beverage;
    public BlackTea() {
        beverage = new Beverage("Black Tea"); // HAS-A relationship
        beverage.price = 2.0;
        beverage.brewTea();
    }
}
