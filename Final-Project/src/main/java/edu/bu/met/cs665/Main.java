/**
 * Name: Stephen Yang
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/25/2024
 * File Name: Main.java
 * Description: A main method to run examples.
 */

package edu.bu.met.cs665;

import java.util.ArrayList;

public class Main {

  /**
   * First, we start the boba tea order with the ice units of 6, sugar of 2,  toppings of 2
   * Dispatcher receives the event and its handler to trigger the shop to produce the drinks
   * After which, it noticed the ice stock was under the threshold we set for the shop.
   * Then, we placed the inventory event to restock the shop.
   * At the end, the shop has 11 units of sugar, 11 units of toppings, and 14 units of ice for the stock.
   */
  public static void main(String[] args) {
    //Initiate a Boba store
    Shop shop = new Shop(10,10,10);
    //Create a dispatcher
    eventDispatcher dispatcher = new eventDispatcher();

    //Create an order event
    orderEvent order = new orderEvent(shop,6,2,2);
    //Create an order handler
    orderHandler orderHandler = new orderHandler("OrderHandler1");
    dispatcher.registerHandler(orderEvent.class, new ArrayList<eventHandler>() { {add(orderHandler);}});
    dispatcher.fireEvent(order);

    //Create an inventory event
    inventoryEvent inventory = new inventoryEvent(shop, 10, 3, 3);
    //Create an inventory handler
    inventoryHandler inventoryHandler = new inventoryHandler("InventoryHandler1");
    dispatcher.registerHandler(inventoryEvent.class, new ArrayList<eventHandler>() { {add(inventoryHandler);}});
    dispatcher.fireEvent(inventory);
  }
}
