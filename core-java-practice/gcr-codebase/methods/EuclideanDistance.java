import java.util.*;
public class EuclideanDistance {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter coordinates of first point (x1 y1) ");
        int x1 = x.nextInt();
        int y1 = x.nextInt();
        System.out.println("Enter coordinates of second point (x2 y2) ");   
        int x2 = x.nextInt();
        int y2 = x.nextInt();
        EuclideanDistance ed = new EuclideanDistance();
        double distance = ed.calculateDistance(x1, y1, x2, y2);
        ed.lineequation(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between the points " + distance);
    }
    public double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2)) + Math.sqrt(Math.pow((y2 - y1), 2));
    }
    public void lineequation(int x1, int y1, int x2, int y2) {
        int m=(y2 - y1)/(x2 - x1);
        int c=y1-m*x1;
        System.out.println("Equation of line: y = " + m + "x + " + c);
    }
    
}
