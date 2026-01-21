import java.util.*;
abstract class JobRole {
    private String candidateName;

    JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    String getCandidateName() {
        return candidateName;
    }

    abstract void evaluate();
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer(String name) {
        super(name);
    }

    void evaluate() {
        System.out.println(getCandidateName() +" evaluated for Software Engineer role");
    }
}

class DataScientist extends JobRole {
    DataScientist(String name) {
        super(name);
    }

    void evaluate() {
        System.out.println(getCandidateName() +" evaluated for Data Scientist role");
    }
}

class ProductManager extends JobRole {
    ProductManager(String name) {
        super(name);
    }

    void evaluate() {
        System.out.println(getCandidateName() +" evaluated for Product Manager role");
    }
}

class Resume<T extends JobRole> {

    private T jobRole;

    Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    T getJobRole() {
        return jobRole;
    }
}
class ResumeUtil {
    static void screenAll(List<? extends JobRole> roles) {

        for (JobRole r : roles) {
            r.evaluate();
        }
    }
}
