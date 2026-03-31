import java.time.LocalDate;
import java.util.Scanner;
public class CompareDate {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter  first date (YYYY-MM-DD)");
        String date = x.nextLine();
        LocalDate first = LocalDate.parse(date);
        System.out.println("Enter  second date (YYYY-MM-DD)");
        date = x.nextLine();    
        LocalDate second = LocalDate.parse(date);
        if(first.isBefore(second)) {
            System.out.println(first + " is before " + second);
        } 
        else if(first.isAfter(second)) {
            System.out.println(first + " is after " + second);
        } 
        else {
            System.out.println(first + " is equal to " + second);
        }    
    }
}
