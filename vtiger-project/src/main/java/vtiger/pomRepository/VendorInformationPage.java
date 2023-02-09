package vtiger.pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class VendorInformationPage {
	WebDriver driver;
	public VendorInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public String verifyVendor(String vendorName) {
		return driver.findElement(By.xpath("(//span[contains(text(), '"+vendorName+"')])[1]")).getText();
	}

}
