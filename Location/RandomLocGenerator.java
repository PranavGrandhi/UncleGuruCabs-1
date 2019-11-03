// Writes to the database to setup random location points
package Location;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

class RandomLocGenerator{
	Connection conn;
	Statement stmt = null;
	ResultSet rs = null;

	RandomLocGenerator(){

	}

	try{
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaProjectTest", "root", "karthik@123");

		stmt = conn.createStatement();
		rs.stmt.executeQuery("");
	}

}