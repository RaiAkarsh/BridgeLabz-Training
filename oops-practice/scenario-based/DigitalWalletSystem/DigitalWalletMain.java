import java.util.*;

public class DigitalWalletMain {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        Wallet wallet = new Wallet();
        TransferService service = new WalletTransfer(wallet);

        int choice = -1;

        while (choice != 0) {
            System.out.println("------------------------");
            System.out.println("1 Add Money");
            System.out.println("2 Withdraw");
            System.out.println("3 Transfer");
            System.out.println("4 View Balance");
            System.out.println("5 Reset Wallet");
            System.out.println("0 Exit");
            System.out.println("Enter choice: ");
            System.out.println("------------------------");
            choice = x.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Enter the amount");
                        wallet.addMoney(x.nextDouble());
                        break;
                    case 2:
                        System.out.println("Enter the amount to withdraw");
                        wallet.withdraw(x.nextDouble());
                        break;
                    case 3:
                        System.out.println("Enter the amount to transfer");
                        service.transfer(x.nextDouble());
                        break;
                    case 4:
                        System.out.println(wallet.balance);
                        break;
                    case 5:
                        wallet.balance = 0;
                        break;
                }
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
