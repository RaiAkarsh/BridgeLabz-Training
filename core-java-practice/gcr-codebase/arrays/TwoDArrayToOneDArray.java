import java.util.Scanner;
public class TwoDArrayToOneDArray {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int rows = x.nextInt();
        int cols = x.nextInt(); 
        int twoDArray[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                twoDArray[i][j] = x.nextInt();
            }
        }

        int oneDArray[] = new int[rows * cols];
        int index = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                oneDArray[index] = twoDArray[i][j];
                index++;
            }
        }
        System.out.println("One Dimensional Array:");
        for(int i=0;i<oneDArray.length;i++){
            System.out.print(oneDArray[i]+" ");
        }
    }
}

