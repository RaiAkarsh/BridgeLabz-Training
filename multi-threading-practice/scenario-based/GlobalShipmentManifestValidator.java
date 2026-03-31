import java.util.Scanner;
import java.util.regex.Pattern;
import java.time.*;

public class GlobalShipmentManifestValidator {
    
	public static boolean Validate(String record) {
		String ar[] = record.split("\\|");
		if(ar.length!=5) {
			return false;
		}
		if(!Pattern.matches("SHIP-(?!.*(\\d)\\1\\1)[1-9][0-9]{5}", ar[0])) {
			return false;
		}
		if(!Pattern.matches("20\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])", ar[1])) {
			return false;
		}
		else {
			try {
				LocalDate.parse(ar[1]);
			}
			catch(Exception e) {
				return false;
			}
		}
		if(!Pattern.matches("(AIR|SEA|ROAD|RAIL|EXPRESS|FREIGHT)", ar[2])) {
			return false;
		}
		if(!Pattern.matches("(0|[1-9][0-9]{0,5}).\\d{1,2}", ar[3])) {
			return false;
		}
		if(!Pattern.matches("(DELIVERED|CANCELLED|IN_TRANSIT)", ar[4])) {
			return false;
		}
		return true;	
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		x.nextLine();
		for(int i =0;i<n && x.hasNextLine();i++) {
			String s=x.nextLine().trim();
			if(Validate(s)) {
				System.out.println("COMPLIANT RECORD");
			}
			else {
				System.out.println("NON-COMPLIANT RECORD");
			}
		}

	}

}
