interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}
abstract class Patient implements MedicalRecord {
    private String patientId;
    private String name;
    private int age;
    private String medicalHistory;  
    Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    public String getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setMedicalHistory(String history) {
        this.medicalHistory = history;
    }
    protected String getMedicalHistory() {
        return medicalHistory;
    }
    abstract double calculateBill();
    void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class InPatient extends Patient  {
    InPatient(String id, String name, int age) {
        super(id, name, age);
    }
    double calculateBill() {
        return 3200;
    }
    public void addRecord(String record) {
        setMedicalHistory(record);
    }
    public void viewRecords() {
        System.out.println("Medical History: " + getMedicalHistory());
    }
}
class OutPatient extends Patient  {
    OutPatient(String id, String name, int age) {
        super(id, name, age);
    }
    double calculateBill() {
        return 12000;
    }
    public void addRecord(String record) {
        setMedicalHistory(record);
    }
    public void viewRecords() {
        System.out.println("Medical History: " + getMedicalHistory());
    }
}
public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient p1 = new InPatient("121", "Yash", 56);
        Patient p2 = new OutPatient("122", "Ram", 64);
        Patient[] patients = { p1, p2 };
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: " + p.calculateBill());
            System.out.println("----------------------");
        }
    }
}
