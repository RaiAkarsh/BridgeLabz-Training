import java.util.*;
public class HeightInFeetAndInches {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int cm=x.nextInt();
        double inches=cm/2.54;
        int feet=(int)inches/12;
        inches=inches%12;
        System.out.print("Your Height in cm is "+cm+" while in feet is "+feet+" and inches is "+(int)inches);
    }

    
}
