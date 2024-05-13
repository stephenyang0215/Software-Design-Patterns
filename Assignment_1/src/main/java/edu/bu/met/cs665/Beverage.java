package edu.bu.met.cs665;

import java.util.Scanner;

public class Beverage {
    //Refactoring: Form Template Method
    //Refactoring: Inline Method
    public String beverage; // Name of the beverage
    public int milk; // Units of the milk
    public int sugar; // Units of the sugar
    public double price; // Price for the beverage

    public Beverage(String beverage) {
        super();
        this.beverage = beverage;
        this.milk = 0;
        this.sugar = 0;
    }

    public void brewCoffee() {
        System.out.println("Grind Coffee Beans.");
        System.out.println("Distribute the coffee evenly within the portafilter.");
        System.out.println("Start the Shot Extract");
    }

    public void brewTea() {
        System.out.println("Place the tea bag into the mug");
        System.out.println("Pouring boiling water into the mug.");
        System.out.println("Brew for two to three minutes");
    }

    //Add condiment: milk
    public void AddMilk(int unit) {
        do {
            if (unit >= 0 && unit <= 3) {
                System.out.println("Add " + unit + " units of milk to your drink!");
                this.milk = unit;
                return;
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.println("The input value for milk unit to add is invalid. Try it again!");
                unit = scanner.nextInt();
            }
        } while (true);
    }

    //Add condiment: sugar
    public void AddSugar(int unit) {
        do {
            if (unit >= 0 && unit <= 3) {
                System.out.println("Add " + unit + " units of sugar to your drink!");
                this.sugar = unit;
                return;
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.println("The input value for sugar unit to add is invalid. Try it again!");
                unit = scanner.nextInt();
            }
        } while (true);
    }


    //The function to ask whether to add condiments and the units with sugar and milk to add to
    public void runCondiment() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Would you like condiments for your beverage? 1 for yes. 2 for no.");
        while (true) {
            Integer condiments = scanner1.nextInt();
            if (condiments == 1) {
                System.out.println("Enter this units of milk for your beverage!");
                int MilkUnit = scanner1.nextInt();
                this.AddMilk(MilkUnit);
                System.out.println("Enter this units of sugar for your beverage!");
                int SugarUnit = scanner1.nextInt();
                this.AddSugar(SugarUnit);
                break;
            } else if (condiments == 2) {
                System.out.println("No Condiment!");
                break;
            } else {
                System.out.println("The option is invalid. Please try it again!");
            }
        }
        this.getPrice();
    }

    //Get the price for the beverage
    public double getPrice() {
        this.price = (this.milk * 0.5 + this.sugar * 0.5) + this.price;
        System.out.println("The price for the " + this.beverage + " you ordered: " + this.price);
        return this.price;
    }

    //Get the name for the beverage
    public String getBeverage() {
        return this.beverage;
    }

    //Get the number of the unit with milk
    public int getMilk() {
        return this.milk;
    }

    //Get the number of the unit with sugar
    public int getSugar() {
        return this.sugar;
    }
}
