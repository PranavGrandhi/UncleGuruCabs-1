package Location;
import Users.*;


public class CustomerLocation extends Location{

	public CustomerLocation(int x, int y){
		super(x,y);
	}

	public double getDistance(Driver driver){
		int driverX = driver.driverLocation.getX();
		int driverY = driver.driverLocation.getY();
		return Math.sqrt(Math.pow((getX() - driverX), 2) + Math.pow((getY() - driverY), 2));
	}

	public double getDistance(PlacesLocation placesLocation){
		int placeX = placesLocation.getX();
		int placeY = placesLocation.getY();
		return Math.sqrt(Math.pow((getX() - placeX), 2) + Math.pow((getY() - placeY), 2));
	}

}