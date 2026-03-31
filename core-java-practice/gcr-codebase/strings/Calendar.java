import java.util.Scanner;
public class Calendar {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter month (1-12) ");
        int month = x.nextInt();
        System.out.println("Enter year ");
        int year = x.nextInt();
        display(month, year);
    }
    public static String monthname(int month) {
        String[] months ={"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[month - 1];
    }
    public static boolean checkYear(int year) {
        return (year%400== 0) || (year%4== 0 && year% 100!=0);
    }
    public static int checkdays(int month, int year) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && checkYear(year)) {
            return 29;
        }
        return days[month-1];
    }
    public static int firstday(int day, int month, int year) {
        int y0 =year-(14-month)/12;
        int x =y0+y0/4-y0/100+y0/400;
        int m0 =month+12*((14-month)/12)-2;
        int d0 = (day +x+(31 * m0)/12)% 7;
        return d0; 
    }
    
    public static void display(int month, int year) {
        System.out.println("\n" + monthname(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = firstday(1, month, year);
        int daysInMonth = checkdays(month, year);
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("%3d ", i);
            if ((i+ firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
