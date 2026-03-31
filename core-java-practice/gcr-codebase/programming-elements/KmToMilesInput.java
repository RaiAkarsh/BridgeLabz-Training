import java.util.*;
public class KmToMilesInput {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int km = x.nextInt();
        double miles = km / 1.6;
        System.out.println("The distance " + km +" km in miles is " + miles);
    }
}
