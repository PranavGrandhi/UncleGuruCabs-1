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


		// String customerUserId = "sniper123";
		// String customerUsername = "karthikrangasai";
		// String customerphoneNumber = "9999999999";
		// String customerEmailId = "karthik@test.com";
		// String customerPassword = "12345678";
		// int customerPin = 1234;


		// String driverUserId = "sniper123";
		// String driverUsername = "driver";
		// String driverphoneNumber = "9999999999";
		// String driverEmailId = "driver@driver.com";
		// String driverPassword = "12345678";

		// ////////// TESTING CUSTOMER CLASS //////////
		// Customer customer = Customer.createCustomer(customerUserId, customerUsername, customerphoneNumber, customerEmailId, customerPassword, customerPin);
		// System.out.println("\nTest Customer Deets: ");
		// System.out.println(customer);

		// ////////// TESTING DRIVER CLASS //////////
		// Driver driver = Driver.createDriver(driverUserId, driverUsername, driverphoneNumber, driverEmailId, driverPassword);
		// System.out.println("\nDriver Created.");
		// System.out.println(driver);

		// // PlacesLocation pL = new PlacesLocation(2, 1);
		// // System.out.println("Normal Nigger!!");
		// // System.out.println(customer.getDriverDistance(driver));
		// // System.out.println(driver.getCustomerDistance(customer));

		// // System.out.println("Places Nigger!!");
		// // System.out.println(customer.getDestinationDistance(pL));
		// // System.out.println(driver.getDestinationDistance(pL));

		// System.out.println("DB Registering new customer: ");
		// db.registerNewCustomer(customerUserId, customerUsername, customerphoneNumber, customerEmailId, customerPassword, customerPin);
		// System.out.println("DB Registering done.\n");

		// System.out.println("DB Logging in customer: ");
		// Customer dbCustomer = db.loginCustomer(customerUserId, customerPassword);
		// System.out.println("DB Logging in done.\n");

		// System.out.println("Printing DB created customer: ");
		// System.out.println(dbCustomer);


		System.out.println("DB Registering new drivers: ");
		db.registerNewDriver("joel123", "Joel Goerge", "9845362781", "joel@gmail.com", "12345678", 1234);
		db.registerNewDriver("kali789", "Rahul Kali", "9842632781", "kali@gmail.com", "12345678", 1234);
		db.registerNewDriver("pranav@123", "Pranav Raja", "9263572781", "pranav@gmail.com", "12345678", 1234);
		db.registerNewDriver("mohan_1205", "Mohan Jayanthi", "9845274861", "mohan@gmail.com", "12345678", 1234);
		db.registerNewDriver("gokulk", "Gokul Kumar", "7426562781", "gokul@outlook.com", "12345678", 1234);
		db.registerNewDriver("hari123", "Hari Vallabha", "9637254731", "hari@gmail.com", "12345678", 1234);
		db.registerNewDriver("mahe_123", "Maheshwari Mahesh", "8275153781", "mahe@gmail.com", "12345678", 1234);
		db.registerNewDriver("ramu_rockz", "Ramu Bugan", "8845362781", "ramu@gmail.com", "12345678", 1234);
		db.registerNewDriver("bhai_apna", "Bubanesh Bahi", "7845362781", "bhai@gmail.com", "12345678", 1234);
		db.registerNewDriver("murugan_1102", "Murugan Quic", "9111162781", "murugan@gmail.com", "12345678", 1234);
		db.registerNewDriver("khan69", "Shah Khan", "9945362281", "khan@yahoo.com", "12345678", 1234);
		db.registerNewDriver("aamir_324536", "Aamir Kumar", "9822222781", "aamir@ymail.com", "12345678", 1234);
		System.out.println("DB Registering done.\n");

		// System.out.println("DB Logging in driver: ");
		// Driver dbDriver = db.loginDriver(driverUserId, driverPassword);
		// System.out.println("DB Logging in done.\n");

		// System.out.println("Printing DB created driver: ");
		// System.out.println(dbDriver);
	}
}