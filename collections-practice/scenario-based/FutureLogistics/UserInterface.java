import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        Utility utility = new Utility();

        System.out.println("Enter the Goods Transport details");
        String input = x.nextLine();

        String transportId = input.split(":")[0];

        if (!utility.validateTransportId(transportId)) {
            System.out.println("Please provide a valid record");
            return;
        }

        GoodsTransport gt = utility.parseDetails(input);

        System.out.println("Transporter id : " + gt.getTransportId());
        System.out.println("Date of transport : " + gt.getTransportDate());
        System.out.println("Rating of the transport : " + gt.getTransportRating());
        System.out.println("Vehicle for transport : " + gt.vehicleSelection());
        System.out.println("Total charge : " + gt.calculateTotalCharge());
    }
}