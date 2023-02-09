package vtiger.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Product...']")
	private WebElement productPlusButton;

	public WebElement getVendorPlusButton() {
		return productPlusButton;
	}
	
	public void clickOnProductPlusButton() {
		productPlusButton.click();
	}

}
