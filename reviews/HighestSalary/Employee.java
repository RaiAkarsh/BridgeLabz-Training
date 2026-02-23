import java.util.*;
public class Employee {
    int id;
    double salary;

    public Employee(int id,double salary){
        this.id=id;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }

    public double getSalary(){
        return salary;
    }

    public static void sortSalary(HashMap<String,Employee> map){
        double max=0;
        double secondMax=0;
        double thirdMax=0;
        for(Employee e:map.values()){
            if(e.getSalary()>max){
                thirdMax=secondMax;
                secondMax=max;
                max=e.getSalary();
            }
            else if(e.getSalary()>secondMax && e.getSalary()!=max){
                thirdMax=secondMax;
                secondMax=e.getSalary();
            }
            else if(e.getSalary()>thirdMax && e.getSalary()!=secondMax && e.getSalary()!=max){
                thirdMax=e.getSalary();
            }
        }
        System.out.println("Second Highest Salary: "+secondMax);
        System.out.println("Third Highest Salary: "+thirdMax);
    

    }
}

