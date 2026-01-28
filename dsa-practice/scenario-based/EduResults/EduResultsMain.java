import java.util.*;
public class EduResultsMain{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter number of districts: ");
        int d = x.nextInt();
        List<List<student>> districtLists = new ArrayList<>();
        for(int i=0;i<d;i++){
            System.out.print("Enter number of students in district " + (i+1) + ": ");
            int n = x.nextInt();
            List<student> students = new ArrayList<>();
            System.out.println("Enter name and score of each student (name score):");
            for(int j=0;j<n;j++){
                String name = x.next();
                int score = x.nextInt();
                students.add(new student(name, score));
            }
            districtLists.add(students);
        }
        List<student> finall = EduResultsFunc.mergeKLists(districtLists);
        System.out.println("Final Merged Rank List:");
        for(int j=0;j<finall.size();j++){
            System.out.println(finall.get(j).name + " " + finall.get(j).score);
        }

    }
}

