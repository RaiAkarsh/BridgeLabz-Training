import java.util.*;
public class SortStudentsAge {
        public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter no. of students");
        int n = x.nextInt();
        System.out.println("Enter the ages of the students between 10 to 18");
        int age[]=new int[n];
        for(int i=0;i<n;i++){
            age[i]=x.nextInt();
        }
        int [] count= new int[9];
        age= countingSort(age,count);
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(age[i]+"  ");
        }
    }
    public static int[] countingSort(int []age,int []count){
        for(int i=0;i<age.length;i++){
            count[age[i]-10]++;
        }
        int index=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                age[index]=i+10;
                index++;
                count[i]--;
            }
        }
        return age;
    }

}
