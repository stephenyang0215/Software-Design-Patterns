package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**

 * Name: Stephen Yang

 * Course: CS-665 Software Designs & Patterns

 * Date: 03/21/2024

 * File Name: TestCustomer.java

 * Description: This class instantiate tests
 */

public class TestCustomer {

    public TestCustomer() {
    }

    /*
     *Test the data with customerId 1 the old system fetch from external disk
     */
    @Test
    public void testCustomer1() {
        OldSystem usb = new OldSystem();
        assertEquals("Stephen", usb.getCustomer_USB(1));
    }

    /*
     *Test the data with customerId 1 the new system fetch from external server
     */
    @Test
    public void testCustomer2() {
        NewSystem https = new NewSystem();
        Adapter myconnector = new Adapter(https);
        assertEquals("Stephen", myconnector.getCustomer_USB(1));
    }

    /*
     *Test the data with customerId 2 the old system fetch from external disk
     */
    @Test
    public void testCustomer3() {
        OldSystem usb = new OldSystem();
        assertEquals("Frank", usb.getCustomer_USB(2));
    }

    /*
     *Test the data with customerId 2 the new system fetch from external server
     */
    @Test
    public void testCustomer4() {
        NewSystem https = new NewSystem();
        Adapter myconnector = new Adapter(https);
        assertEquals("Frank", myconnector.getCustomer_USB(2));
    }

}
