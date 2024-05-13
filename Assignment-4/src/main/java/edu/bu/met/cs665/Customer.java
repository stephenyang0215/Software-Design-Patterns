/**

 * Name: Stephen Yang

 * Course: CS-665 Software Designs & Patterns

 * Date: 03/21/2024

 * File Name: Customer.java

 * Description: It is the class using hashmap to store customer data where the systems can fetch from
 */
package edu.bu.met.cs665;
import java.util.HashMap;
import java.util.Map;

public class Customer {
    //Key: customerId Value: customer
    private static final Map<Integer, String> customers = new HashMap<Integer, String>() {{
        put(1, "Stephen");
        put(2, "Frank");
    }};

    public static String getCustomers(Integer customerId) {
        return customers.get(customerId);
    }

    //https connection
    public static String https(Integer customerId) {
        System.out.println("Invoke HTTPS connection to an external server");
        return customers.get(customerId);
    }

    //usb connection
    public static String usb(Integer customerId) {
        System.out.println("Invoke USB connection to an external disk");
        return customers.get(customerId);
    }
}
