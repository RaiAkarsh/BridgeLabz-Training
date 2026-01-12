import java.util.*;

public class StudentCourseMain {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        Student student = new Student(1, "Akarsh Rai");
        RegistrationService registration = new Registration();

        int choice = -1;

        while (choice != 0) {
            System.out.println("-----------------------");
            System.out.println("1 Enroll Course");
            System.out.println("2 Add Grade");
            System.out.println("3 View Student Details");
            System.out.println("4 Drop Course");
            System.out.println("0 Exit");
            System.out.println("Enter your choice");
             System.out.println("-----------------------");
            choice = x.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.println("Enter course name");
                        registration.enrollCourse(student, x.next());
                        break;

                    case 2:
                        System.out.println("Enter course and grade");
                        student.addGrade(x.next(), x.next());
                        break;

                    case 3:
                        student.showDetails();
                        break;

                    case 4:
                        System.out.println("Enter course name");
                        student.dropCourse(x.next());
                        break;
                }
            } catch (CourseLimitExceededException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
