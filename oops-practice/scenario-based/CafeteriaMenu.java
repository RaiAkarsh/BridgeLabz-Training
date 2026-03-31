import java.util.Scanner;
public class CafeteriaMenu {
    public static void main(String[] args) {
        String [] menu={"Coffee","Tea","Sandwich","Salad","Juice","Soda","Dessert","Soup","Pasta","Pizza"};
        DisplayMenu(menu);
        System.out.println("Enter your choice (1-10) or 0 to exit: ");
        int num =1;
        int []ordered=new int[10];
        while(num<11 && num>0) {
            Scanner x = new Scanner(System.in);
            num = x.nextInt();
            ordered  = GetItemByIndex(menu, num,ordered);
        }
        System.out.println("Your order summary:");
        for(int i=0;i<ordered.length;i++){
            if(ordered[i]>0){
                System.out.println(menu[i]+": "+ordered[i]);
            }
        }
        System.out.println("Thank you for visiting the Cafetaria!");
    }
    public static void DisplayMenu (String [] menu){
        System.out.println("=== Cafetaria Menu ===");
        for(int i=0;i<menu.length;i++){
            System.out.println((i+1)+". "+menu[i]);
        }
    }
    public static int[] GetItemByIndex (String [] menu, int index,int [] ordered){
        if(index>0 && index<=menu.length){
            System.out.println("You selected: "+menu[index-1]);
            ordered[index-1]++;
        }
        return ordered;
    }
}
