interface Loanable {
    String applyForLoan();
    double calculateLoanEligibility();
}
abstract class BankAccount implements Loanable {
    private String accountNumber;
    private String holderName;
    private double balance;

    BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    abstract double calculateInterest();
    public String applyForLoan() {
        return "Loan application not available for this account type.";
    }
    public double calculateLoanEligibility() {
        return 0;
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
        System.out.println("Loan Application: " + applyForLoan());
        System.out.println("Loan Eligibility: " + calculateLoanEligibility());
        System.out.println("---------------------------");
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(String accountNumber, String holderName, double initialBalance, double interestRate) {
        super(accountNumber, holderName, initialBalance);
        this.interestRate = interestRate;
    }

    double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    public String applyForLoan() {
        return "Eligible for personal loan.";
    }

    public double calculateLoanEligibility() {
        return getBalance() * 0.5;
    }
}
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    CurrentAccount(String accountNumber, String holderName, double initialBalance, double overdraftLimit) {
        super(accountNumber, holderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    double calculateInterest() {
        return 0; 
    }

    public String applyForLoan() {
        return "Eligible for business loan.";
    }

    public double calculateLoanEligibility() {
        return getBalance() * 0.8 + overdraftLimit;
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA123", "Alice", 1000.0, 5.0);
        BankAccount current = new CurrentAccount("CA456", "Bob", 2000.0, 500.0);

        savings.displayAccountDetails();
        current.displayAccountDetails();
    }
}
