import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {
    @Todo(task="Login", assignedTo="A")
    void login() {}

    @Todo(task="Payment", assignedTo="B", priority="HIGH")
    void pay() {}

    public static void main(String[] args) {
        for(Method mthd : Project.class.getDeclaredMethods()) {
            if (mthd.isAnnotationPresent(Todo.class)) {
                System.out.println(mthd.getAnnotation(Todo.class).task());
            }
        }
    }
}