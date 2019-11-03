package Users;
import Utilities.*;


class BankAccount{
	private double balance;
	private int pin;

	BankAccount(int pin){
		this.pin = pin;
		balance = RandomGenerators.generateBankBalance();
	}

	double getBankBalance(int pin) throws InvalidPINException{
		if(pin == this.pin){
			return balance;
		} else {
			InvalidPINException exception = new InvalidPINException();
			throw exception;
		}
	}

	boolean transferMoney(double transferValue) throws InadequateBankBalanceException{
		if (transferValue <= balance){
			balance -= transferValue;
		} else{
			InadequateBankBalanceException exception = new InadequateBankBalanceException();
			throw exception;
		}
	}
}