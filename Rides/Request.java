package Rides;
import Users.*;
import Location.*;

public class Request{
	Customer customer;
	PlacesLocation source;
	PlacesLocation destination;

	private Request(Customer customer, PlacesLocation source, PlacesLocation destination){
		this.customer = customer;
		this.source = source;
		this.destination = destination;
	}

	public static Request postCabRequest(Customer customer, PlacesLocation source, PlacesLocation destination){
		return new Request(customer, source, destination);
	}
}