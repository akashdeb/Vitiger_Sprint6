package vtiger.DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class UpdateQuerry {
	
	@Test
	public void updateQuerry() throws SQLException {
		Driver driver=new Driver();
		
		DriverManager.registerDriver(driver);
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/akashdb", "root", "root");
		Statement stat = connection.createStatement();
		int result = stat.executeUpdate("insert into vtiger values('Rohit', 98798768);");
		
		if(result == 1) {
			System.out.println("Database has been updated");
		}
		else
			System.out.println("Data base has not been updated");
		
		connection.close();
		
	}

}
