package Users;
import Location.*;
import Utilities.*;

public class Customer extends User{
	boolean isOnRide;
	public Wallet wallet;
	BankAccount bankAccount;
	public CustomerLocation customerLocation;

	// To Register new customer.
	private Customer(String userId, String username, String phoneNumber, String emailId, String password, int pin){
		super(userId, username, phoneNumber, emailId, password);
		isOnRide = false;
		wallet = new Wallet();
		bankAccount = new BankAccount(pin);
		customerLocation = RandomGenerators.setRandomCustomerLocation();
	}
	// Customer Object Creating Method
	public static Customer createCustomer(String userId, String username, String phoneNumber, String emailId, String password, int pin){
		return new Customer(userId, username, phoneNumber, emailId, password, pin);
	}


	// To create an object of existing customer.
	private Customer(String userId, String username, String phoneNumber, String emailId, String password, double walletBalance, double bankBalance, int pin){
		super(userId, username, phoneNumber, emailId, password);
		isOnRide = false;
		wallet = new Wallet(walletBalance);
		bankAccount = new BankAccount(bankBalance, pin);
		customerLocation = RandomGenerators.setRandomCustomerLocation();
	}
	// Customer Object Creating Method
	public static Customer createCustomer(String userId, String username, String phoneNumber, String emailId, String password, double walletBalance, double bankBalance, int pin){
		return new Customer(userId, username, phoneNumber, emailId, password, walletBalance, bankBalance, pin);
	}

	/* 
		Cabbooking method has to be created that creates a request
		object and pushes into a queue.
	*/
	public Request sendCabRequest(PlacesLocation source, PlacesLocation destination){
		return Request.postCabRequest(this, source, destination);
	}



	// Distance, Wallet Balance and Bank Balance Getters
	public double static getDriverDistance(Driver driver){
		return customerLocation.getDistance(driver);
	}

	public double getDestinationDistance(PlacesLocation placesLocation){
		return customerLocation.getDistance(placesLocation);
	}
	public double getBankBalance(int pin){
		try{
			return bankAccount.getBankBalance(pin);	
		} catch (InvalidPINException ipe){
			System.out.println("Customer Bank Balance Method Failed!!");
			return 0.00;
		}
	}
	public double getWalletBalance(){
		return wallet.getWalletBalance();
	}


	// Overridden Object Class toString Method
	public String toString(){
		String msg = "Hello, I'm "+ this.getUsername() +" and I'm a customer with ID " + this.getUniqueId() + " and Wallet Balance " + wallet.getWalletBalance() + " at Location " + this.customerLocation.getX() + "," +  this.customerLocation.getY();
		return (msg);
	}
}