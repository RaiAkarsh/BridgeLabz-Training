import java.lang.reflect.Method;
import java.util.*;
public class UnitConverterKm {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the value ");
        double num = x.nextDouble();
        UnitConverterKm u = new UnitConverterKm();
        double miles = u.kmToMiles(num);
        double kilometers = u.milesToKm(num);
        double feet = u.metersToFeet(num); 
        double meters = u.feetToMeters(num);
        System.out.println(num + " kilometers is " + miles + " miles");
        System.out.println(num + " miles is " + kilometers + " kilometers");
        System.out.println(num  + " meters is " + feet + " feet");
        System.out.println(feet + " feet is " + meters + " meters");        
    }
    double kmToMiles(double km){
        double miles = 0.621371;
        return km * miles;
    }
    double milesToKm(double miles){
        double km = 1.60934;
        return miles * km;
    }
    double metersToFeet(double meters){
        double feet = 3.28084;
        return meters * feet;
    }
    double feetToMeters(double feet){
        double meters = 0.3048;
        return feet * meters;
    }
    
}




