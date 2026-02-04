import java.time.*;
import java.time.format.*;
interface DateUtils{
    static String formatDate(LocalDate d,String p){
        return d.format(DateTimeFormatter.ofPattern(p));
    }
}

public class DateFormatUtility{
    public static void main(String[] args){
        System.out.println(DateUtils.formatDate(LocalDate.now(),"dd-MM-yyyy"));
    }
}
