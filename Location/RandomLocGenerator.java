// Writes to the database to setup random location points
package Location;
import java.sql.*;
import java.util.*;
import Users.*;
import DatabaseConnection.*;

public class RandomLocGenerator{//} implements Runnable{
	// Thread randomLocGenThread;
	// String randomLocGenThreadName;
	// DatabaseConnection db;

	// final static int noOfLocations = 8;

	// final static int width = 1280;
	// final static int height = 720;
	// final static int xPadding = 50;
	// final static int yPadding = 50;
	// final static int mapWidth = width - 2*xPadding;
	// final static int mapHeight = height - 2*yPadding;
	// // ArrayList<PlacesLocation> placesArrayList = new ArrayList<PlacesLocation>();

	// public RandomLocationGenerator(String threadName, DatabaseConnection db){
	// 	this.db = db;
	// 	randomLocGenThreadName = threadName;
	// 	randomLocGenThread = new Thread(this, randomLocGenThreadName);
	// 	System.out.println("New Thread: " + randomLocGenThread);
	// 	randomLocGenThread.start();
	// }


	// public void run(){
	// 	boolean getCab = false;
	// 	String user;
	// 	int noOfDrivers;
	// 	ArrayList<Integer> reallocatedDrivers = new ArrayList<Integer>();
	// 	try{
	// 		ArrayList<Users.Driver> drivers = db.getAvailableDrivers();
	// 		noOfDrivers = drivers.size();
	// 		int nOD = noOfDrivers;
	// 		for(int i = 0; i < nOD; i++) {
	// 			double j = Math.random();
	// 			int c = (int)(10*j);
	// 			if(j > 0.5) {
	// 				reallocatedDrivers.add(c);
	// 			} else {
	// 				reallocatedDrivers.add(0);
	// 			}
	// 		}
	// 		while(reallocatedDrivers.size() < noOfLocations){
	// 			reallocatedDrivers.add(0);
	// 		}
	// 		// if(noOfDrivers > 0){
	// 			// Iterator<Users.Driver> itr = userIDs.iterator();
	// 			// while(itr.hasNext()){
	// 			// 	Users.Driver d = itr.next();
					

	// 			// }
	// 		// }
	// 	} catch(SQLException){
	// 		System.out.println("Sorry, My DB is gay!!");
	// 	}
	// }

	// public void simply(){
	// 	System.out.println("Yet to be finished!!!!!!");
	// }
}