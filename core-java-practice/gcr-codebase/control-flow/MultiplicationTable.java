import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
        if(num>=6 && num<=9){
          for(int i=1;i<=10;i++){
            int result=num*i;
            System.out.println(num+" * "+i+" = "+result);
          }
        }
        else{
            System.out.print("Input number between 6 and 9");
        }

    }
    
}
