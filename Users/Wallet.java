package Users;
import Utilities.*;

public class Wallet{
	private double balance;

	// Constrcutor for the class
	Wallet(){
		this.balance = RandomGenerators.generateWalletBalance();
	}

	// Getter method for wallet balance
	double getWalletBalance(){
		return balance;
	}

	// To check balance before customer requests cab booking
	boolean checkMinBalance(){
		if(balance >=300){
			return true;
		} else {
			return false;
		}
	}

	// After a ride is done, customer uses this method to pay money.
	boolean makePayment(double amount){
		if(balance >= amount){
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}

	// To add money from bank account to the wallet.
	void receivePayment(double amount){
		balance += amount;
	}
}