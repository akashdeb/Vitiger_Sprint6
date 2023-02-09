package vtiger.DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ToExecuteQuerry {
	
	@Test
	public void executeQuerry() throws SQLException {
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/akashdb", "root", "root");
		Statement stat = connection.createStatement();
		ResultSet result = stat.executeQuery("select * from vtiger;");

		while(result.next()) {
			System.out.println(result.getString("CustomerName"));
		}
	}

}
