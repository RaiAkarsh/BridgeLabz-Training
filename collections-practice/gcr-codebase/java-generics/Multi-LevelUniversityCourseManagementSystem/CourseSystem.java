import java.util.*;


abstract class CourseType {
    abstract String getName();
    abstract void evaluate();
}


class ExamCourse extends CourseType {
    String getName() {
        return "Exam Course";
    }

    void evaluate() {
        System.out.println("Evaluation via written exam");
    }
}

class AssignmentCourse extends CourseType {
    String getName() {
        return "Assignment Course";
    }

    void evaluate() {
        System.out.println("Evaluation via assignments");
    }
}

class ResearchCourse extends CourseType {
    String getName() {
        return "Research Course";
    }

    void evaluate() {
        System.out.println("Evaluation via research work");
    }
}

class Course<T extends CourseType> {

    private T courseType;

    Course(T courseType) {
        this.courseType = courseType;
    }

    T getCourseType() {
        return courseType;
    }
}

class CourseUtil {
    static void evaluateAll(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.print(c.getName() + " -> ");
            c.evaluate();
        }
    }
}
