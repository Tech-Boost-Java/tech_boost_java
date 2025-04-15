package QuizeTasks;

public class Bank {
    public static class BankAccount{
        private String accountNumber;
        private double balance;
        public BankAccount(String accountNumber,double balance){
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        public void setAccountNumber(String accountNumber){
            this.accountNumber = accountNumber;
        }
        public void setBalance(String accountNumber){
            this.balance = balance;
        }
        public String getAccountNumber(){
            return accountNumber ;
        }
        public double getBalance(){
            return balance ;
        }
        public void deposit(double deposit){
            balance = balance+deposit;
        }
        public void withdraw(double withdraw ){
            if(balance>=withdraw){
                balance=balance-withdraw;
            }
            else{
                System.out.println("Not enough money");
            }
        }
    }
    public static void main(String[] args) {



        BankAccount account = new BankAccount("123456789012",1000);
        System.out.println(account instanceof BankAccount);
        account.deposit(500);
        System.out.println(account.getBalance());
        account.withdraw(1000);
        System.out.println(account.getBalance());
        account.withdraw(1000);
        System.out.println(account.getBalance());

    }
}
