import java.util.*;
class EmployeeMain{
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computatio Program");
        EmpWageBuilder ew = new EmpWageBuilder("cg", 20, 100,15);
        ew.computewages();
        EmpWageBuilder e = new EmpWageBuilder("Hi", 20, 80,20);
        e.computewages();
    }
        
}