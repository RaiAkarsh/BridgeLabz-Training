import java.util.*;
public class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        while (true){
            System.out.println("enter number");
            int number = x.nextInt();
            if(number %3==0 && number %5==0){
                System.out.println(" Winner");
            }
            else{
                System.out.println("Better luck next time");
            }
            System.out.println("any more participants? (yes/no)");
            String response = x.next().toLowerCase();
            if(response.equals("no")){
                break;
            }
        }
    }
}