import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateFormatting {
    public static void main(String[] args) {
        LocalDate currDate = LocalDate.now();
        DateTimeFormatter dmy =DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter ymd =DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter emdy =DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Current Date in Different Formats");
        System.out.println("dd/MM/yyyy        " + currDate.format(dmy));
        System.out.println("yyyy-MM-dd        " + currDate.format(ymd));
        System.out.println("EEE, MMM dd, yyyy " + currDate.format(emdy));
    }
}
