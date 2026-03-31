import java.util.*;
public class StudentVoteChecking {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the age ");
        int age = x.nextInt();
        StudentVoteChecking s = new StudentVoteChecking();
        boolean ans = s.check(age);
        if(ans){
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
    boolean check(int age){
        if(age>=18){
            return true;
        }
        return false;
    }
    
}
