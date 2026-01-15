import java.util.*;
public class SortStudentsMarks{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter no. of students");
        int n = x.nextInt();
        System.out.println("Enter the marks of the students");
        int marks[]=new int[n];
        for(int i=0;i<n;i++){
            marks[i]=x.nextInt();
        }
        marks= bubbleSort(marks);
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(marks[i]+"  ");
        }
    }
    public static int[] bubbleSort(int []marks){
        for(int i =0;i<marks.length-1;i++){
            for(int j=0;j<marks.length-1-i;j++){
                if(marks[j]>marks[j+1]){
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                }
            }
        }
        return marks;
    }
}