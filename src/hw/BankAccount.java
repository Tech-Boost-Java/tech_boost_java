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
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 54000.50);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());
        account.setAccountNumber("987654321");
        System.out.println("Updated Account Number: " + account.getAccountNumber());
        account.setBalance(75700.75);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}
