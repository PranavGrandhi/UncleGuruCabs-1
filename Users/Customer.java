package Users;

public class Customer extends User{
	boolean isOnRide;
	Wallet wallet;
	BankAccount bankAccount;

	private Customer(String uniqueId, String name, String phoneNumber, String emailId, String password, int pin){
		super(uniqueId, name, phoneNumber, emailId, password);
		isOnRide = false;
		wallet = new Wallet();
		bankAccount = new BankAccount(pin);
	}

	// Customer Object Creating Method
	public static Customer createCustomer(String uniqueId, String name, String phoneNumber, String emailId, String password, int pin){
		return new Customer(uniqueId, name, phoneNumber, emailId, password, pin);
	}

	/* 
		Cabbooking method has to be created that creates a request
		object and pushes into a queue.
	*/


	// Overridden Object Class toString Method
	public String toString(){
		String msg = "Hello, I'm "+ this.getUsername() +" and I'm a customer with ID " + this.getUniqueId() + " and Wallet Balance " + wallet.getWalletBalance();
		return (msg);
	}
}