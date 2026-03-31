import java.util.Scanner;
class BankAccount {
    String accountNumber;
    double balance;
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }
    void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn is : " + amount);
        }
        else {
            System.out.println("Invalid withdraw amount");
        }
    }
    void checkBalance() {
        System.out.println("Current Balance is : " + balance);
    }
}

public class BankAccountManager {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter account number, initial balance, deposit amount, withdraw amount:");
        String accNumber= x.nextLine();
        double balance= x.nextDouble();
        double depositAmount= x.nextDouble();
        double withdrawAmount= x.nextDouble();
        BankAccount acc = new BankAccount(accNumber, balance);
        acc.deposit(depositAmount);
        acc.checkBalance();
        acc.withdraw(withdrawAmount);
        System.out.println("Enter amount to withdraw:");
        withdrawAmount=x.nextDouble();
        acc.withdraw(withdrawAmount); 
        acc.checkBalance();
    }
}
