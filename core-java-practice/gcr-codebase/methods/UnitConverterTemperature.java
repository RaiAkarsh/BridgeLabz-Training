import java.util.*;
public class UnitConverterTemperature {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the number");
        double num = x.nextDouble();
        UnitConverterTemperature u = new UnitConverterTemperature();
        double celsius = u.fahrenheitToCelsius(num);    
        double fahrenheit = u.celsiusToFahrenheit(num);
        double kilograms = u.poundsToKilograms(num);
        double pounds = u.kilogramsToPounds(num);
        double liters = u.gallonsToLiters(num);
        double gallons = u.litersToGallons(num);
        System.out.println(num + " Fahrenheit is " + celsius + " Celsius");
        System.out.println(num + " Celsius is " + fahrenheit + " Fahrenheit");
        System.out.println(num + " pounds is " + kilograms + " kilograms");
        System.out.println(num + " kilograms is " + pounds + " pounds");
        System.out.println(num + " gallons is " + liters + " liters");
        System.out.println(num + " liters is " + gallons + " gallons");
    }
    double fahrenheitToCelsius(double farhenheit){
        double celsius = (farhenheit - 32) * 5 / 9;
        return celsius;
    }
    double celsiusToFahrenheit(double celsius){
        double f = (celsius * 9 / 5) + 32;
        return f;
    }
    double poundsToKilograms(double pounds){
        double km = 0.453592;
        return pounds * km;
    }
    double kilogramsToPounds(double kilograms){
        double pounds = 2.20462;
        return kilograms * pounds;
    }
    double gallonsToLiters(double gallons){
        double liters = 3.78541;
        return gallons * liters;
    }
    double litersToGallons(double liters){
        double gallons = 0.264172;
        return liters * gallons;
    }

    
}

