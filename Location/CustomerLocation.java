package Location;
import Users.*;


publlic class CustomerLocation extends Location{

	CustomerLocation(int x, int y){
		super(x,y);
	}

	double getDistance(Driver driver){
		int driverX = driver.location.x;
		int driverY = driver.location.y;

		return Math.sqrt(Math.pow((x - driverX), 2) + Math.pow((y - driverY), 2));
	}
}