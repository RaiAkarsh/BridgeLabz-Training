import java.util.function.Predicate;
public class TemperatureAlertSystem{
    public static void main(String[] args){
        Predicate<Double> alert=t->t>40;
        System.out.println(alert.test(55.0)?"ALERT":"NORMAL");
    }
}
