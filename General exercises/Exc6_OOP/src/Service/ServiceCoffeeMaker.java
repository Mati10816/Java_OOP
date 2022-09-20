package Service;

import Entity.CoffeeMaker;
import java.util.Scanner;

public class ServiceCoffeeMaker {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

//    public CoffeeMaker createCoffeePot() {
//
//        CoffeeMaker coffeePot = new CoffeeMaker(1000, 0);
//        return coffeePot;
//    }

    public void menu() {
        System.out.println("\nYou can:");
        System.out.println("1) Fill the coffee maker to the maximum (1000 mililiters).");
        System.out.println("2) Serve your cup.");
        System.out.println("3) Empty the Coffee Maker.");
        System.out.println("4) Add Coffee.");
        System.out.println("0) Exit.");
    }

    public void fillCoffeePot(CoffeeMaker CoffeePot) {
        CoffeePot.setCurrentQuantity(1000);
        System.out.println(" *** Your pot is full whit Coffee !\n");
    }

    public void serveCup(CoffeeMaker CoffeePot) {
        System.out.print("\nEnter the capacity of your cup (in mililiters): ");
        float cup = input.nextFloat();

        if (CoffeePot.getCurrentQuantity() >= cup) {
            CoffeePot.setCurrentQuantity(CoffeePot.getCurrentQuantity() - cup);
            System.out.println("\n -> Your cup is full whit coffee =D");

        } else if (CoffeePot.getCurrentQuantity() == 0) {
            System.out.println("Your Coffee Pot it´s empty. First you need to fill it.");
        } else {
            System.out.println("\n -> Your cup was filled whit " + CoffeePot.getCurrentQuantity() + " mililiters.");
            CoffeePot.setCurrentQuantity(0);
        }

    }

    public void emptyCoffeePot(CoffeeMaker CoffeePot) {
        if (CoffeePot.getCurrentQuantity() == 0) {
            System.out.println("\nYour Coffee pot is already empty...");
        } else {
            CoffeePot.setCurrentQuantity(0);

        }

    }

    public void addCoffee(CoffeeMaker CoffeePot) {
        System.out.print("Enter how many mililiters of coffee do you want to add: ");
        float coffee = input.nextFloat();

        while (coffee > 1000) {
            System.out.println("The quantity entered exceeds the maximum capacity of the coffee maker.");
            System.out.println("Remember that your coffee pot capacity is 1000 mililiters");
            System.out.print("\n   -> Enter again the mililiters of coffee do you want to add: ");
            coffee = input.nextFloat();
        }

        float total = coffee + CoffeePot.getCurrentQuantity();

        while (total > 1000) {
            System.out.println("The quantity entered plus the coffe in the pot exceeds the maximum capacity.");
            System.out.println("You have " + CoffeePot.getCurrentQuantity() + " mililiters of Coffee in your pot.");
            System.out.print("\n   -> Enter again the mililiters of coffee do you want to add: ");
            coffee = input.nextFloat();
            total = coffee + CoffeePot.getCurrentQuantity();

        }

        System.out.println("\n *** Great! The current quantity of Coffee now is: " + total + " mililiters.\n");
        CoffeePot.setCurrentQuantity(total);
    }

}
