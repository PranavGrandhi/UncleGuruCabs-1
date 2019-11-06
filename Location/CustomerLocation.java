package Location;
import Users.*;


public class CustomerLocation extends Location{

	public CustomerLocation(int x, int y){
		super(x,y);
	}

	public double getDistance(Driver driver){
		int driverX = driver.driverLocation.getX();
		int driverY = driver.driverLocation.getY();
		return Math.sqrt(Math.pow((super.getX() - driverX), 2) + Math.pow((super.getY() - driverY), 2));
	}
}