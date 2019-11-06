package Users;
import Location.*;


public class Customer extends User{
	boolean isOnRide;
	Wallet wallet;
	BankAccount bankAccount;
	public CustomerLocation customerLocation;

	// Make Constructor take Wallet, BankAccount and Location as inputs.
	private Customer(String uniqueId, String name, String phoneNumber, String emailId, String password, int pin, int x, int y){
		super(uniqueId, name, phoneNumber, emailId, password);
		isOnRide = false;
		wallet = new Wallet();
		bankAccount = new BankAccount(pin);
		customerLocation = new CustomerLocation(x, y);
	}

	// Customer Object Creating Method
	public static Customer createCustomer(String uniqueId, String name, String phoneNumber, String emailId, String password, int pin, int x, int y){
		return new Customer(uniqueId, name, phoneNumber, emailId, password, pin, x , y);
	}

	/* 
		Cabbooking method has to be created that creates a request
		object and pushes into a queue.
	*/
	public double getDriverDistance(Driver driver){
		return customerLocation.getDistance(driver);
	}



	// Overridden Object Class toString Method
	public String toString(){
		String msg = "Hello, I'm "+ this.getUsername() +" and I'm a customer with ID " + this.getUniqueId() + " and Wallet Balance " + wallet.getWalletBalance() + " at Location " + this.customerLocation.getX() + "," +  this.customerLocation.getY();
		return (msg);
	}
}