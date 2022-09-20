package Main;

import Entity.BankAccount;
import Service.AccountService;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int option;

        AccountService newAccount = new AccountService();

        BankAccount account1 = newAccount.createAccount();

        newAccount.menu();

        do {
            System.out.print("\nEnter your option > ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    newAccount.deposite(account1);
                    break;
                case 2:
                    newAccount.withDraw(account1);
                    break;
                case 3:
                    newAccount.quickWithdrawal(account1);
                    break;
                case 4:
                    newAccount.currentAmount(account1);
                    break;
                case 5:
                    newAccount.consultInformation(account1);
                    break;
                case 0:
                    System.out.println("\nThank you for using our Bank");
                    break;
                default:
                    System.out.println("The entered option is no correct. Please, read the menu again...");

            }

        } while (option != 0);

    }

}
