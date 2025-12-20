import java.util.*;
public class TallestAndYoungestAmongFriends {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double heights[] = new double[3];

        int ages[] = new int[3];
        
        String names[] = new String[3];
        
        for(int i=0;i<3;i++){

            System.out.println("Enter name of friend "+(i+1));
            names[i] = x.next();

            System.out.println("Enter height of "+names[i]);
            heights[i] = x.nextDouble();

            System.out.println("Enter age of "+names[i]);
            ages[i] = x.nextInt();
        }
        double maxHeight = heights[0];
        String tallestFriend = names[0];
        double youngestAge = ages[0];
        String youngestFriend = names[0];

        for(int i=1;i<3;i++){

            if(heights[i]>maxHeight){
                maxHeight = heights[i];
                tallestFriend = names[i];
            }

            if(ages[i]<youngestAge){
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
        }
        System.out.println("The tallest friend is "+tallestFriend+" with height "+maxHeight);

        System.out.println("The youngest friend is "+youngestFriend+" with age "+youngestAge);
    }
    
}
