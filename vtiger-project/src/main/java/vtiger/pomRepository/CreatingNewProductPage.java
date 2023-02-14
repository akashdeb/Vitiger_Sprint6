package vtiger.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewProductPage {
	
	public CreatingNewProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='productname']")
	private WebElement productNameTextField;
	
	@FindBy(xpath="//input[@name='discontinued']")
	private WebElement productActiveCheckBox;
	
	@FindBy(xpath="//img[@id='jscal_trigger_sales_start_date']")
	private WebElement salesStartDateCalendarIcon;
	
	
	@FindBy(name = "sales_start_date")
	private WebElement salesStartDateCalender;
	
	@FindBy(xpath="//select[@name='manufacturer']")
	private WebElement manufacturerDropDown;
	
	@FindBy(xpath="//select[@name='productcategory']")
	private WebElement productCategoryDropDown;
	
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement vendorNameLookUpPlusIcon;
	
	@FindBy(xpath="//input[@id=\"unit_price\"]")
	private WebElement unitPriceTextField;
	
	@FindBy(xpath="//input[@name=\"commissionrate\"]")
	private WebElement commissionRateTextField;
	
	
	@FindBy(xpath="//input[@name=\"tax1_check\"]")
	private WebElement vatCheckBox;
	
	@FindBy(xpath="//input[@name=\"tax1\"]")
	private WebElement vatTextField;
	
	@FindBy(xpath="//input[@value='U']")
	private WebElement userRadioButton;
	
	@FindBy(xpath="//input[@value='T']")
	private WebElement groupRadioButton;
	
	@FindBy(xpath="//select[@name=\"assigned_user_id\"]")
	private WebElement handlerDropDown;
	
	@FindBy(xpath="//input[@name='file_0']")
	private WebElement productImageChooseFileButton;
	
	@FindBy(xpath="//input[@accesskey='S']")
	private WebElement saveButton;

	public WebElement getProductNameTextField() {
		return productNameTextField;
	}

	public WebElement getProductActiveCheckBox() {
		return productActiveCheckBox;
	}

	public WebElement getSalesStartDateCalendarIcon() {
		return salesStartDateCalendarIcon;
	}

	public WebElement getManufacturerDropDown() {
		return manufacturerDropDown;
	}

	public WebElement getProductCategoryDropDown() {
		return productCategoryDropDown;
	}

	public WebElement getVendorNameLookUpPlusIcon() {
		return vendorNameLookUpPlusIcon;
	}

	public WebElement getUnitPriceTextField() {
		return unitPriceTextField;
	}

	public WebElement getCommissionRateTextField() {
		return commissionRateTextField;
	}

	public WebElement getVatCheckBox() {
		return vatCheckBox;
	}

	public WebElement getVatTextField() {
		return vatTextField;
	}

	public WebElement getUserRadioButton() {
		return userRadioButton;
	}

	public WebElement getGroupRadioButton() {
		return groupRadioButton;
	}

	public WebElement getHandlerDropDown() {
		return handlerDropDown;
	}

	public WebElement getProductImageChooseFileButton() {
		return productImageChooseFileButton;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void productName(String productNameData)
	{
		productNameTextField.sendKeys(productNameData);
	}
	
	public void productActiveCheckBox()
	{
		productActiveCheckBox.click();
	}
	
	public void salesStartDateCalendarIcon()
	{
		salesStartDateCalendarIcon.click();
	}
	
	public void selectManufacturerDropDown(String manufacturerData)
	{
		Select select=new Select(manufacturerDropDown);
		select.selectByVisibleText(manufacturerData);
	}
	
	public void selectProductCategoryDropDown(String productCategoryData)
	{
		Select select=new Select(productCategoryDropDown);
		select.selectByVisibleText(productCategoryData);
	}
	
	public void clickOnvendorLookUpIcon()
	{
		vendorNameLookUpPlusIcon.click();
	}
	
	public void unitPriceTextField(String unitPriceData)
	{
		unitPriceTextField.sendKeys(unitPriceData);
	}
	
	public void commissionRatetextField(String commissionData)
	{
		commissionRateTextField.sendKeys(commissionData);
	}
	
	public void vatCheckBox()
	{
		vatCheckBox.click();
	}
	
	public void vatTextField(String vatData)
	{
		vatTextField.sendKeys(vatData);
	}
	
	public void userRadioButton()
	{
		userRadioButton.click();
	}
	
	public void groupRadioButton()
	{
		groupRadioButton.click();
	}
	
	public void selectHandler(String option)
	{
		Select select=new Select(handlerDropDown);
		select.selectByVisibleText(option);		
	}
	
	public void uploadProductImage(String filePath)
	{
		String projectPath = System.getProperty("user.dir");
		productImageChooseFileButton.sendKeys(projectPath+filePath);
	}
	
	public void saveButton()
	{
		saveButton.click();
	}
	

}
