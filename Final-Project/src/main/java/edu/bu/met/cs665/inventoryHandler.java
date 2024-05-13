/**
 * Name: Stephen Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/25/2024
 * File Name: inventoryHandler.java
 * Description: The class for inventory handler.
 * It works as the handler of inventory event type.
 */
package edu.bu.met.cs665;

public class inventoryHandler implements eventHandler {
    String name;
    public inventoryHandler(String name) {
        //handleEvent(event);
        this.name = name;
    }
    @Override
    public void onEvent(abstractEvent event) {
        event.process();
    }

    public String getName() {
        return name;
    }
}
