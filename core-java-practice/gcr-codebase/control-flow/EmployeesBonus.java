
import java.util.*;
public class EmployeesBonus {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int salary=x.nextInt();
		int years= x.nextInt();
		if(years>5) {
			double bonus= salary *.05;
			System.out.print("bonus is "+bonus);
		}
		else {
			System.out.print("No bonus");
		}

	}
}

