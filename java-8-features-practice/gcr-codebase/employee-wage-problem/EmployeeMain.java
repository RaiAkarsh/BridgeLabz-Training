import java.util.*;
class EmployeeMain{
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computatio Program");
        EmpWageBuilder ew = new EmpWageBuilder();
        ew.computewages("cg", 20, 100,15);
    }
        
}