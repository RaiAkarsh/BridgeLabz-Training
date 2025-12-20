import java.util.*;
public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double oldsalaries[] = new double[10];
        double newsalaries[] = new double[10];
        double yearsofservice[] = new double[10];
        double bonus[] = new double[10];
        double totalbonus = 0.0;
        double totalnewsalary = 0.0;
        double totaloldsalary = 0.0;

        for(int i=0;i<10;i++){
            System.out.println("Enter old salary");
            oldsalaries[i] = x.nextDouble();
            System.out.println("Enter years of service");
            yearsofservice[i] = x.nextDouble();
            if(oldsalaries[i]<0 || yearsofservice[i]<0){
                System.out.println("Invalid input enter again");
                i--; 
                continue;
            }
            if(yearsofservice[i]>5){
                bonus[i] = 0.05 * oldsalaries[i];
            }
            else{
                bonus[i] = 0.02 * oldsalaries[i];
            }
            newsalaries[i] = oldsalaries[i] + bonus[i];
            totalbonus+=bonus[i];
            totalnewsalary+=newsalaries[i];
            totaloldsalary+=oldsalaries[i];

        }
        System.out.println("Total old salary is "+ totaloldsalary);
        System.out.println("Total bonus is "+ totalbonus);
        System.out.println("Total new salary is "+ totalnewsalary);
    }
    
}
