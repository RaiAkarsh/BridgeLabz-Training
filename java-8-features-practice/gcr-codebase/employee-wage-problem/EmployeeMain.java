import java.util.*;
class EmployeeMain{
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computatio Program");
        int attendence = (int)(Math.random()*2);
        int fullTime=8,partTime=4,wages=20,dailywages=0;
        if(attendence==1){
            int typeOfWork= (int)(Math.random()*2);
            switch(typeOfWork){
                case 0:
                    System.out.println("Full Time");
                    dailywages=fullTime*wages;
                    break;
                case 1:
                    System.out.println("Part Time");
                    dailywages=partTime*wages;
            }
            System.out.println("Daily wages : " + dailywages);
        }
        else{
            System.out.println("Employee is absent");
        }
    }
}