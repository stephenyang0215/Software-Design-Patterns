/**
 * Name: Stephen Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/25/2024
 * File Name: eventDispatcher.java
 * Description: The class for event dispatcher.
 * It receives the event and the handler of its type to trigger the operation of the shop.
 */
package edu.bu.met.cs665;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class eventDispatcher {
    public eventDispatcher() {
        System.out.println("Instantiate the dispatcher!");
    }
    //The field to collect event handler
    private final Map<Class<? extends abstractEvent>, List<eventHandler>> eventHandlerMap = new HashMap<>();
    //The method to register event handler
    public void registerHandler(Class<? extends abstractEvent> eventType, List<eventHandler> eventHandler) {
        this.eventHandlerMap.put(eventType, eventHandler);
        System.out.println("You successfully register an event handler: " + eventHandler.get(0).getName() + "\n");
    }
    //The method to trigger the actions by the event it receives
    public void fireEvent(abstractEvent event) {
        List<? extends eventHandler> eventHandlerList = getEventHandler(event.getClass());
        eventHandlerList.forEach(handler -> runEventHandler(handler, event));
    }
    //The method to call the handler of the event type
    public void runEventHandler(eventHandler handler, abstractEvent event) {
        System.out.println("Dispatching the " + event.getEventType() + " to the store!\n");
        handler.onEvent(event);
    }

    public List<? extends eventHandler> getEventHandler(Class<? extends abstractEvent> eventType) {
        List<? extends eventHandler> eventHandlerList = this.eventHandlerMap.get(eventType);
        return eventHandlerList;
    }
}
