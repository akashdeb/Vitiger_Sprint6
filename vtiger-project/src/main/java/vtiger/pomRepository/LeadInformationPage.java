package vtiger.pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadInformationPage {
	WebDriver driver;
	public LeadInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
		
	public String verifyLeadInfo(String leadFirstName) {
		return driver.findElement(By.xpath("(//span[contains(text(), '"+leadFirstName+"')])[1]")).getText();
	}
		
	
	}

