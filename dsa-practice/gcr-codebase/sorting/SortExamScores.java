import java.util.*;
public class SortExamScores {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter no. of students");
        int n = x.nextInt();
        System.out.println("Enter the Exam scores of the students");
        int scores[]=new int[n];
        for(int i=0;i<n;i++){
            scores[i]=x.nextInt();
        }
        scores= selectionSort(scores);
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(scores[i]+"  ");
        }
    }
    public static int[] selectionSort(int []scores){
        for(int i=0;i<scores.length-1;i++){
            int min=scores[i];
            int index=i;
            for(int j=i+1;j<scores.length;j++){
                if(scores[j]<min){
                    min=scores[j];
                    index=j;
                }
            }
            scores[index]=scores[i];
            scores[i]=min;
        }
        return scores;
    }
    
}
