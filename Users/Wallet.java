package Users;
import Utilities.*;

public class Wallet{
	private double balance;

	Wallet(){
		this.balance = RandomGenerators.generateWalletBalance();
	}

	double getWalletBalance(){
		return balance;
	}

	boolean checkMinBalance(){
		if(balance >=300){
			return true;
		} else {
			return false;
		}
	}
}