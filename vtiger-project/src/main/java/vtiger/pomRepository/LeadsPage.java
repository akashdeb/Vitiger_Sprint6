package vtiger.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
		
		public LeadsPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//img[@alt='Create Lead...']")
		WebElement createLeadPlusButton;

		public WebElement getCreateLeadPlusButton() {
			return createLeadPlusButton;
		}
		
		public void clickOnLeadPlusButton()
		{
			createLeadPlusButton.click();
		}
	}


