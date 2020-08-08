package Location;

public class PlacesLocation extends Location{

	public PlacesLocation(int x, int y){
		super(x,y);
	}

	public double getDistance(PlacesLocation placesLocation){
		int placeX = placesLocation.getX();
		int placeY = placesLocation.getY();
		return Math.sqrt(Math.pow((getX() - placeX), 2) + Math.pow((getY() - placeY), 2));
	}

}