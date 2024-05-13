/**
 * Name: Stephen Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/25/2024
 * File Name: Shop.java
 * Description: The class for shop which defines the entity to execute the business logic.
 */
package edu.bu.met.cs665;

public class Shop {
    private long ice;
    private long sugar;
    private long toppings;


    public Shop(Integer ice, Integer sugar, Integer toppings) {
        this.ice = ice;
        this.sugar = sugar;
        this.toppings = toppings;
    }

    public long getSugar() {
        return this.sugar;
    }

    public void setSugar(long sugar) {
        this.sugar += sugar;
    }

    public long getIce() {
        return this.ice;
    }

    public void setIce(long ice) {
        this.ice += ice;
    }

    public long getToppings() {
        return this.toppings;
    }

    public void setToppings(long toppings) {
        this.toppings += toppings;
    }
}
