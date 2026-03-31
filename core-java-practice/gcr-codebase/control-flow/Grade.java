import java.util.*;
public class Grade {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double physics = x.nextInt();
        double chemistry = x.nextInt();
        double maths = x.nextInt();
        double total = physics + chemistry + maths;
        double average = total / 3;
        if(average >= 80){
            System.out.println("Grade A"+"\n"+"Average marks "+average+"\n"+"Level 4, above agency-normalized standards");
        } else if(average >= 70 && average < 80){
            System.out.println("Grade B"+"\n"+"Average marks "+average+"\n"+"Level 3, at agency-normalized standards");
        } else if(average >= 60 && average < 70){
            System.out.println("Grade C"+"\n"+"Average marks "+average+"\n"+"Level 2, below, but approaching agency-normalized standards");
        } else if(average >= 50 && average < 60){
            System.out.println("Grade D"+"\n"+"Average marks "+average+"\n"+"Level 1, well below agency-normalized standards");
        }
        else if(average >= 40 && average < 50){
            System.out.println("Grade E"+"\n"+"Average marks "+average+"\n"+"Level -1, too below agency-normalized standards");
        } else {
            System.out.println("Grade R"+"\n"+"Average marks "+average+"\n"+"Remedial standards");
        }

    }

}
