import java.util.*;

class CourseLimitExceededException extends Exception {
    CourseLimitExceededException(String msg) {
        super(msg);
    }
}

abstract class RegistrationService {
    abstract void enrollCourse(Student student, String course)
            throws CourseLimitExceededException;
}

class Person {
    protected String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    private int studentId;
    private List<String> courses = new ArrayList<>();
    private List<String> gradeCourses = new ArrayList<>();
    private List<String> grades = new ArrayList<>();
    private static final int MAX_COURSES = 3;

    Student(int studentId, String name) {
        super(name);
        this.studentId = studentId;
    }

    void addCourse(String course) {
        courses.add(course);
    }

    void dropCourse(String course) {
        courses.remove(course);

        int index = gradeCourses.indexOf(course);
        if (index != -1) {
            gradeCourses.remove(index);
            grades.remove(index);
        }
    }

    int getCourseCount() {
        return courses.size();
    }

    void addGrade(String course, String grade) {
        int index = gradeCourses.indexOf(course);

        if (index == -1) {
            gradeCourses.add(course);
            grades.add(grade);
        } else {
            grades.set(index, grade);
        }
    }

    void showDetails() {
        System.out.println("StudentId: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Courses: " + courses);

        System.out.println("Grades:");
        for (int i = 0; i < gradeCourses.size(); i++) {
            System.out.println(gradeCourses.get(i) + " : " + grades.get(i));
        }
    }
}

class Registration extends RegistrationService {

    void enrollCourse(Student student, String course)
            throws CourseLimitExceededException {

        if (student.getCourseCount() >= 3)
            throw new CourseLimitExceededException("Course limit exceeded");

        student.addCourse(course);
    }
}
