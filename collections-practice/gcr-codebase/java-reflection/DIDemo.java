import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject{}

class Service{
    void serve(){
        System.out.println("Service method called");
    }
}

class Controller{
    @Inject
    Service service;
    void process(){
        service.serve();
    }
}

class DIContainer{
    public static void injectDependencies(Object obj) throws Exception{
        Class<?> cls=obj.getClass();
        for(Field field:cls.getDeclaredFields()){
            if(field.isAnnotationPresent(Inject.class)){
                Object dependency=field.getType().getDeclaredConstructor().newInstance();
                field.setAccessible(true);
                field.set(obj,dependency);
            }
        }
    }
}

public class DIDemo{
    public static void main(String[] args) throws Exception{
        Controller controller=new Controller();
        DIContainer.injectDependencies(controller);
        controller.process();
    }
}
