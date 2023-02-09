package vtiger.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This class has all the elements related HomePage
 * @author Akash
 *
 */
public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
		
	@FindBy(linkText="Leads")
	private WebElement leadsLink;
	
	@FindBy(linkText="Organizations")
	private WebElement organizationLink;
	
	@FindBy(linkText="Contacts")
	private WebElement contactsLink;
	
	@FindBy(linkText="Opportunities")
	private WebElement opportunitiesLink;
	
	@FindBy(linkText="Products")
	private WebElement productsLink;
	
	@FindBy(name="Vendors")
	private WebElement vendorsLink;
	
	@FindBy(linkText="Documents")
	private WebElement documentsLink;
	
	@FindBy(name="Campaigns")
	private WebElement campaignsLink;
	
	@FindBy(xpath="//a[text()='More']")
	private WebElement moreLink;

	@FindBy(xpath = "//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement administratorImage;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;
	
	
	public void signOutAction() {
		Actions action = new Actions(driver);
		action.moveToElement(administratorImage).perform();
		action.click(signOutLink);
	}
	
	public WebElement getSignOutLink() {
		return signOutLink;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getAdministratorImage() {
		return administratorImage;
	}

	public WebElement getOrganizationLink() {
		return organizationLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getOpportunitiesLink() {
		return opportunitiesLink;
	}

	public WebElement getProductsLink() {
		return productsLink;
	}

	public WebElement getVendorsLink() {
		return vendorsLink;
	}

	public WebElement getDocumentsLink() {
		return documentsLink;
	}

	public WebElement getCampaignsLink() {
		return campaignsLink;
	}
	public WebElement getMoreLink() {
		return moreLink;
	}

	public void clickOnLeads()
	{
	leadsLink.click();	
	}
	public void clickOnContacts()
	{
	contactsLink.click();	
	}
	public void clickOnOpportunities()
	{
	opportunitiesLink.click();	
	}
	public void clickOnProducts()
	{
	productsLink.click();	
	}
	public void clickOnDocuments()
	{
	documentsLink.click();	
	}
	/**
	 * This method is clicking on CampaingModule
	 */
	public void clickOnCampaigns()
	{
		Actions action=new Actions(driver);
		action.moveToElement(moreLink).perform();
		action.click(campaignsLink).perform();
	}
	public void clickOnVendors()
	{
		Actions action=new Actions(driver);
		action.moveToElement(moreLink).perform();
		action.click(vendorsLink).perform();
	}
	public void clickOnOrganizations()
	{
	organizationLink.click();	
	}

}