package Rides;
import Users.*;
import Location.*;

public class Ride{
	Customer customer;
	Driver driver;
	PlacesLocation source;
	PlacesLocation destination;
	double duration;

	private Ride(Customer customer, Driver driver, PlacesLocation source, PlacesLocation destination, double duration){
		this.customer = customer;
		this.driver = driver;
		this.source = source;
		this.destination = destination;
		this.duration = duration;
	}
}