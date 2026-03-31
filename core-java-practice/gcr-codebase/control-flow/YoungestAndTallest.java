import java.util.*;
public class YoungestAndTallest {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int Amarage=x.nextInt();
        int Akbarage=x.nextInt();
        int Anthonyage=x.nextInt();
        System.out.println("Now enter the height");
        int Amartall=x.nextInt();
        int Akbartall=x.nextInt();
        int Anthonytall=x.nextInt();
        if(Amarage<Akbarage && Amarage<Anthonyage){
            System.out.println("Amar is the youngest");
        }
        else if(Akbarage<Amarage && Akbarage<Anthonyage){
            System.out.println("Akbar is the youngest");
        }
        else{
            System.out.println("Anthony is the youngest");
        }
        if(Amartall>Akbartall && Amartall>Anthonytall){
            System.out.println("Amar is the tallest");
        }
        else if(Akbartall>Amartall && Akbartall>Anthonytall){
            System.out.println("Akbar is the tallest");
        }
        else{
            System.out.println("Anthony is the tallest");
        }

    }
    
}
