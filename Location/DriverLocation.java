package Location;
import Users.*;


public class DriverLocation extends Location{

	DriverLocation(int x, int y){
		super(x,y);
	}

	double getDistance(Customer customer){
		int customerX = customer.location.x;
		int customerY = customer.location.y;

		return Math.sqrt(Math.pow((x - customerX), 2) + Math.pow((y - customerY), 2));
	}
}