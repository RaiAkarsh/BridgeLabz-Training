import java.util.*;
public class SumOfAllNumbers {
    public static void main(String []args){
        Scanner x= new Scanner(System.in);
        double numberarray[] =  new double[10];
        int i=10;
        double number=0.0;
        double sum=0.0;
        int count=0;
        while(true){
            number= x.nextDouble();
            if(number<=0){
                break;
            }
            else{
                sum+=number;
                numberarray[count]=number;
                count++;
                i--;
            }
            if(i==0){
                break;
            }
        }
        System.out.print("The numbers entered are: ");
        for(int j=0;j<count;j++){
            System.out.print(numberarray[j]+" ");
        }
        System.out.println();
        System.out.println("Sum of all numbers is: "+sum);
    }
}
