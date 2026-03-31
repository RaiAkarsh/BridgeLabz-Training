import java.util.*;
public class SpringSeason {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int month=x.nextInt();
        int day=x.nextInt();
        if((month==3 && day>=20 && day<=31) || (month==4 && day>=1 && day<=30) || (month==5 && day>=1 && day<=31) || (month==6 && day>=1 && day<=20)){
            System.out.print("Its a Spring Season");
        }
        else{
            System.out.print("Not a Spring Season");
        }
    }
    
}
