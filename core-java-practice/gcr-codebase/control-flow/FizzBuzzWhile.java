import java.util.Scanner;
public class FizzBuzzWhile {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
        if(num<1){
            System.out.print("Input should be a positive integer");
        }
        else{

            int i=1;

            while(i<= num){
                if(i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");
                }
                else if(i%3==0){
                    System.out.println("Fizz");
                }
                else if(i%5==0){
                    System.out.println("Buzz");
                }
                else{
                System.out.println(i);
                }
                i++;
            }
        }
    }
    
}
