// Writes to the database to setup random location points
package Location;
import java.util.*;
import Users.*;

public class RandomLocGenerator{
	final static int width = 1280;
	final static int height = 720;
	final static int xPadding = 50;
	final static int yPadding = 50;
	final static int mapWidth = width - 2*xPadding;
	final static int mapHeight = height - 2*yPadding;
	// ArrayList<PlacesLocation> placesArrayList = new ArrayList<PlacesLocation>();

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

	public void simply(){
		System.out.println("Yet to be finished!!!!!!");
	}
}