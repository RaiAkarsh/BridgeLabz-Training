import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int year = x.nextInt();
        if(year < 1582){
            System.out.println("Enter a year after 1581");
            return;
        }
        if(year %400==0){
            System.out.println(year + " is a leap year");
        } else if(year %100==0){
            System.out.println(year + " is not a leap year");
        } else if(year %4==0){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
    
}
