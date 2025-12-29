import java.util.*;
public class SandeepFitness {
	public static void main(String []args) {
		Scanner x = new Scanner(System.in);
		int totalcount=0;
		int i=7;
		while(i>0) {
			System.out.println("is this the rest day? (yes/no)");
			String response = x.next().toLowerCase();
			if(response.equals("yes")) {
				i--;
				continue;
			}
			System.out.println("enter no. of pushups done today");
			int pushups = x.nextInt();
			totalcount += pushups;
			i--;
		}
		System.out.println("Total pushups are "+ totalcount);
	}

}
