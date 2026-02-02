import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {
    @TaskInfo(priority = "HIGH", assignedTo = "Akarsh")
    void task() {}

    public static void main(String[] args) throws Exception {
        Method m = TaskManager.class.getDeclaredMethod("task");
        TaskInfo t = m.getAnnotation(TaskInfo.class);
        System.out.println(t.priority() + " " + t.assignedTo());
    }
}