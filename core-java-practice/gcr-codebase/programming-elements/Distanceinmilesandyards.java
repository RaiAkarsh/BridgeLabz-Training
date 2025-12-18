import java.util.*;
public class Distanceinmilesandyards {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int distanceInFeet = x.nextInt();
        int totalYards = distanceInFeet / 3;
        int miles = totalYards / 1760;
        int yards = totalYards % 1760;
        System.out.print("Distance in miles is " + miles + ", yards is " + yards);
    }
    
}
