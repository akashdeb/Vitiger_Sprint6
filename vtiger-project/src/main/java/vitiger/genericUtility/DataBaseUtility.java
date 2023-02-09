package vitiger.genericUtility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseUtility  {
	Connection connection;
	public void toFetchDataFromDB(String querry, int columnNo) throws SQLException {
		
		ResultSet result = connection.createStatement().executeQuery(querry);
		while(result.next()) {
			System.out.println(result.getString(columnNo));
		}	
	
	}
	public void updateDataToDB(String querry, int columnNo) throws SQLException {
		
		int result = connection.createStatement().executeUpdate(querry);
	
	}

}
