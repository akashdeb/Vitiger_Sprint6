package vitiger.genericUtility;
/**
 * This interface has all the constant values used in the project
 * @author Akash
 *
 */
public interface IPathConstant {
	
	String PROPERTYFILEPATH = "./src/test/resources/propertData.properties";
	String EXCELFILEPATH = "./src/test/resources/VitigerTestCase.xlsx";
	
	long IMPLICITWAIT = 20;
	long EXPLICITWAIT = 20;
	
	String DBURL = "jdbc:mysql://localhost:3306/akashdb";
	String DBUSERNAME = "root";
	String DBPASSWORD = "root";
	
	String URLKEY = "url";
	String USERNAMEKEY = "username";
	String PASSWORDKEY = "password";

	String LEADSHEETNAME = "TC_1001(Leads)Mehak";
	
	String PRODUCTSHEETNAME = "TC_4001 (Product) Prashant";
	
	
}
