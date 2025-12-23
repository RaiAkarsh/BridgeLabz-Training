import java.util.*;
public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
         int candidates[]=new int[3];
        while(true){
            System.out.println("Enter voter age or 'exit' to finish:");
            String input = x.next();
            int age=0;
            if(input.equalsIgnoreCase("exit")){
                break;
            }
            else{
                 age = Integer.parseInt(input);
                if(age >= 18){
                    System.out.println(" Enter candidate number to vote for (1, 2, or 3):");
                    candidates[x.nextInt() - 1]++;
                } else {
                    System.out.println("Voter is not eligible to vote.");
                }
            }
        } 
        System.out.println("Election Results:");
        for(int i=0;i<3;i++){
            System.out.println("Candidate " + (i + 1) + ": " + candidates[i] + " votes");
        }   
}
}