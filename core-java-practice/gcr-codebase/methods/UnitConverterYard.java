import java.util.*;
public class UnitConverterYard {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the value ");
        double num = x.nextDouble();
        UnitConverterYard u = new UnitConverterYard();
        double feet = u.yardsToFeet(num);
        double yards = u.feetToYards(num);
        double inches = u.metersToInches(num); 
        double meters = u.inchesToMeters(num);
        double cm = u.inchesToCentimeters(num);
        System.out.println(num + " yards is " + feet + " feet");
        System.out.println(num + " feet is " + yards + " yards");
        System.out.println(num  + " meters is " + inches + " inches");
        System.out.println(num + " inches is " + meters + " meters");
        System.out.println(num  + " inches is " + cm + " centimeters");
    }  
    double yardsToFeet(double yards){
        double feet = 3;
        return yards * feet;
    }
    double feetToYards(double feet){
        double yards = 0.333333;
        return feet * yards;
    }
    double metersToInches(double meters){
        double inches = 39.3701;
        return meters * inches;
    }
    double inchesToMeters(double inches){
        double meters = 0.0254;
        return inches * meters;
    }
    double inchesToCentimeters(double inches){
        double centimeters = 2.54;
        return inches * centimeters;
    }
}

