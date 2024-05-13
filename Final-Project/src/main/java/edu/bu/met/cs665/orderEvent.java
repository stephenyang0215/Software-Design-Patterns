/**
 * Name: Stephen Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/25/2024
 * File Name: orderEvent.java
 * Description: The class for order event which extended from the class of abstractEvent.
 */
package edu.bu.met.cs665;

public class orderEvent extends abstractEvent {
    final String eventType;
    final Shop shop;
    final long ice;
    final long sugar;
    final long toppings;

    public orderEvent(Shop shop, long ice, long sugar, long toppings) {
        super();
        this.eventType = "order event";
        this.shop = shop;
        this.ice = ice*-1;
        this.sugar = sugar*-1;
        this.toppings = toppings*-1;
    }

    public String getEventType() {
        return eventType;
    }

    public long getIce() {
        return ice;
    }

    public long getSugar() {
        return sugar;
    }

    public long getToppings() {
        return toppings;
    }

    public void setSugar() {
        System.out.println("Sugar: ");
        System.out.println("The event uses the units of sugar: " + this.sugar*-1);
        this.shop.setSugar(this.sugar);
        if (this.shop.getSugar() < 5) {
            System.out.println("The sugar stock at the shop: " + this.shop.getSugar() + "\n");
            System.out.println("The sugar is at low stock. Please call the inventory service!\n");
        } else {
            System.out.println("The sugar stock at the shop: " + this.shop.getSugar() + "\n");
        }
    }

    public void setToppings() {
        System.out.println("Toppings: ");
        System.out.println("The event uses the units of toppings: " + this.toppings*-1);
        this.shop.setToppings(this.toppings);
        if (this.shop.getToppings() < 5) {
            System.out.println("The toppings stock left at the store: " + this.shop.getToppings() + "\n");
            System.out.println("The toppings is at low stock. Please call the inventory service!\n");
        } else {
            System.out.println("The toppings stock at the shop: " + this.shop.getToppings() + "\n");
        }
    }

    public void setIce() {
        System.out.println("Ice: ");
        System.out.println("The event uses the units of ice: " + this.ice*-1);
        this.shop.setIce(this.ice);
        if (this.shop.getIce() < 5) {
            System.out.println("The ice stock left at the store: " + this.shop.getIce() + "\n");
            System.out.println("The ice is at low stock. Please call the inventory service!\n");
        } else {
            System.out.println("The ice stock at the shop: " + this.shop.getIce() + "\n");
        }
    }
}
