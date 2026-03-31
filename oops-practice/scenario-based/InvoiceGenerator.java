import java.util.Scanner;
public class InvoiceGenerator {
    static String[] parseInvoice(String str) {
        String[] items = str.split(", ");
        for (int i=0; i<items.length;i++) {
            if (!items[i].contains("-") || !items[i].contains("INR")) {
                System.out.println("Invalid invoice format: " + items[i]);
                return null;
            }
        }
        return items;
   }
    static int getTotalAmount(String[] tasks) {
        if (tasks == null) {
            return 0;
        }
        int total = 0;
        for (int i = 0;i<tasks.length;i++) {
            String amount = tasks[i].split("-")[1].replace("INR", "").trim();
            int value = 0;
            for (int j = 0; j < amount.length(); j++) {
                value = value * 10 + (amount.charAt(j) - '0');
            }
        total += value;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the invoice details:");
        String str = x.nextLine();
        String [] tasks = parseInvoice(str);
        System.out.println("The total amount is: " + getTotalAmount(tasks));
    }
}
