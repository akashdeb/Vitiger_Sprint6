package vtiger.pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorLookUpPage {
	WebDriver driver;
	public VendorLookUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchTextFiled;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchButton;
	
	/*
	 * 
	 * @FindBy for selecting particular Vendor
	 * 
	 */

	public WebElement getSearchTextFiled() {
		return searchTextFiled;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	public void searchVendor(String vendorName)
	{
		searchTextFiled.sendKeys(vendorName);
	}
	public void searchButton()
	{
		searchButton.click();
	}
	
	public void clickOnVendor(String vendorName) {
		driver.findElement(By.linkText(""+vendorName+"")).click();
	}
	
}
