/**

 * Name: Stephen Yang

 * Course: CS-665 Software Designs & Patterns

 * Date: 03/21/2024

 * File Name: NewSystem.java

 * Description: It is the class for new system
 */
package edu.bu.met.cs665;

public class NewSystem implements CustomerData_HTTPS{
    //Use customerId to look up the data in Customer class
    @Override
    public void printCustomer(int customerId) {
        String customer = Customer.getCustomers(customerId);
        System.out.println(customer);
    }

    @Override
    public String getCustomer_HTTPS(int customerId) {
        String customer = Customer.getCustomers(customerId);
        return customer;
    }
}
