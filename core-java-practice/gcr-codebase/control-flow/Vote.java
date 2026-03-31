import java.util.*;
public class Vote {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int age=x.nextInt();
        if(age>=18){
            System.out.print("The person's age is "+age+" and can vote.");
        }
        else{
            System.out.print("The person's age is "+age+" and cannot vote.");
        }
    }
    
}
