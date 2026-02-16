import java.util.*;
class EmployeeMain{
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computatio Program");
        int attendence = (int)(Math.random()*2);
        if(attendence==0){
            System.out.println("Employee is Absent");
            System.out.println("Daily wage : "+0);
        }
        else{
            System.out.println("Employee is Present");
            System.out.println("Daily wage : "+20*8);
        }
    }
}