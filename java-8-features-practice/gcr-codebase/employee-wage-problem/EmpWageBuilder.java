import java.util.*;
public class EmpWageBuilder implements IEmpWage {
    List<CompanyEmpWage>companywage;
    public EmpWageBuilder(){
        companywage = new ArrayList<>();
    }
    public void addCompany(String name,double wages,int maxHours,int maxDays){
        companywage.add(new CompanyEmpWage(name,wages,maxHours,maxDays));
    }

    public void computewages(){
        for(CompanyEmpWage c: companywage){
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
                c.dailywages.add(dailywages);
                //System.out.println("Daily wages : " + dailywages);
                c.totalWages+=dailywages;
                days++;
            }
        System.out.println("Company name : "+c.name);
        System.out.println("Total wages : "+ c.totalWages); 
        }
    }
}
