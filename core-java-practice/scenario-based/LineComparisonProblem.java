import java.util.*;
public class LineComparisonProblem {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the co-ordinates for the line 1 ");
		int x1 =x.nextInt();
		int y1 =x.nextInt();
		int x2 =x.nextInt();
		int y2 =x.nextInt();
		System.out.println("Enter the co-ordinates for the line 2 ");
		int a1 =x.nextInt();
		int b1 =x.nextInt();
		int a2 =x.nextInt();
		int b2 =x.nextInt();
		double lengthofline1= Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
		double lengthofline2= Math.sqrt(Math.pow(a2 - a1,2) + Math.pow(b2 - b1,2));
		String line1 = String.valueOf(lengthofline1);
		String line2 = String.valueOf(lengthofline2);
		if(line1.equals(line2)) {
			System.out.print("They are equal");
		}
		else {
			System.out.println("They are not equal");
		}

	}

}
