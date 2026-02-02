import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class SecureService {
    @RoleAllowed("ADMIN")
    void access(String role) {
        if(!role.equals("ADMIN")) {
            System.out.println("Access Denied!");
        }
        else {
            System.out.println("Access Granted");
        }
    }

    public static void main(String[] args) {
        new SecureService().access("USER");
    }
}