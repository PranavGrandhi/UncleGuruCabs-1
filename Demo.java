import Users.*;
import java.util.*;

class Demo{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Starting Cab Application:");


		////////// TESTING CUSTOMER CLASS //////////
		Customer customer = Customer.createCustomer("userid", "username", "phone", "emailID", "password", 1234);
		System.out.println("\nCustomer Created.");
		System.out.println(customer);

		////////// TESTING DRIVER CLASS //////////
		Driver driver = Driver.createDriver("userid", "username", "phone", "emailID", "password");
		System.out.println("\nDriver Created.");
		System.out.println(driver);

	}
}