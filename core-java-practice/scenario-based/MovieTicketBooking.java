import java.util.*;
public class MovieTicketBooking {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		while(true) {
		System.out.println("enter movie type : (action/horror/thriller/comedy) ");
		String moviestype = x.next().toLowerCase();
		switch(moviestype) {
		case "action":
			System.out.println("Action movie");
			break;
		case "horror":
			System.out.println("Horror movie");
			break;
		case "thriller":
			System.out.println("Thriller movie");
			break;
		case "comedy":
			System.out.println("Comedy movie");
			break;
		default :
			System.out.println("Other Movie Type");
		}
		System.out.println("seat type(gold/silver)");
		String seatType = x.next().toLowerCase();
		switch(seatType) {
		case "gold":
			System.out.println("Gold seat booked");
			break;
		case "silver":
			System.out.println("Silver seat booked");
			break;
		default :
			System.out.println("Normal seat booked");
		}
		System.out.println("enter snack(popcorn/pizza/colddrink)");
		String snack=x.next().toLowerCase();
		switch(snack) {
		case "popcorn":
			System.out.println("Popcorn ordered");
			break;
		case "pizza":
			System.out.println("Pizza ordered");
			break;
		case "colddrink" :
			System.out.println("Cold drink ordered");
			break;
		default:
			System.out.println("snack not available");
		}
		System.out.println("Any more customers?(yes/no)");
		String res=x.next().toLowerCase();
		if(res.equals("no")) {
			break;
		}
		}
		
	}

}
