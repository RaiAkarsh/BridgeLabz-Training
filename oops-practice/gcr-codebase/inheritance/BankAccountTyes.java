class BankAccount {
    String accountNumber;
    double balance;
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;
    public SavingsAccount(String accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    @Override
    public void displayAccountInfo(){
        System.out.println("Savings Account Details:");
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    @Override
    public void displayAccountInfo(){
        System.out.println("Checking Account Details:");
        super.displayAccountInfo();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount {
    int duration;
    public FixedDepositAccount(String accountNumber, double balance, int duration){
        super(accountNumber, balance);
        this.duration = duration;
    }
    @Override
    public void displayAccountInfo(){
        System.out.println("Fixed Deposit Account Details:");
        super.displayAccountInfo();
        System.out.println("Duration: " + duration + " months");
    }
}
public class BankAccountTyes {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("SA123", 5000.0, 3.5),
            new CheckingAccount("CA456", 2000.0, 1000.0),
            new FixedDepositAccount("FDA789", 10000.0, 12)
        };

        for (BankAccount account : accounts) {
            account.displayAccountInfo();
            System.out.println();
        }
    }
}
