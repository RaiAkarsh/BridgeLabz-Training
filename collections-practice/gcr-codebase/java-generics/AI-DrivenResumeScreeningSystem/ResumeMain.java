import java.util.*;

public class ResumeMain {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        List<JobRole> candidates = new ArrayList<>();
        while (true) {
            System.out.println("\n1.Add Software Engineer");
            System.out.println("2.Add Data Scientist");
            System.out.println("3.Add Product Manager");
            System.out.println("4.Screen All Resumes");
            System.out.println("5.Exit");

            int choice = x.nextInt();
            x.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    Resume<SoftwareEngineer> se =
                        new Resume<>(new SoftwareEngineer(x.nextLine()));
                    candidates.add(se.getJobRole());
                    break;

                case 2:
                    System.out.print("Enter name: ");
                    Resume<DataScientist> ds =
                        new Resume<>(new DataScientist(x.nextLine()));
                    candidates.add(ds.getJobRole());
                    break;

                case 3:
                    System.out.print("Enter name: ");
                    Resume<ProductManager> pm =
                        new Resume<>(new ProductManager(x.nextLine()));
                    candidates.add(pm.getJobRole());
                    break;

                case 4:
                    ResumeUtil.screenAll(candidates);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
