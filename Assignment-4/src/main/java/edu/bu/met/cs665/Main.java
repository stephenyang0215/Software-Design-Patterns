/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

/**

 * Name: Stephen Yang

 * Course: CS-665 Software Designs & Patterns

 * Date: 03/21/2024

 * File Name: Main.java

 * Description: This class instantiate the system classes.
 * It instantiates the interface to wrap the https object
 * to make it compatible with the old system for client.
 */
public class Main {

  public static void main(String[] args) {
    //old system API
    OldSystem usb = new OldSystem();
    //get customer Stephen through the usb method
    System.out.println("Get Customer data:");
    usb.getCustomer_USB(1);
    usb.printCustomer(1);

    //adapter - making two interfaces compatible
    //get customer Frank through the https method
    NewSystem https = new NewSystem();
    Adapter myconnector = new Adapter(https);
    System.out.println("Get Customer data:");
    myconnector.getCustomer_USB(2);
    myconnector.printCustomer(2);

  }



}
