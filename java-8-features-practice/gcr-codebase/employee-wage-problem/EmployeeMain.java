import java.util.*;
class EmployeeMain{
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computatio Program");
        EmpWageBuilder ew = new EmpWageBuilder();
        ew.addCompany("Dmart", 20, 100, 20);
        ew.addCompany("Reliance", 25, 120, 22);
        ew.computewages();
    }
        
}