package defaultPackage;
import java.util.Scanner;

public class Station {
	
	final int MAX_NUMBER_OF_DETECTIVES = 5;
	int numberOfDetectives = 0;
	static int LAST_BADGE_NUMBER = 0;
	String stationName;
	Detective[] allDetectives;
	
	Station(String stationName) {
		allDetectives = new Detective[MAX_NUMBER_OF_DETECTIVES];
		this.stationName = stationName;
	}

	public void hiringOrder() {
		
		if(numberOfDetectives >= MAX_NUMBER_OF_DETECTIVES) {
			System.out.println("Can't Hire Any More Detectives For " + stationName);
			return;
		}
		
		System.out.print("New hire for " + stationName + "...Enter detective's name: ");
		
		/**
		 * We don't close the scanner with a system.in, actually, it will give an error if we try to:
		 * "Exception in thread "main" java.util.NoSuchElementException: No line found".
		 * we can therefore ignore this warning.
		 */
		Scanner scan = new Scanner(System.in);
		allDetectives[numberOfDetectives] = new Detective(scan.nextLine(), LAST_BADGE_NUMBER+1);
		
		numberOfDetectives++;
		LAST_BADGE_NUMBER++;
	}
	
	public void printDetectives() {
		System.out.println("List of Detectives For " + stationName);
		for(int i=0; i<numberOfDetectives; i++) {
			System.out.println(allDetectives[i]);
		}
		System.out.println("");
	}
	
	
}
