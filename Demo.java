import Users.*;
import Location.*;
import Utilities.*;
import DatabaseConnection.*;
import java.util.*;

class Demo{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Starting Cab Application:\n");

		System.out.println("Creating Database Connection: ");
		DatabaseConnection db = new DatabaseConnection();
		System.out.println(db);


		String customerUserId = "karthik123";
		String customerUsername = "karthikrangasai";
		String customerphoneNumber = "9999999999";
		String customerEmailId = "karthik@test.com";
		String customerPassword = "12345678";
		int customerPin = 1234;

		////////// TESTING CUSTOMER CLASS //////////
		Customer customer = Customer.createCustomer(customerUserId, customerUsername, customerphoneNumber, customerEmailId, customerPassword, customerPin);
		System.out.println("\nTest Customer Deets: ");
		System.out.println(customer);

		// ////////// TESTING DRIVER CLASS //////////
		// Driver driver = Driver.createDriver("userid", "username", "phone", "emailID", "password", 4, 4);
		// System.out.println("\nDriver Created.");
		// System.out.println(driver);

		// PlacesLocation pL = new PlacesLocation(2, 1);
		// System.out.println("Normal Nigger!!");
		// System.out.println(customer.getDriverDistance(driver));
		// System.out.println(driver.getCustomerDistance(customer));

		// System.out.println("Places Nigger!!");
		// System.out.println(customer.getDestinationDistance(pL));
		// System.out.println(driver.getDestinationDistance(pL));

		System.out.println("DB Registering new customer: ");
		db.registerNewCustomer(customerUserId, customerUsername, customerphoneNumber, customerEmailId, customerPassword, customerPin);
		System.out.println("DB Registering done.\n");

		System.out.println("DB Logging in customer: ");
		Customer dbCustomer = db.loginCustomer(customerUserId, customerPassword);
		System.out.println("DB Logging in done.\n");

		System.out.println("Printing DB created customer: ");
		System.out.println(dbCustomer);
	}
}