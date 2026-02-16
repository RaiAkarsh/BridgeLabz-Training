public class CompanyEmpWage {
    String name ;
    double wages;
    int maxHours;
    int maxDays;
    double totalWages;
    
    public CompanyEmpWage(String name,double wages,int maxHours,int maxDays){
        this.name=name;
        this.wages=wages;
        this.maxHours=maxHours;
        this.maxDays=maxDays;
        this.totalWages=0.0;
    }
    public double getTotalWages(){
        return totalWages;
    }
}
