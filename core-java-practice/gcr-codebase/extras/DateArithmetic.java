import java.time.LocalDate;
import java.util.Scanner;
public class DateArithmetic {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter date (YYYY-MM-DD)");
        String date = x.nextLine();

        LocalDate lDate = LocalDate.parse(date);
        LocalDate updated = lDate.plusDays(7).plusMonths(1).plusYears(2);
        updated = updated.minusWeeks(3);

        System.out.println("Original Date  " + date);
        System.out.println("Final Date     " + updated);
    }
}
