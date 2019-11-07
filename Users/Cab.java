package Users;
import Utilities.*;

class Cab{
	String cabNumber;
	String cabType;
	int cabCharge;

	private Cab(String cabNumber, String cabType, int cabCharge){
		this.cabNumber = cabNumber;
		this.cabType = cabType;
		this.cabCharge = cabCharge;
	}

	// Method for constructing Cab object using setCabType() and RandomGenerators
	public static Cab createCab(){
		String[] cabType = RandomGenerators.setCabType();
		return new Cab("TS01A71499", cabType[0], Integer.parseInt(cabType[1]));
	}

}