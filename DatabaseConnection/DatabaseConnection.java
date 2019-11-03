package DatabaseConnection;
import java.sql.*;

public class DatabaseConnection {
	private String dbURL = "jdbc:mysql://localhost:3306/";
	private String dbName = dbURL + "JavaProjectTest";
	private String dbUsername = "root";
	private String dbPassword = "karthik@123";
	

    private static Connection conn; 

    private static PreparedStatement readCustomerStmt = null;
    private static PreparedStatement insertCustomerStmt = null;
    private static PreparedStatement updateCustomerStmt = null;
    private static PreparedStatement deleteCustomerStmt = null;

    private static PreparedStatement readDriverStmt = null;
    private static PreparedStatement insertDriverStmt = null;
    private static PreparedStatement updateDriverStmt = null;
    private static PreparedStatement deleteDriverStmt = null;
    private static ResultSet rs = null;
    
    DatabaseConnection() {
	    try{
	    	System.out.println("Starting the database part");
	    	conn = DriverManager.getConnection(dbName, dbUsername, dbPassword);
	    	System.out.println("After Connection");
	    	
	    	readCustomerStmt = conn.prepareStatement("SELECT username, userid, phone FROM customer WHERE userid = ?");
	    	insertCustomerStmt = conn.prepareStatement("INSERT INTO customer ? ? ?");
	    	// updateCustomerStmt = conn.prepareStatement("SELECT username, userid, phone FROM customer WHERE userid = ?");
	    	// deleteCustomerStmt = conn.prepareStatement("SELECT username, userid, phone FROM customer WHERE userid = ?");

	    	// readDriverStmt = conn.prepareStatement("SELECT username, userid, phone FROM customer WHERE userid = ?");
	    	// insertDriverStmt = conn.prepareStatement("SELECT username, userid, phone FROM customer WHERE userid = ?");
	    	// updateDriverStmt = conn.prepareStatement("SELECT username, userid, phone FROM customer WHERE userid = ?");
	    	// deleteDriverStmt = conn.prepareStatement("SELECT username, userid, phone FROM customer WHERE userid = ?");

	    	System.out.println("After Preparing Statement");
	    } catch (SQLException ex){
	    	System.out.println("SQLException: " + ex.getMessage());
	        System.out.println("SQLState: " + ex.getSQLState());
	        System.out.println("VendorError: " + ex.getErrorCode());
	    }	
    }
    
    // ALL CUSTOMER METHODS
    void getCustomer(String customerid){
    	try{
			readCustomerStmt.setString(1, customerid);
			rs = readCustomerStmt.executeQuery();
			
			while(rs.next()){
		        String username = rs.getString("username");
		        String userId = rs.getString("userid");
		        String phone = rs.getString("phone");
		        System.out.println(username + " has user ID " + userId + " and phone number is " + phone);
		    }
    	} catch(SQLException ex){
    		System.out.println("Please Try Again!");
    	}
    }

    void registerNewCustomer(String username, String userid, String phone){
    	System.out.println("\nEntering Register");
    	try{
			insertCustomerStmt.setString(1, username);
			insertCustomerStmt.setString(2, userid);
			insertCustomerStmt.setString(3, phone);
			insertCustomerStmt.executeUpdate();
    	} catch(SQLException ex){
    		System.out.println("Please Try Again!");
    	}

		System.out.println("Exiting Register\n");
    }
        
}