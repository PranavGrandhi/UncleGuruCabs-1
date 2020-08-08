package Users;
import Location.*;

public class Driver extends User{
	int rating;
	boolean isOnRide;
	Wallet wallet;
	public DriverLocation driverLocation;
	public Cab cab;

	private Driver(String userId, String username, String phoneNumber, String emailId, String password){
		super(userId, username, phoneNumber, emailId, password);
		rating = 0;
		isOnRide = false;
		wallet = new Wallet();
		driverLocation = RandomGenerators.setRandomDriverLocation();
		cab = Cab.createCab();
	}
	// Driver Object Creating Method	
	public static Driver createDriver(String userId, String username, String phoneNumber, String emailId, String password){
		return new Driver(userId, username, phoneNumber, emailId, password);
	}


	private Driver(String userId, String username, String phoneNumber, String emailId, String password, double walletBalance, String cabNumber, String cabType, int cabCharge){
		super(userId, username, phoneNumber, emailId, password);
		isOnRide = false;
		wallet = new Wallet(walletBalance);
		cab = Cab.createCab(cabNumber, cabType, cabCharge);
		driverLocation = RandomGenerators.setRandomDriverLocation();
	}
	// Driver Object Creating Method
	public static Driver createDriver(String userId, String username, String phoneNumber, String emailId, String password, double walletBalance, String cabNumber, String cabType, int cabCharge){
		return new Driver(userId, username, phoneNumber, emailId, password, walletBalance, cabNumber, cabType, cabCharge);
	}



	public double getCustomerDistance(Customer customer){
		return driverLocation.getDistance(customer);
	}

	public double getDestinationDistance(PlacesLocation placesLocation){
		return driverLocation.getDistance(placesLocation);
	}
	public String getCabNumber(){
		return cab.cabNumber;
	}
	public String getCabType(){
		return cab.cabType;
	}
	public int getCabCharge(){
		return cab.cabCharge;
	}
	public double getWalletBalance(){
		return wallet.getWalletBalance();
	}



	public String toString(){
		return ("Hello, I'm " + this.getUsername() + " and I'm a driver with ID " + this.getUniqueId() + " and Wallet Balance " + wallet.getWalletBalance() + " at Location " + this.driverLocation.getX() + "," +  this.driverLocation.getY() + " in the cab with number " + this.cab.cabNumber + " which is of type " + this.cab.cabType + " at price " + this.cab.cabCharge);
	}
}