package Users;
import java.util.Random;

public class Customer extends User{
	boolean isOnRide;
	Wallet wallet;
	BankAccount bankAccount;

	private Customer(String uniqueId, String name, String phoneNumber, String emailId, String password){
		super(uniqueId, name, phoneNumber, emailId, password);
		isOnRide = false;

		Random r = new Random();
		int low = 300;

		wallet = new Wallet(350);
	}

	public static Customer createCustomer(String uniqueId, String name, String phoneNumber, String emailId, String password){
		return new Customer(uniqueId, name, phoneNumber, emailId, password);
	}

	public String toString(){
		return ("Hello, I'm "+ this.getUsername() +" and I'm a customer with ID " + this.getUniqueId());
	}
}