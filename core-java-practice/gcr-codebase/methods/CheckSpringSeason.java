import java.util.*;
public class CheckSpringSeason {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter month and date");
        int month = x.nextInt();
        int date = x.nextInt();
        CheckSpringSeason s = new CheckSpringSeason();
        String ans = s.check(month,date);
        System.out.println(ans);
    }

    String check(int month,int day){
         if((month==3 && day>=20 && day<=31) || (month==4 && day>=1 && day<=30) || (month==5 && day>=1 && day<=31) || (month==6 && day>=1 && day<=20)){
            return "Its a Spring Season";
        }
        else{
            return "Not a Spring Season";
        }
    }
}
