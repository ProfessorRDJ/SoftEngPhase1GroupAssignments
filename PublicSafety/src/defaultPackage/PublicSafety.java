package defaultPackage;

public class PublicSafety {
	
	private Station cityStation;
	private Station universityStation;
	private String cityName;
	private String universityName;
	
	PublicSafety(String University, String City) {
		super();
		cityStation = new Station(City);
		universityStation = new Station(University);
	}
	
	
	void doHire(boolean toHire) {
		if (toHire) {
			cityStation.hiringOrder();
		} else {
			universityStation.hiringOrder();
		}
	}


	void printDetectiveLists() {
		cityStation.printDetectives();
		universityStation.printDetectives();
	}
}
