import java.util.*;
import java.io.*;
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        try {
            int age = x.nextInt();
            validateAge(age);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Access granted!");
    }
}
