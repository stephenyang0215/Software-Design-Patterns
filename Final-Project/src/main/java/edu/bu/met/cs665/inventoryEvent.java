/**
 * Name: Stephen Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/25/2024
 * File Name: inventoryEvent.java
 * Description: The class for inventory event which extended from the class of abstractEvent.
 */
package edu.bu.met.cs665;

public class inventoryEvent extends abstractEvent {
    final String eventType;
    final Shop shop;
    final long ice;
    final long sugar;
    final long toppings;

    public inventoryEvent(Shop shop, long ice, long sugar, long toppings) {
        super();
        this.eventType = "inventory event";
        this.shop = shop;
        this.ice = ice;
        this.sugar = sugar;
        this.toppings = toppings;
    }

    public String getEventType() {
        return eventType;
    }

    public long getToppings() {
        return toppings;
    }

    public long getIce() {
        return ice;
    }

    public long getSugar() {
        return sugar;
    }

    public void setSugar() {
        this.shop.setSugar(this.sugar);
        System.out.println("Sugar:");
        System.out.println("The event brings the units of sugar: " + this.sugar);
        System.out.println("The sugar stock at the shop: " + this.shop.getSugar() + "\n");
    }

    public void setToppings() {
        this.shop.setToppings(this.toppings);
        System.out.println("Toppings:");
        System.out.println("The event brings the units of toppings: " + this.toppings);
        System.out.println("The toppings stock at the shop: " + this.shop.getToppings() + "\n");
    }

    public void setIce() {
        this.shop.setIce(this.ice);
        System.out.println("Ice:");
        System.out.println("The event brings the units of ice: " + this.ice);
        System.out.println("The ice stock at the shop: " + this.shop.getIce() + "\n");
    }
}
