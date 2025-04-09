package Practical2;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    // Add deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    // Add withdraw method
    public boolean withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}