package Rides;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import Users.*;
import Location.*;

public class Request{
	Customer customer;
	PlacesLocation source;
	PlacesLocation destination;
	Date requestTime;
	// private static DateTimeFormatter dateTimeFormatter = new DateTimeFormatter("yyyy/MM/dd HH:mm:ss");

	private Request(Customer customer, PlacesLocation source, PlacesLocation destination){
		this.customer = customer;
		this.source = source;
		this.destination = destination;
		this.requestTime = new Date();
	}

	public static Request postCabRequest(Customer customer, PlacesLocation source, PlacesLocation destination){
		return new Request(customer, source, destination);
	}
}