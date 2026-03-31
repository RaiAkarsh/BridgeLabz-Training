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
            while(days<c.getMaxDays() && workingHours<c.getMaxHours()){
                int attendence = (int)(Math.random()*3);
                switch(attendence){
                    case 0:
                        dailywages=fullTime*c.getWages();
                        workingHours+=fullTime;
                        break;
                    case 1:
                        dailywages=partTime*c.getWages();
                        workingHours+=partTime;
                        break;
                    default:
                        dailywages=0;
                }
                c.getDailywages().add(dailywages);
                c.setTotalWages(c.getTotalWages()+dailywages);
                days++;
            }
        System.out.println("Company name : "+c.getName());
        System.out.println("Daily wages : "+ c.getDailywages());
        System.out.println("Total wages : "+ c.getTotalWages());
        System.out.println("------------------------------\n"); 
        }
    }
    public double getTotalWages(String company){
        for(CompanyEmpWage c: companywage){
            if(c.getName().equals(company)){
                return c.getTotalWages();
            }
        }
        return 0.0;
    }
}
