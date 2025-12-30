import java.util.*;
public class LineComparisonProblem {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the co-ordinates for the line  ");
		int x1 =x.nextInt();
		int y1 =x.nextInt();
		int x2 =x.nextInt();
		int y2 =x.nextInt();
		double lengthofline= Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
		System.out.println(lengthofline);
		

	}

}
