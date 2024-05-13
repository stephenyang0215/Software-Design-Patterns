package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestEDA {

    public TestEDA() {
    }

    @Test
    public void testStore() {
        Shop shop = new Shop(10,10,10);
        assertEquals(10, shop.getIce());
        assertEquals(10, shop.getSugar());
        assertEquals(10, shop.getToppings());

    }

    @Test
    public void testOrderEvent() {
        Shop shop = new Shop(10,10,10);
        orderEvent order = new orderEvent(shop,2,2,2);
        assertEquals(-2, order.getIce());
        assertEquals(-2, order.getSugar());
        assertEquals(-2, order.getToppings());
    }

    @Test
    public void testInventoryEvent() {
        Shop shop = new Shop(10,10,10);
        inventoryEvent inventory = new inventoryEvent(shop,5,5,5);
        assertEquals(5, inventory.getIce());
        assertEquals(5, inventory.getSugar());
        assertEquals(5, inventory.getToppings());
    }

    @Test
    public void testDispatcher() {
        Shop shop = new Shop(10,10,10);
        eventDispatcher dispatcher = new eventDispatcher();
        inventoryEvent inventory = new inventoryEvent(shop,5,5,5);
        inventoryHandler inventoryHandler = new inventoryHandler("inventoryHandler1");
        dispatcher.registerHandler(inventoryEvent.class, new ArrayList<eventHandler>() { {add(inventoryHandler);}});
        assertEquals(new ArrayList<eventHandler>(Arrays.asList(inventoryHandler))
                ,dispatcher.getEventHandler(inventoryEvent.class));
    }



}
