package Location;
import Users.*;


public class DriverLocation extends Location{

	public DriverLocation(int x, int y){
		super(x,y);
	}

	public double getDistance(Customer customer){
		int customerX = customer.customerLocation.getX();
		int customerY = customer.customerLocation.getY();
		return Math.sqrt(Math.pow((super.getX() - customerX), 2) + Math.pow((super.getY() - customerY), 2));
	}
}