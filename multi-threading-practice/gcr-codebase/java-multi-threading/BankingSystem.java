import java.util.Date;

class BankAccount {
    int balance = 10000;

    void withdraw(String name, int amt) {
        System.out.println("[" + name + "] Attempting to withdraw " + amt);

        if (balance >= amt) {
            try { Thread.sleep(200); } catch (Exception e) {}
            balance -= amt;
            System.out.println("Transaction successful: " + name +", Amount: " + amt +", Balance: " + balance +", Time: " + new Date());
        } 
        else {
            System.out.println("Transaction failed: " + name +", Balance: " + balance);
        }
    }
}

class Transaction implements Runnable {
    BankAccount acc;
    String name;
    int amt;

    Transaction(BankAccount acc, String name, int amt) {
        this.acc = acc;
        this.name = name;
        this.amt = amt;
    }

    public void run() {
        acc.withdraw(name, amt);
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        Thread t1 = new Thread(new Transaction(acc, "Customer-1", 3000));
        Thread t2 = new Thread(new Transaction(acc, "Customer-2", 4000));
        Thread t3 = new Thread(new Transaction(acc, "Customer-3", 2000));
        Thread t4 = new Thread(new Transaction(acc, "Customer-4", 5000));
        Thread t5 = new Thread(new Transaction(acc, "Customer-5", 1500));

        System.out.println("State before start: " + t1.getState());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
