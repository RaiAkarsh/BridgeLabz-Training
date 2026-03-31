import java.util.*;

public class HospitalMain {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        int choice = -1;

        while (choice != 0) {

            System.out.println("Enter choice:");
            System.out.println("1 Create Patient");
            System.out.println("2 Read Patients");
            System.out.println("3 Update Patient");
            System.out.println("4 Delete Patient");
            System.out.println("5 Calculate Bill");
            System.out.println("0 Exit");

            choice = x.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter patient type: 1 InPatient 2 OutPatient");
                    int type = x.nextInt();

                    System.out.println("Enter Id Name Age Gender");
                    int id = x.nextInt();
                    String name = x.next();
                    int age = x.nextInt();
                    String gender = x.next();

                    if (type == 1) {
                        System.out.println("Enter RoomNumber DaysAdmitted");
                        int room = x.nextInt();
                        int days = x.nextInt();
                        patients.add(new InPatient(id, name, age, gender, room, days));
                    } else {
                        System.out.println("Enter VisitDate");
                        String date = x.next();
                        patients.add(new OutPatient(id, name, age, gender, date));
                    }
                    break;

                case 2:
                    for (Patient p : patients) {
                        p.displayInfo();
                    }
                    break;

                case 3:
                    System.out.println("Enter index to update");
                    int index = x.nextInt();

                    System.out.println("Enter Id Name Age Gender RoomNumber DaysAdmitted");
                    int nid = x.nextInt();
                    String nname = x.next();
                    int nage = x.nextInt();
                    String ngender = x.next();
                    int nroom = x.nextInt();
                    int ndays = x.nextInt();

                    patients.set(index, new InPatient(nid, nname, nage, ngender, nroom, ndays));
                    break;

                case 4:
                    System.out.println("Enter index to delete");
                    int delIndex = x.nextInt();
                    patients.remove(delIndex);
                    break;

                case 5:
                    System.out.println("Enter ConsultationFee and RoomCharges");
                    double consultation = x.nextDouble();
                    double roomCharge = x.nextDouble();
                    Bill bill = new Bill(consultation, roomCharge);
                    System.out.println("Total Bill = " + bill.calculateBill());
                    break;

                case 0:
                    System.out.println("Exit");
                    break;
            }
        }
    }
}
