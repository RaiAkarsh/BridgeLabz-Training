import java.util.*;
public class CompanyEmpWage {
    String name ;
    double wages;
    int maxHours;
    int maxDays;
    double totalWages;
    List<Double> dailywages;
    
    public CompanyEmpWage(String name,double wages,int maxHours,int maxDays){
        this.name=name;
        this.wages=wages;
        this.maxHours=maxHours;
        this.maxDays=maxDays;
        this.totalWages=0.0;
        this.dailywages = new ArrayList<>();
    }
    public double getTotalWages(){
        return totalWages;
    }
}
