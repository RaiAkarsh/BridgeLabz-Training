import java.util.*;
import java.time.*;

public class LoggingTransactions {
    public static void main(String[] args) {
        List<String> transactionsIds = List.of("TX001", "TX002", "TX003");
        transactionsIds.forEach(id -> System.out.println(LocalDateTime.now() + " - " + id));
    }
}