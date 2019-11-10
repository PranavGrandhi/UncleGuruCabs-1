package DatabaseConnection;
import java.sql.*;
import Users.*;

public class DatabaseConnection {
	private String dbURL = "jdbc:mysql://localhost:3306/";
	private String dbName = dbURL + "JavaProjectTest";
	private String dbUsername = "root"; // Change to the username of your MySQL database.
	private String dbPassword = "karthik@123"; // Change to the password of your MySQL database.
	

    private static Connection conn; 

    // CUSTOMER RELATED SQL STATEMENTS
    private static PreparedStatement readCustomerLoginStmt = null;
    private static PreparedStatement readCustomerStmt = null;
    private static PreparedStatement insertCustomerStmt = null;
    private static PreparedStatement insertCustomerWalletBalanceStmt = null;
    private static PreparedStatement insertCustomerBankBalanceStmt = null;
    private static PreparedStatement updateCustomerStmt = null;
    private static PreparedStatement deleteCustomerStmt = null;

    // DRIVER RELATED SQL STATEMENTS
    private static PreparedStatement readDriverStmt = null;
    private static PreparedStatement insertDriverStmt = null;
    private static PreparedStatement updateDriverStmt = null;
    private static PreparedStatement deleteDriverStmt = null;

    //  CUSTOMER BANK ACCOUNT RELATED SQL STATEMENTS
    private static PreparedStatement readBankAccountIDStmt = null;
    private static PreparedStatement readBankAccountUserIDStmt = null;
    private static PreparedStatement insertBankAccountStmt = null;
    // private static PreparedStatement deleteBankAccountStmt = null;

	// DRIVER CAB RELATED SQL STATEMENTS
    private static PreparedStatement readCabStmt = null;
    private static PreparedStatement insertCabStmt = null;
    private static PreparedStatement updateCabStmt = null;
    private static PreparedStatement deleteCabStmt = null;

    private static ResultSet rs = null;
    
    public DatabaseConnection() {
	    try{
	    	System.out.println("Starting the database part");
	    	conn = DriverManager.getConnection(dbName, dbUsername, dbPassword);
	    	System.out.println("After Connection");
	    	
	    	// Customer related.
			readCustomerLoginStmt = conn.prepareStatement("SELECT password FROM customer WHERE userId = ?");
			readCustomerStmt = conn.prepareStatement("SELECT username, userId, emailId, phoneNumber, walletBalance, bankAccount FROM customer WHERE userId = ?");
			insertCustomerStmt = conn.prepareStatement("INSERT INTO customer(username, userId, emailId, phoneNumber, password, walletBalance, bankAccount) VALUES(?, ?, ?, ?, ?, ?, ?)");
			// updateCustomerStmt = conn.prepareStatement("SELECT username, userid, phone FROM customer WHERE userid = ?");
			// deleteCustomerStmt = conn.prepareStatement("SELECT username, userid, phone FROM customer WHERE userid = ?");

			// Bank Account related.
			readBankAccountIDStmt = conn.prepareStatement("SELECT balance, pin FROM bankAccount WHERE ID = ?");
			readBankAccountUserIDStmt = conn.prepareStatement("SELECT ID FROM bankAccount WHERE UserId = ?");
			insertBankAccountStmt = conn.prepareStatement("INSERT INTO bankAccount(userId, balance, pin) VALUES(?, ?, ?)");
			// updateDriverStmt = conn.prepareStatement("SELECT username, userid, phone FROM customer WHERE userid = ?");
			// deleteDriverStmt = conn.prepareStatement("SELECT username, userid, phone FROM customer WHERE userid = ?");

			// Driver related.
			readDriverStmt = conn.prepareStatement("SELECT username, userId, emailId, phoneNumber, walletBalance, cab FROM driver WHERE userId = ?");
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
    public Customer loginCustomer(String customerid, String password){
    	try{
    		PreparedStatement userCountStmt = conn.prepareStatement("SELECT COUNT(*) AS noOfUsers FROM customer WHERE userId = ?");
			userCountStmt.setString(1, customerid);
			rs = userCountStmt.executeQuery();
			if(rs.next() && (rs.getInt("noOfUsers") == 1)) {
				readCustomerLoginStmt.setString(1, customerid);
				rs = readCustomerLoginStmt.executeQuery();
				rs.next();
				String passWord = rs.getString("password");
				
				if(passWord.equals(password)){
					readCustomerStmt.setString(1, customerid);
					rs = readCustomerStmt.executeQuery();
					rs.next();
					String username = rs.getString("username");
					String phoneNumber = rs.getString("phoneNumber");
					String emailId = rs.getString("emailId");
					double walletBalance = rs.getDouble("walletBalance");
					int bankAccount = rs.getInt("bankAccount");
					readBankAccountIDStmt.setString(1, (""+bankAccount));
					rs = readBankAccountIDStmt.executeQuery();
					rs.next();
					double bankBalance = rs.getDouble("balance");
					int pin = rs.getInt("pin");

					System.out.println("Fckin Logged in.");
					return Customer.createCustomer(customerid, username, phoneNumber, emailId, password, walletBalance, bankAccount, pin);
				} else {
					System.out.println("Account with User ID " + customerid + " doesn't exist. Please Try Again !!");
				}
			} else {
				System.out.println("Multiple Accounts with same userId is existing.");
			}
    	} catch(SQLException ex){
    		System.out.println("Please Try Again!");
    		ex.printStackTrace();
    	}
    	System.out.println("Exiting Login\n");
    	return null;
    }

    public void registerNewCustomer(String userId, String username, String phoneNumber, String emailId, String password, int pin){
    	System.out.println("\nRegistering a New User: ");
    	try{
    		// username, userId, emailId, phoneNumber, password, walletBalance, bankAccount(int)
    		Customer customer = Customer.createCustomer(username, userId, emailId, phoneNumber, password, pin);
    		double bankBalance = customer.getBankBalance(pin);
    		double walletBalance = customer.getWalletBalance();

			insertBankAccountStmt.setString(1, userId);
			insertBankAccountStmt.setDouble(2, bankBalance);
			insertBankAccountStmt.setInt(3, pin);
			insertBankAccountStmt.executeUpdate();
			readBankAccountUserIDStmt.setString(1, userId);
			rs = readBankAccountUserIDStmt.executeQuery();

			if(rs.next()){
				insertCustomerStmt.setString(1, username);
				insertCustomerStmt.setString(2, userId);
				insertCustomerStmt.setString(3, emailId);
				insertCustomerStmt.setString(4, phoneNumber);
				insertCustomerStmt.setString(5, password);
				insertCustomerStmt.setDouble(6, walletBalance);
				insertCustomerStmt.setInt(7, rs.getInt("ID"));
				insertCustomerStmt.executeUpdate();
			}
			System.out.println("Account Registered!!");
    	} catch(SQLException ex){
    		System.out.println("Register Method got some problem!");
    		ex.printStackTrace();
    	}
		System.out.println("Exiting Register\n");
    }




    public String toString(){
    	return "Hi, I created the required connection. LMAO YEET now.\n";
    }
}