import java.util.*;
public class CompanyEmpWage {
    private String name ;
    private double wages;
    private int maxHours;
    private int maxDays;
    private double totalWages;
    private List<Double> dailywages;
    
    public CompanyEmpWage(String name,double wages,int maxHours,int maxDays){
        this.name=name;
        this.wages=wages;
        this.maxHours=maxHours;
        this.maxDays=maxDays;
        this.totalWages=0.0;
        this.dailywages = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public double getWages() {
        return wages;
    }
    public int getMaxHours() {
        return maxHours;
    }
    public int getMaxDays() {
        return maxDays;
    }
    public double getTotalWages() {
        return totalWages;
    }
    public List<Double> getDailywages() {
        return dailywages;
    }
    public void setTotalWages(double totalWages) {
        this.totalWages = totalWages;
    }
    public void setDailywages(List<Double> dailywages) {
        this.dailywages = dailywages;
    }
}
