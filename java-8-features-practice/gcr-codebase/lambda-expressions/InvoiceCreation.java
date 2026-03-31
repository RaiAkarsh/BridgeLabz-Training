import java.util.*;

class Invoice {
    Invoice(String transactionId) {
        System.out.println("Invoice created for: " + transactionId);
    }
}

public class InvoiceCreation {
    public static void main(String[] args) {

        List<String> transactionIds = List.of("TXN1001", "TXN1002", "TXN1003");

        List<Invoice> invoices = transactionIds.stream().map(Invoice::new).toList();
    }
}
