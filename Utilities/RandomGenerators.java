package Utilities;

public class RandomGenerators{
	/*
	* Random Generators for the Users Package.
	* 
	*/
	final static String[][] cabTypes = {{"Mini", "Micro", "Sedan", "SUV"},{"10", "20", "50", "60"}};

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

	public static String[] setCabType(){
		int numberOfParameters = cabTypes.length;
		int numberOfTypes = cabTypes[numberOfParameters-1].length;
		int index = (int) (numberOfTypes * Math.random());
		// System.out.println(cabTypes.length);
		String[] output = new String[cabTypes.length];
		for (int i=0;i<numberOfParameters;i++) {
			output[i] = cabTypes[i][index];
		}
		return output;
	}
}