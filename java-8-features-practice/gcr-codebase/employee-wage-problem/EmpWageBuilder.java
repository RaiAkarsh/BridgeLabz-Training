import java.util.*;
public class EmpWageBuilder implements IEmpWage {

    private CompanyEmpWage[] companywage;
    private int numOfCompany=0;
    public EmpWageBuilder(int size){
        companywage = new CompanyEmpWage[size];
    }
    public void addCompany(String name,double wages,int maxHours,int maxDays){
        companywage[numOfCompany++]=new CompanyEmpWage(name,wages,maxHours,maxDays);
    }

    public void computewages(){
        for(int i=0;i<numOfCompany;i++){
            CompanyEmpWage c = companywage[i];
            int fullTime=8,partTime=4,days=0,workingHours=0;
            double dailywages=0.0;
            while(days<c.maxDays && workingHours<c.maxHours){
                int attendence = (int)(Math.random()*3);
                switch(attendence){
                    case 0:
                        System.out.println("Full Time");
                        dailywages=fullTime*c.wages;
                        workingHours+=fullTime;
                        break;
                    case 1:
                        System.out.println("Part Time");
                        dailywages=partTime*c.wages;
                        workingHours+=partTime;
                        break;
                    default:
                        System.out.println("Employee is absent");
                        dailywages=0;
                }
                System.out.println("Daily wages : " + dailywages);
                c.totalWages+=dailywages;
                days++;
            }
        System.out.println("Company name : "+c.name);
        System.out.println("Total wages : "+ c.totalWages); 
        }
    }
}
