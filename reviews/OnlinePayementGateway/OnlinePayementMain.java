import java.util.Scanner;
public class OnlinePayementMain {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		boolean continueprogram= true;
		while(continueprogram) {
			System.out.println("Menu");
			System.out.println("1. Credit Card");
			System.out.println("2. UPI");
			System.out.println("3. Wallet");
			System.out.println("4. Net Banking");
			System.out.println("5. Exit");
			System.out.println("Enter choice");
			int choice = x.nextInt();
			int op=0;
			switch(choice) {
			case 1:
				System.out.println("1 for refund and 2 for paying");
				op=x.nextInt();
				PayementType c = new creditCard();
				if(op==1) {
					System.out.println("enter amount");
					double amount=x.nextDouble();
					c.refund(amount);
					break;
				}
				else if(op==2) {
					System.out.println("enter amount");
					double amount=x.nextDouble();
					c.paid(amount);
					break;
				}
				else {
					System.out.println("invalid entry");
					break;
				}
			case 2:
				System.out.println("1 for refund and 2 for paying");
				op=x.nextInt();
				PayementType u = new upi();
				if(op==1) {
					System.out.println("enter amount");
					double amount=x.nextDouble();
					u.refund(amount);
					break;
				}
				else if(op==2) {
					System.out.println("enter amount");
					double amount=x.nextDouble();
					u.paid(amount);
					break;
				}
				else {
					System.out.println("invalid entry");
					break;
			     }
			case 3:
				System.out.println("1 for refund and 2 for paying");
				op=x.nextInt();
				PayementType w = new wallet();
				if(op==1) {
					System.out.println("enter amount");
					double amount=x.nextDouble();
					w.refund(amount);
					break;
				}
				else if(op==2) {
					System.out.println("enter amount");
					double amount=x.nextDouble();
					w.paid(amount);
					break;
				}
				else {
					System.out.println("invalid entry");
					break;
		        }
			case 4:
				System.out.println("1 for refund and 2 for paying");
				op=x.nextInt();
				PayementType nb = new netBanking();
				if(op==1) {
					System.out.println("enter amount");
					double amount=x.nextDouble();
					nb.refund(amount);
					break;
				}
				else if(op==2) {
					System.out.println("enter amount");
					double amount=x.nextDouble();
					nb.paid(amount);
					break;
				}
				else {
					System.out.println("invalid entry");
					break;
				}
			case 5:
				System.out.println("exit");
				continueprogram=false;
				break;
			default:
				System.out.println("invalid entry");
		   }
		}
	}

}
