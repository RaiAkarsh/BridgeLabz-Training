import java.util.*;
public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int perimeter = x.nextInt();
        int side = perimeter/4;
        System.out.print("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}