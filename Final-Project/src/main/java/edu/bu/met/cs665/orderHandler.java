/**
 * Name: Stephen Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/25/2024
 * File Name: inventoryHandler.java
 * Description: The class for order handler.
 * It works as the handler of order event type.
 */
package edu.bu.met.cs665;

public class orderHandler implements eventHandler {
    String name;
    public orderHandler(String name) {
        this.name = name;
    }

    @Override
    public void onEvent(abstractEvent event) {
        event.process();
    }

    @Override
    public String getName() {
        return name;
    }
}
