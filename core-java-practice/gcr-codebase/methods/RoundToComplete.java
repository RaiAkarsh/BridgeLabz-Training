import java.util.*;
public class RoundToComplete{
	public static void main(String []args){
		Scanner x = new Scanner(System.in);
		System.out.println("enter the sides of triangle");
		int side1 = x.nextInt();
		int side2 = x.nextInt();
		int side3 = x.nextInt();
		RoundToComplete r = new RoundToComplete();
		int total = r.calculate(side1,side2,side3);
		System.out.println("total rounds needed are "+ total);
	}
	int calculate(int s1 ,int s2, int s3){
		double perimeter = s1+s2+s3;
		int rounds = (int) Math.ceil(5000/perimeter); // km to meter 5km to 5000 meters
		return rounds;
	}
}