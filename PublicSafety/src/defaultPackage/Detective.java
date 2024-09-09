package defaultPackage;

public class Detective {
	String name;
	int badgeNumber;
	
	Detective(String name, int badgeNumber) {
		super();
		this.name = name;
		this.badgeNumber = badgeNumber;
	}
	
	@Override
	public String toString() {
		return "[Badge: " + badgeNumber + ", Name: " + name + " ]";
	}
	
	
}
