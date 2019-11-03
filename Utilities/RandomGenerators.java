package Utilities;

public class RandomGenerators{
	public static double generateBankBalance(){
		int low = 250;
		int high = 10000;

		return (low + (Math.random() * (high - low)));
	}

	public static double generateWalletBalance(){
		int low = 500;
		int high = 1000;

		return (low + (Math.random() * (high - low)));
	}
}