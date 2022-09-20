package Service;

import Entity.BankAccount;
import java.util.Scanner;

public class AccountService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public BankAccount createAccount() {
        System.out.println("\nWelcome to the Bank\n");
        
        //BankAccount newAccount = new BankAccount();

        System.out.print("Enter your account number: ");
        int accountNum = input.nextInt();

        System.out.print("Enter your identification number: ");
        int id = input.nextInt();

        System.out.print("Enter your current balance: ");
        int balance = input.nextInt();

        BankAccount account = new BankAccount(accountNum, accountNum, balance);

        return account;

    }

    public void deposite(BankAccount account) {

        System.out.print("How much do you wants to deposite? $");
        int add = input.nextInt();
        
        account.setCurrentBalance(account.getCurrentBalance() + add);

    }

    public void withDraw(BankAccount account) {

        System.out.print("How much do you want to withdraw? $");
        int extract = input.nextInt();

        account.setCurrentBalance(account.getCurrentBalance() - extract);

    }

    public void quickWithdrawal(BankAccount account) {

        System.out.print("How much do you want to quick withdraw? $");
        int extract = input.nextInt();

        int porcentage20 = (int) (account.getCurrentBalance() * 0.2);
        if (porcentage20 == extract) {
            System.out.println("Your about to extract the 20% of your account");
            account.setCurrentBalance(account.getCurrentBalance() - porcentage20);
        } else {
            System.out.println("In the quick withdraw option, you only can extract the 20% of your account.");
        }

    }

    public void currentAmount(BankAccount account) {
        System.out.println("Your current amount is: $" + account.getCurrentBalance());

    }

    public void consultInformation(BankAccount account) {
        System.out.println(account);
    }
    
    public void menu(){
        System.out.println("\nNow, you can:");
        System.out.println("1) Make a deposite.");
        System.out.println("2) Make a Withdraw.");
        System.out.println("3) Make a quick Withdrawal (only the 20% of your account).");
        System.out.println("4) Know your current amount.");
        System.out.println("5) View all your account information.");
        System.out.println("0) Exit.");
    }

}
