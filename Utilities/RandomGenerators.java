package Utilities;
import Location.*;

public class RandomGenerators{
	/*
	* Random Generators for the Users and Location Package.
	* 
	*/

	// Variables required to assign Random Location
	final static int width = 1280;
	final static int height = 720;
	final static int xPadding = 50;
	final static int yPadding = 50;
	final static int mapWidth = width - 2*xPadding;
	final static int mapHeight = height - 2*yPadding;


	//String array consisting of cab types in first row with respective charges in second row
	final static String[][] cabTypes = {{"Mini", "Micro", "Sedan", "SUV"},{"10", "20", "50", "60"}};



	// Methods to set random locations to driver and customer.
	public static CustomerLocation setRandomCustomerLocation(){
		int x = (int)Math.ceil(Math.random() * mapWidth) ;
		int y = (int)Math.ceil(Math.random() * mapHeight) ;
		return new CustomerLocation(x, y);
	}

	public static DriverLocation setRandomDriverLocation(){
		int x = (int)Math.ceil(Math.random() * mapWidth) ;
		int y = (int)Math.ceil(Math.random() * mapHeight) ;
		return new DriverLocation(x, y);
	}


	// Methods to set random wallet balance, bank balance and cabType.
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

	//Using Math.random() to output a cab type, cab charge pair
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