package Users;
import Location.*;

public class Driver extends User{
	int rating;
	boolean isOnRide;
	DriverLocation location;

	private Driver(String uniqueId, String name, String phoneNumber, String emailId, String password){
		super(uniqueId, name, phoneNumber, emailId, password);
		rating = 0;
		isOnRide = false;
	}
	
	public static Driver createDriver(String uniqueId, String name, String phoneNumber, String emailId, String password){
		return new Driver(uniqueId, name, phoneNumber, emailId, password);
	}

	public String toString(){
		return ("Hello, I'm " + this.getUsername() + " and I'm a driver with ID " + this.getUniqueId());
	}
}