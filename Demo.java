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


		String driverUserId = "driver123";
		String driverUsername = "driver";
		String driverphoneNumber = "9999999999";
		String driverEmailId = "driver@driver.com";
		String driverPassword = "12345678";

		////////// TESTING CUSTOMER CLASS //////////
		Customer customer = Customer.createCustomer(customerUserId, customerUsername, customerphoneNumber, customerEmailId, customerPassword, customerPin);
		System.out.println("\nTest Customer Deets: ");
		System.out.println(customer);

		////////// TESTING DRIVER CLASS //////////
		Driver driver = Driver.createDriver(driverUserId, driverUsername, driverphoneNumber, driverEmailId, driverPassword);
		System.out.println("\nDriver Created.");
		System.out.println(driver);

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


		System.out.println("DB Registering new driver: ");
		db.registerNewDriver(driverUserId, driverUsername, driverphoneNumber, driverEmailId, driverPassword);
		System.out.println("DB Registering done.\n");

		System.out.println("DB Logging in driver: ");
		Driver dbDriver = db.loginDriver(driverUserId, driverPassword);
		System.out.println("DB Logging in done.\n");

		System.out.println("Printing DB created driver: ");
		System.out.println(dbDriver);
	}
}