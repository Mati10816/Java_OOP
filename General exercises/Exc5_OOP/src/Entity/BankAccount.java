
package Entity;


public class BankAccount {
    
    private int accountNumber;
    private long identificationNumber;
    private int currentBalance;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, long identificationNumber, int currentBalance) {
        this.accountNumber = accountNumber;
        this.identificationNumber = identificationNumber;
        this.currentBalance = currentBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(long identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        return "Bank account data {" + "Account number: " + accountNumber + ", Identification number: " 
                + identificationNumber + ", Current balance: $" + currentBalance + '}';
    }
    
    
    
}
