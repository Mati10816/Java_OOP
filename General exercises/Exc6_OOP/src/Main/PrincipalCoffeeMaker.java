package Main;

import Entity.CoffeeMaker;
import Service.ServiceCoffeeMaker;
import java.util.Scanner;

public class PrincipalCoffeeMaker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        ServiceCoffeeMaker newCoffeePot = new ServiceCoffeeMaker();
        //CoffeeMaker pot1 = newCoffeePot.createCoffeePot(); //This it´s NO necesary because the constructor it´s ready whit the default values
        CoffeeMaker pot1 = new CoffeeMaker();
        
        System.out.println("\nWelcome to your Coffee Maker Program");
        newCoffeePot.menu();
        int option;

        do {
            System.out.println("\n----------------");
            System.out.print("Enter your option > ");
            option = input.nextInt();
            
            
            

            switch (option) {
                case 1:
                    newCoffeePot.fillCoffeePot(pot1);
                    break;
                case 2:
                    newCoffeePot.serveCup(pot1);
                    break;
                case 3:
                    newCoffeePot.emptyCoffeePot(pot1);
                    break;
                case 4:
                    newCoffeePot.addCoffee(pot1);
                    break;
                case 0:
                    System.out.println("\nThank you for using our Coffee Program");
                    break;
                default:
                    System.out.println("The entered option is no correct. Please, read the menu again...");

            }

        } while (option != 0);

    }

}
