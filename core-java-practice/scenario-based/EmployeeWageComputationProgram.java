import java.util.*;
public class EmployeeWageComputationProgram {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int days=0;
		int hours=0;
		int TotalWage=0,RegularWage=0,PartTimeWage=0;
		while(true) {
			int attendance = (int)(Math.random()*2); 
			switch(attendance) {
			case 1:
				days++;
				System.out.println("Regular Day "+days+" Present");
				RegularWage+=8*20;
				hours+=8;
				break;
			case 0:
				days++;
				System.out.println("Regular Day "+days+" Absent");
				break;
			}
			int parttimeattendance = (int)(Math.random()*2); 
			switch(parttimeattendance) {
			case 1:
				System.out.println("Part-Time Day "+days+" Present");
				PartTimeWage+=4*20;
				hours+=4;
				break;
			case 0:
				System.out.println("Part-Time Day "+days+" Absent");
				break;
			}
			if(hours>=160 || days>=20) { 
				break;
			}			
		}
		TotalWage += RegularWage + PartTimeWage; 
		System.out.println("Regular wage for a month "+ RegularWage);
		System.out.println("Part-Time wage for a month "+ PartTimeWage);
		System.out.println("Total wage for a month "+ TotalWage);

	}

}
