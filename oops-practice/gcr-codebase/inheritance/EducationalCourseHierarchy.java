class Course{
    String courseName;
    int duration;
    public Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }
    void displayCourseInfo(){
        System.out.println("Course Name: " + courseName + ", Duration: " + duration + " hours");
    }    
}
class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded){
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    @Override
    void displayCourseInfo(){
        super.displayCourseInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
    }
}
class PaidOnlineCourse extends OnlineCourse{
    double fee;
    double discount;
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount){
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    @Override
    void displayCourseInfo(){
        super.displayCourseInfo();
        System.out.println("Price: $" + fee + ", Discount: " + discount + "%");
    }
}
public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse course = new PaidOnlineCourse("Java Programming", 40, "Udemy", true, 199.99, 20);
        course.displayCourseInfo();
    }
}
