package Main;

import java.util.Scanner;

public class theSecretMonthGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        String[] months = {"janury", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};

        String secretMonth = months[4];
        System.out.println(secretMonth);

        int trys = 0;
        boolean guess = false;
        String month;

        System.out.println("\n*** This is the secret month game *** ");
        System.out.println(" ! You have 3 trys to guess the month !");

        do {
            System.out.print("\nWrite the month in lower case: ");
            month = input.next();
            trys += 1;

            if (month.equals(secretMonth)) {
                guess = true;
                break;
            } else if (trys < 3) {
                System.out.println("You missed! Try again");
            }

        } while (trys != 3);

        if (guess) {
            System.out.println("\nYou won!!! \nThanks for playing");
        } else {
            System.out.println("\nWell played... Better luck next time ;)");
        }

    }

}
