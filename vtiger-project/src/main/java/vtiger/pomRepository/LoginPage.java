package vtiger.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")
	WebElement usernameTextField;
	
//	@FindBy(name="user_password")
	
	@FindBys({@FindBy(xpath = "//input[@type='password']"), @FindBy(name="user_password")})
	private WebElement passwordTextField;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginAction(String username, String password)
	{
		usernameTextField.clear();
		usernameTextField.sendKeys(username);
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		loginButton.click();
	}

}