import java.util.Scanner;

public class CalculateWindChill {    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the temperature  and wind speed ");
        double temperature = x.nextDouble();
        double windSpeed = x.nextDouble();
        CalculateWindChill n =  new CalculateWindChill();
        double ans = n.calculate(temperature, windSpeed);
        System.out.println("Wind Chill is " + ans);
    }
    double calculate(double temperature, double windSpeed){
        double windChill= 35.74 +0.6215*temperature +(0.4275 *temperature - 35.75)* Math.pow(windSpeed,0.16);
        return windChill;
    }
}
