import java.util.*;
public class RohanLibraryReminderApp {
	public static void main(String []args) {
		Scanner x = new Scanner(System.in);
		int totalfine=0;
		for(int i=0;i<5;i++) {
			System.out.println("enter return date(number)");
			int returndate=x.nextInt();
			System.out.println("enter due date(number)");
			int duedate =x.nextInt();
			if(returndate > duedate) {
				int fine= (returndate-duedate)*5;
				totalfine += fine;
				System.out.println("Fine for book "+(i+1)+" is "+ fine);
			}
			else {
				System.out.println("NO fine");
			}
		}
		System.out.println("Total Fine: "+totalfine);
	}

}
