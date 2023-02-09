package vitiger.genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
/**
 * This class has all the methods replated to selenium webdriver
 * @author Akash
 *
 */

public class WebDriverUtility {

	/**
	 * This is a method to wait for an element implicitly
	 * This method will handle AJAX call
	 * @param driver
	 */
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IPathConstant.IMPLICITWAIT));
	}
	
	public void waitForTitleOfWebPage(WebDriver driver, String title) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IPathConstant.EXPLICITWAIT));
		wait.until(ExpectedConditions.titleContains(title));
	}
}
