import java.util.*;
class SortEmployeeId{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter no. of Employee");
        int n = x.nextInt();
        System.out.println("Enter the id of the students");
        int id[]=new int[n];
        for(int i=0;i<n;i++){
            id[i]=x.nextInt();
        }
        id= insertionSort(id);
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(id[i]+"  ");
        }
    }
    public static int[] insertionSort(int []id){
        for(int i=1;i<id.length;i++){
            int temp=id[i];
            int j=i-1;
             while(j>-1 && temp<id[j]){
                    id[j+1]=id[j];
                    j--;
                }
                id[j+1]=temp;                                       
            }
            return id;
        }
    }
        

