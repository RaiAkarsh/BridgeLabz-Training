import java.util.*;

public class CourseMain {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        List<CourseType> courses = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Add Exam Course");
            System.out.println("2.Add Assignment Course");
            System.out.println("3.Add Research Course");
            System.out.println("4.Evaluate All Courses");
            System.out.println("5.Exit");

            int choice = x.nextInt();
            x.nextLine();

            switch (choice) {

                case 1:
                    courses.add(new ExamCourse());
                    break;

                case 2:
                    courses.add(new AssignmentCourse());
                    break;

                case 3:
                    courses.add(new ResearchCourse());
                    break;

                case 4:
                    CourseUtil.evaluateAll(courses);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
