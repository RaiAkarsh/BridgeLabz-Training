import java.util.*;
public class LineComparisonProblem {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Double line1= findlength(1);
		Double line2= findlength(2);
		//comparing two lines using equals method 
		if(Double.valueOf(line1).equals(line2)) {
			System.out.println("They are equal");
		}
		else {
			System.out.println("They are not equal");
		}
		//comparing two lines using compareTo method 
		int result = line1.compareTo(line2);
		if(result < 0) {
			System.out.println("Line 2 is greater than Line 1");
		}
		else if(result > 0) {
			System.out.println("Line 1 is greater than Line 2");
		}
		else {
			System.out.println("Both lines are equal");
		}

	}
	//calculating length of line 1 and line 2 
	public static double findlength(int i) {
		Scanner x =new Scanner(System.in);
		System.out.println("Enter the co-ordinates for the line "+i);
		int x1 =x.nextInt();
		int y1 =x.nextInt();
		int x2 =x.nextInt();
		int y2 =x.nextInt();
		double length= Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
		System.out.println("Length of the line "+i+" is "+length);
		return length;
	}

}
