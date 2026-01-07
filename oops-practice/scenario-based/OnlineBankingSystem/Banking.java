import java.util.Scanner;
import java.util.ArrayList;

public class Banking implements BankService {

    // TRANSACTION HISTORY
    static ArrayList<String> transactionHistory = new ArrayList<>();

    public void transfer(Account from, Account to, double amount) throws InsufficientBalanceException {
        from.withdraw(amount);
        to.deposit(amount);
        transactionHistory.add("Transferred ₹" + amount + " from Acc " + from.accountNumber +" to Acc " + to.accountNumber);
        System.out.println("Transferred ₹" + amount);
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Banking bank = new Banking();
        // SAVINGS ACCOUNT INPUT
        System.out.print("Enter Savings Account Number: ");
        int savAccNo = x.nextInt();
        x.nextLine();
        System.out.print("Enter Savings Account Holder Name: ");
        String savName = x.nextLine();
        System.out.print("Enter Initial Balance: ");
        double savBal = x.nextDouble();
        x.nextLine();

        SavingsAccount acc1 = new SavingsAccount(savAccNo, savName, savBal);

        // CURRENT ACCOUNT INPUT
        System.out.print("Enter Current Account Number: ");
        int curAccNo = x.nextInt();
        x.nextLine();

        System.out.print("Enter Current Account Holder Name: ");
        String curName = x.nextLine();

        System.out.print("Enter Initial Balance: ");
        double curBal = x.nextDouble();

        CurrentAccount acc2 = new CurrentAccount(curAccNo, curName, curBal);

        // MENU LOOP
        while (true) {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Deposit (Savings)");
            System.out.println("2. Withdraw (Savings)");
            System.out.println("3. Transfer (Savings → Current)");
            System.out.println("4. Check Balance");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = x.nextInt();

            try {
                switch (choice) {

                    case 1: // DEPOSIT
                        System.out.print("Enter amount to deposit: ");
                        double dep = x.nextDouble();
                        acc1.deposit(dep);
                        transactionHistory.add("Deposited ₹" + dep + " to Savings Acc " + acc1.accountNumber);
                        System.out.println("Deposit successful");
                        break;

                    case 2: // WITHDRAW
                        System.out.print("Enter amount to withdraw: ");
                        double wd = x.nextDouble();
                        acc1.withdraw(wd);
                        transactionHistory.add("Withdrawn ₹" + wd + " from Savings Acc " + acc1.accountNumber);
                        System.out.println("Withdraw successful");
                        break;

                    case 3: // TRANSFER
                        System.out.print("Enter amount to transfer: ");
                        double tr = x.nextDouble();
                        bank.transfer(acc1, acc2, tr);
                        break;

                    case 4: // BALANCE
                        System.out.println("Savings (" + acc1.accountNumber + ") Balance: ₹" + acc1.getBalance());
                        System.out.println("Current (" + acc2.accountNumber + ") Balance: ₹" + acc2.getBalance());
                        break;

                    case 5: // TRANSACTION HISTORY
                        System.out.println("\n--- TRANSACTION HISTORY ---");
                        if (transactionHistory.isEmpty()) {
                            System.out.println("No transactions yet.");
                        } else {
                            for (String t : transactionHistory) {
                                System.out.println(t);
                            }
                        }
                        break;

                    case 6: // EXIT
                        System.out.println("Thank you for using Bank System");
                        return;

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
