import java.util.*;
class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}
public class StudentReportGenerator {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        System.out.println("Enter number of students:");
        int n = x.nextInt();

        for (int i = 0; i < n; i++) {
        
            String[] subjects = {"Math", "Science", "English"};
            int[] marks = new int[subjects.length];
        
            System.out.println("Entering marks for student " + (i + 1) + ":");
        
            for (int j = 0; j < subjects.length; j++) {
        
                System.out.println("Enter marks for " + subjects[j] + ":");
                int mark = x.nextInt();
        
                try {
                    if (mark < 0 || mark > 100) {
                        throw new InvalidMarkException("Invalid mark for " + subjects[j] + ": " + mark);
                    }
                    marks[j] = mark;
        
                } catch (InvalidMarkException e) {
                    System.out.println(e.getMessage());
                    marks[j] = 0; 
                }
            }

            students.add(new Student(subjects, marks));
            students.get(i).displayReport();
        }
    }   
}
class Student {
    String[] subjects;
    int[] marks;

    public Student(String[] subjects, int[] marks) {
        this.subjects = subjects;
        this.marks = marks;
    }


    public int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double getAverageMarks() {
        return (double) getTotalMarks() / marks.length;
    }

    public String getGrade() {
        double average = getAverageMarks();
        if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else if (average >= 50) return "D";
        else return "F";
    }
    public void displayReport() {
        System.out.println("Subject-wise Marks:");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Average Marks: " + getAverageMarks());
        System.out.println("Grade: " + getGrade());
    }
}