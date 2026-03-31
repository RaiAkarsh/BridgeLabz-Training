// Abstraction
interface IPayable {
    double calculateBill();
}

// Encapsulation
class Patient {
    private int patientId;
    private String name;
    private int age;
    private String gender;

    Patient(int patientId, String name, int age, String gender) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Polymorphism
    public void displayInfo() {
        System.out.println(patientId + " " + name + " " + age + " " + gender);
    }
}

// Inheritance
class InPatient extends Patient {
    private int roomNumber;
    private int daysAdmitted;

    InPatient(int patientId, String name, int age, String gender, int roomNumber, int daysAdmitted) {
        super(patientId, name, age, gender);
        this.roomNumber = roomNumber;
        this.daysAdmitted = daysAdmitted;
    }

    // Polymorphism
    public void displayInfo() {
        super.displayInfo();
        System.out.println(roomNumber + " " + daysAdmitted);
    }
}

// Inheritance
class OutPatient extends Patient {
    private String visitDate;

    OutPatient(int patientId, String name, int age, String gender, String visitDate) {
        super(patientId, name, age, gender);
        this.visitDate = visitDate;
    }

    // Polymorphism
    public void displayInfo() {
        super.displayInfo();
        System.out.println(visitDate);
    }
}

// Encapsulation
class Doctor {
    private int doctorId;
    private String name;
    private String specialization;
    private int experience;

    Doctor(int doctorId, String name, String specialization, int experience) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }

    void displayDoctor() {
        System.out.println(doctorId + " " + name + " " + specialization + " " + experience);
    }
}

// Abstraction + Encapsulation
class Bill implements IPayable {
    private double consultationFee;
    private double roomCharges;

    Bill(double consultationFee, double roomCharges) {
        this.consultationFee = consultationFee;
        this.roomCharges = roomCharges;
    }

    public double calculateBill() {
        return consultationFee + roomCharges;
    }
}
