package vtiger.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewVendorPage {
	WebDriver driver;
	public CreateNewVendorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(name = "vendorname")
	private WebElement vendorNameTextField;
	
	@FindBy(name = "glacct")
	private WebElement gLAccountDropdown;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;

	public WebElement getVendorName() {
		return vendorNameTextField;
	}

	public WebElement getgLAccountDropdown() {
		return gLAccountDropdown;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void createVendor(String vendorName, String option) {
		vendorNameTextField.sendKeys(vendorName);
		Select select=new Select(gLAccountDropdown);
		select.selectByVisibleText(option);
		saveButton.click();
	}
	
	public void createVendor(String vendorName, String option, String filePath) {
		vendorNameTextField.sendKeys(vendorName);
		Select select=new Select(gLAccountDropdown);
		select.selectByVisibleText(option);
		saveButton.click();
	}
}
