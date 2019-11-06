import Users.*;
import Location.*;
import java.util.*;

class Demo{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Starting Cab Application:");


		////////// TESTING CUSTOMER CLASS //////////
		Customer customer = Customer.createCustomer("userid", "username", "phone", "emailID", "password", 1234, 2, 2);
		System.out.println("\nCustomer Created.");
		System.out.println(customer);

		////////// TESTING DRIVER CLASS //////////
		Driver driver = Driver.createDriver("userid", "username", "phone", "emailID", "password", 4, 4);
		System.out.println("\nDriver Created.");
		System.out.println(driver);


		System.out.println(customer.getDriverDistance(driver));
		System.out.println(driver.getCustomerDistance(customer));

	}
}