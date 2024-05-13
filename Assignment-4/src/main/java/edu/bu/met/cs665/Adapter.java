package edu.bu.met.cs665;
/**

 * Name: Stephen Yang

 * Course: CS-665 Software Designs & Patterns

 * Date: 03/21/2024

 * File Name: Adapter.java

 * Description: It is the adapter class to re-wire interface and adaptee.
 * The wrapper object will translate the client calls into the ones to the adaptee
 * in a format it can understand.
 */
public class Adapter implements CustomerData_USB{
    //New system uses Https connection
    private CustomerData_HTTPS https;

    public Adapter(CustomerData_HTTPS https) {
        this.https = https;
    }

    @Override
    public void printCustomer(int customerId) {
        https.printCustomer(customerId);
    }

    @Override
    public String getCustomer_USB(int customerId) {
        return https.getCustomer_HTTPS(customerId);
    }
}
