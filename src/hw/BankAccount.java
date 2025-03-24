package hw;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
        else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        }
        else {
            System.out.println("Insufficient balance.");
        }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 54000.50);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());
        account.setAccountNumber("987654321");
        System.out.println("Updated Account Number: " + account.getAccountNumber());
        account.setBalance(75700.75);
        System.out.println("Updated Balance: " + account.getBalance());
        account.deposit(5000.00);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(2000.00);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        account.withdraw(80000);
        account.deposit(-100);
        account.withdraw(-200);
    }
}
