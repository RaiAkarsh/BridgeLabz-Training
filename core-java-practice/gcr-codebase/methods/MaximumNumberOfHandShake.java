import java.util.*;
public class MaximumNumberOfHandShake{
	public static void main(String []args){
		Scanner x = new Scanner(System.in);
		System.out.println("enter no. of students");
		int students = x.nextInt();
		MaximumNumberOfHandShake m = new MaximumNumberOfHandShake();
		int max = m.count(students);
		System.out.println(max);
	}
	
	int count(int n){
		int max = (n * (n - 1)) / 2;
		return max;
	}
}