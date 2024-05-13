package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.Tea.BlackTea;
import edu.bu.met.cs665.coffee.Americano;
import edu.bu.met.cs665.coffee.LatteMacchiato;
import org.junit.Test;
import edu.bu.met.cs665.Tea.YellowTea;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestBeverage {

    // Test the name for Yellow Tea
    @Test
    public void testBeverage() {

        YellowTea yellowTea = new YellowTea();
        assertEquals("Yellow Tea", yellowTea.beverage.getBeverage());

    }

    // Test the price for Black Tea by adding two units of milk and sugar each
    @Test
    public void testPrice() {

        BlackTea blackTea = new BlackTea();
        blackTea.beverage.AddMilk(2);
        blackTea.beverage.AddSugar(2);
        assertEquals(4.0, blackTea.beverage.getPrice(), 0.0);

    }

    // Test the price for Americano by adding two units of milk
    @Test
    public void testMilk() {
        Americano americano = new Americano();
        americano.beverage.AddMilk(2);
        assertEquals(2, americano.beverage.getMilk(), 0.0);

    }

    // Test the price for Latte Macchiato by adding two units of sugar
    @Test
    public void testSugar() {

        LatteMacchiato latteMacchiato = new LatteMacchiato();
        latteMacchiato.beverage.AddSugar(2);
        assertEquals(2, latteMacchiato.beverage.getSugar(), 0.0);

    }

}
