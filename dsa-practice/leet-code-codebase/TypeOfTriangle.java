import java.util.Scanner;
public class TypeOfTriangle {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the lengths of the three sides of the triangle:");
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();


        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("none");
            return;
        }
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        }
        else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }
    }
}
