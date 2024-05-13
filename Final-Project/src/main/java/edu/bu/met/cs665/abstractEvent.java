/**
 * Name: Stephen Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/25/2024
 * File Name: abstractEvent.java
 * Description: The class for abstract event which defines the fields for instance of shop and all kinds of stock,
 * the skeleton of operation for the shop and all its steps.
 */
package edu.bu.met.cs665;

public abstract class abstractEvent {
    String eventType;
    Shop shop;
    Integer sugar;
    Integer toppings;
    Integer ice;
    //the skeleton of operation of the shop
    public void process() {
        setSugar();
        setToppings();
        setIce();
    }

    public String getEventType() {
        return this.eventType;
    }

    abstract void setSugar();

    abstract void setToppings();

    abstract void setIce();

}
