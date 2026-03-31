import java.util.*;
public class TemperatureConvertor {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter temperature and  f if Fahrenheit to Celsius conversion or c for Celsius to Fahrenheit conversion");
        double temp = x.nextDouble();
        char conv = x.next().toLowerCase().charAt(0);
        if(conv == 'f'){
            convf(temp);
        }
        else if(conv == 'c'){
            convc(temp);
        }
        else{
            System.out.println("Invalid input");
        }
    }
    static void convf(double temp){
        double celsius = (temp - 32) * 5/9;
        System.out.println("Temperature in Celsius " + celsius);
    }
    static void convc(double temp){
        double fahrenheit = (temp * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit " + fahrenheit);
    }
    
}
