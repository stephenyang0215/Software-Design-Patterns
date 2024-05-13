/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.Tea.BlackTea;
import edu.bu.met.cs665.Tea.GreenTea;
import edu.bu.met.cs665.Tea.YellowTea;
import edu.bu.met.cs665.coffee.Americano;
import edu.bu.met.cs665.coffee.Espresso;
import edu.bu.met.cs665.coffee.LatteMacchiato;

import java.util.Scanner;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    System.out.println("Welcome to the beverage vending machine!\n");
    while (true) {
      System.out.println(
              "Please enter the number for the beverage you want with the following options:\n" +
              "(1) Espresso: $3\n" +
              "(2) Americano: $3.5\n" +
              "(3) Latte Macchiato: $4\n" +
              "(4) Black Tea: $2\n" +
              "(5) Green Tea: $2\n" +
              "(6) Yellow Tea: $2"
      );
      Scanner scanner = new Scanner(System.in);
      //Enter the beverage option
      int input = Integer.parseInt(scanner.nextLine());
      if (input == 1) {
        Espresso espresso = new Espresso();
        espresso.beverage.runCondiment();
      } else if (input == 2) {
        new Americano();
        Americano americano = new Americano();
        americano.beverage.runCondiment();
      } else if (input == 3) {
        new LatteMacchiato();
        LatteMacchiato latteMacchiato = new LatteMacchiato();
        latteMacchiato.beverage.runCondiment();
      } else if (input == 4) {
        new BlackTea();
        BlackTea blackTea = new BlackTea();
        blackTea.beverage.runCondiment();
      } else if (input == 5) {
        GreenTea greenTea = new GreenTea();
        greenTea.beverage.runCondiment();
      } else if (input == 6) {
        YellowTea yellowTea = new YellowTea();
        yellowTea.beverage.runCondiment();
      }
    }
  }
}
