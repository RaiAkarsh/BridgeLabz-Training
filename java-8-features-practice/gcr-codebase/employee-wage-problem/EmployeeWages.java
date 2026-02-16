import java.util.*;
public class EmployeeWages {
    public static void computewages(){
        int fullTime=8,partTime=4,wages=20,dailywages=0,days=0,totalWages=0,workingHours=0;
        while(days<20 && workingHours<100){
            int attendence = (int)(Math.random()*3);
            switch(attendence){
                case 0:
                    System.out.println("Full Time");
                    dailywages=fullTime*wages;
                    workingHours+=fullTime;
                    break;
                case 1:
                    System.out.println("Part Time");
                    dailywages=partTime*wages;
                    workingHours+=partTime;
                    break;
                default:
                    System.out.println("Employee is absent");
                    dailywages=0;
            }
            System.out.println("Daily wages : " + dailywages);
            totalWages+=dailywages;
            days++;
        }
        System.out.println("Total wages : "+ totalWages);        
    }
}
