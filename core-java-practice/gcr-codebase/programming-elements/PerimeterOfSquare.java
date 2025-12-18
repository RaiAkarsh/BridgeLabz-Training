import java.util.*;
public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int side = x.nextInt();
        int perimeter = 4 * side;
        System.out.print("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}