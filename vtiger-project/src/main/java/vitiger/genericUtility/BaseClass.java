package vitiger.genericUtility;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import vtiger.pomRepository.HomePage;
import vtiger.pomRepository.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sDriver;
	public WebDriverUtility wUtils=new WebDriverUtility();
	public FileUtility fUtitls=new FileUtility();
	public ExcelUtility eUtils = new ExcelUtility();
	public Connection connection;
	public JavaUtility jUtils = new JavaUtility();

	@BeforeSuite
	public void bsConfig() throws SQLException {

		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		connection = DriverManager.getConnection(IPathConstant.DBURL, IPathConstant.DBUSERNAME, IPathConstant.DBPASSWORD);
	}
	
	@BeforeClass
	public void bcConfiguration() throws IOException {
		String URL = fUtitls.fetchDataFromPropertyFile(IPathConstant.URLKEY);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		wUtils.implicitWait(driver);
		driver.get(URL);
		sDriver = driver;
	}
	
	@BeforeMethod
	public void bmConfig() throws IOException {
		String username = fUtitls.fetchDataFromPropertyFile(IPathConstant.USERNAMEKEY);
		String password = fUtitls.fetchDataFromPropertyFile(IPathConstant.PASSWORDKEY);

		LoginPage login = new LoginPage(driver);
		login.loginAction(username, password);
		
	}
	
/*	@AfterMethod
	public void amConfig() {
		HomePage home=new HomePage(driver);
		home.signOutAction();
	}
	
	@AfterClass
	public void acConfig() {
		driver.quit();
	}
	
	@AfterSuite
	public void asConfig() throws SQLException {
		connection.close();
	}
*/
}
