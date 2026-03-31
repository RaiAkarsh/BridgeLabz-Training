import java.util.*;
public class NumberOfEmployeesWhoMetTheTarget {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n = x.nextInt();
        System.out.println("Enter the number of hours completed by each employee: ");
        int[] hours = new int[n];
        for (int i = 0; i < n; i++) {
            hours[i] = x.nextInt();
        }
        System.out.println("Enter the target hours: ");
        int target = x.nextInt();
        System.out.println("Number of employees who met the target: " + numberOfEmployeesWhoMetTarget(hours, target));
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i=0; i<hours.length;i++){
            if(hours[i]>=target){
                count++;
            }
        }
        return count;
    }

}
