import java.util.*;
public class BankingSystem {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        HashMap<Integer, Integer> accountBalanceMap = new HashMap<>();
        Queue<Integer> withdrawalQueue = new LinkedList<>();

        System.out.println("Enter number of bank accounts:");
        int accountCount = x.nextInt();

        System.out.println("Enter account number and balance:");
        for (int i = 0; i < accountCount; i++) {
            int accountNumber = x.nextInt();
            int balance = x.nextInt();
            accountBalanceMap.put(accountNumber, balance);
        }

        TreeMap<Integer, Integer> sortedByBalance = new TreeMap<>();
        for (Map.Entry<Integer, Integer> entry : accountBalanceMap.entrySet())
            sortedByBalance.put(entry.getValue(), entry.getKey());

        System.out.println("Enter number of withdrawal requests:");
        int requestCount = x.nextInt();

        System.out.println("Enter account numbers for withdrawal:");
        for (int i = 0; i < requestCount; i++)
            withdrawalQueue.add(x.nextInt());

        System.out.println("----- Accounts Sorted by Balance -----");
        System.out.println(sortedByBalance);

        System.out.println("----- Processing Withdrawal Requests -----");
        while (!withdrawalQueue.isEmpty())
            System.out.println("Processing withdrawal for Account No: " + withdrawalQueue.remove());
    }
}
