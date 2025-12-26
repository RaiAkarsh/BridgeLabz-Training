import java.util.*;
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the year ");
        int year = x.nextInt();
        CheckLeapYear c= new CheckLeapYear();
        boolean ans =c.isLeapYear(year);
        if(ans){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
    boolean isLeapYear(int year){
        if(year>=1582 && (year%4== 0 && year % 100!=0) || (year % 400==0)){
            return true;
        }
        return false;
    }
    
}
