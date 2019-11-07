package Location;
import Users.*;


public class DriverLocation extends Location{

	public DriverLocation(int x, int y){
		super(x,y);
	}

	public double getDistance(Customer customer){
		int customerX = customer.customerLocation.getX();
		int customerY = customer.customerLocation.getY();
		return Math.sqrt(Math.pow((getX() - customerX), 2) + Math.pow((getY() - customerY), 2));
	}

	public double getDistance(PlacesLocation placesLocation){
		int placeX = placesLocation.getX();
		int placeY = placesLocation.getY();
		return Math.sqrt(Math.pow((getX() - placeX), 2) + Math.pow((getY() - placeY), 2));
	}
	
}