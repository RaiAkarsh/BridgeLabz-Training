import java.util.*;
public class EmpWageBuilder {
    private String name ;
    private double wages;
    private int maxHours;
    private int maxDays;
    private double totalWages;

    public EmpWageBuilder(String name,double wages,int maxHours,int maxDays){
        this.name=name;
        this.wages=wages;
        this.maxHours=maxHours;
        this.maxDays=maxDays;
        this.totalWages=0.0;
    }

    public void computewages(){
        int fullTime=8,partTime=4,days=0,workingHours=0;
        double dailywages=0.0;
        while(days<maxDays && workingHours<maxHours){
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
        System.out.println("Company name : "+name);
        System.out.println("Total wages : "+ totalWages);        
    }

    public double getTotalWages(){
        return totalWages;
    }
}
