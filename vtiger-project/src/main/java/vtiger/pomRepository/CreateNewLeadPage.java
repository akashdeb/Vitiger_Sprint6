package vtiger.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewLeadPage {
		
		public CreateNewLeadPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//select[@name='salutationtype']")
		WebElement salutationDropDown;
		
		@FindBy(name="firstname")
		WebElement firstNameTextField;
		
		@FindBy(name="lastname")
		WebElement lastNameTextField;
		
		@FindBy(name="company")
		WebElement companyTextField;
		
		@FindBy(name="designation")
		WebElement titleTextField;
		
		@FindBy(name="leadsource")
		WebElement leadSourceDropDown;
		
		@FindBy(name="industry")
		WebElement industryDropDown;
		
		@FindBy(name="annualrevenue")
		WebElement annualRevenueTextField;
		
		@FindBy(name="noofemployees")
		WebElement noOfEmployeesTextField;
		
		@FindBy(name="secondaryemail")
		WebElement seondaryEmailTextField;
		
		@FindBy(name="phone")
		WebElement phoneTextField;
		
		@FindBy(name="mobile")
		WebElement mobileTextField;
		
		@FindBy(name="fax")
		WebElement faxTextField;
		
		@FindBy(name="email")
		WebElement emailTextField;
		
		@FindBy(name="website")
		WebElement websiteTextField;
		
		@FindBy(name="leadstatus")
		WebElement leadStatusDropDown;
		
		@FindBy(name="rating")
		WebElement ratingDropDown;
		
		@FindBy(xpath="//input[@value=\"U\"]")
		WebElement assignedToUserRadioButton;
		
		@FindBy(xpath="//input[@value=\"T\"]")
		WebElement assignedToGroupRadioButton;
		
		@FindBy(name="assigned_user_id")
		WebElement assignedToDropDown;
		
		@FindBy(name="lane")
		WebElement addressStreetTextArea;
		
		@FindBy(name="code")
		WebElement postalCodeTextField;
		
		@FindBy(name="country")
		WebElement countryTextField;
		
		@FindBy(name="pobox")
		WebElement poboxTextField;
		
		@FindBy(name="city")
		WebElement cityTextField;
		
		@FindBy(name="state")
		WebElement stateTextField;
		
		@FindBy(name="description")
		WebElement descriptionTextArea;
		
		@FindBy(xpath="//input[@accesskey='S']")
		WebElement saveButton;

		public WebElement getSalutationDropDown() {
			return salutationDropDown;
		}

		public WebElement getFirstNameTextField() {
			return firstNameTextField;
		}

		public WebElement getLastNameTextField() {
			return lastNameTextField;
		}

		public WebElement getCompanyTextField() {
			return companyTextField;
		}

		public WebElement getTitleTextField() {
			return titleTextField;
		}

		public WebElement getLeadSourceDropDown() {
			return leadSourceDropDown;
		}

		public WebElement getIndustryDropDown() {
			return industryDropDown;
		}

		public WebElement getAnnualRevenueTextField() {
			return annualRevenueTextField;
		}

		public WebElement getNoOfEmployeesTextField() {
			return noOfEmployeesTextField;
		}

		public WebElement getSeondaryEmailTextField() {
			return seondaryEmailTextField;
		}

		public WebElement getPhoneTextField() {
			return phoneTextField;
		}

		public WebElement getMobileTextField() {
			return mobileTextField;
		}

		public WebElement getFaxTextField() {
			return faxTextField;
		}

		public WebElement getEmailTextField() {
			return emailTextField;
		}

		public WebElement getWebsiteTextField() {
			return websiteTextField;
		}

		public WebElement getLeadStatusDropDown() {
			return leadStatusDropDown;
		}

		public WebElement getRatingDropDown() {
			return ratingDropDown;
		}

		public WebElement getAssignedToUserRadioButton() {
			return assignedToUserRadioButton;
		}

		public WebElement getAssignedToGroupRadioButton() {
			return assignedToGroupRadioButton;
		}

		public WebElement getAssignedToDropDown() {
			return assignedToDropDown;
		}

		public WebElement getAddressStreetTextArea() {
			return addressStreetTextArea;
		}

		public WebElement getPostalCodeTextField() {
			return postalCodeTextField;
		}

		public WebElement getCounryTextField() {
			return countryTextField;
		}

		public WebElement getPoboxTextField() {
			return poboxTextField;
		}

		public WebElement getCityTextField() {
			return cityTextField;
		}

		public WebElement getStateTextField() {
			return stateTextField;
		}

		public WebElement getDescriptionTextArea() {
			return descriptionTextArea;
		}

		public WebElement getSaveButton() {
			return saveButton;
		}
		
		public void selectSalutation(String option)
		{
			Select select=new Select(salutationDropDown);
			select.selectByVisibleText(option);
		}
		public void firstName(String firstNameData)
		{
			firstNameTextField.sendKeys(firstNameData);
		}
		public void lastName(String lastNameData)
		{
			lastNameTextField.sendKeys(lastNameData);
		}
		public void companyName(String companyData)
		{
			companyTextField.sendKeys(companyData);
		}
		public void titleTextField(String titleData)
		{
			titleTextField.sendKeys(titleData);
		}
		public void leadSourceDropDown(String leadSourceData)
		{
			Select select=new Select(leadSourceDropDown);
			select.selectByVisibleText(leadSourceData);
		}
		public void industryDropDown(String industryData)
		{
			Select select=new Select(industryDropDown);
			select.selectByVisibleText(industryData);
		}
		public void annualRevenueTextField(String annualRevenueData)
		{
			annualRevenueTextField.sendKeys(annualRevenueData);
		}
		public void noOfEmployeeTextField(String noOfEmployeeData)
		{
			noOfEmployeesTextField.sendKeys(noOfEmployeeData);
		}
		public void secondaryEmailTextField(String secondaryEmailData)
		{
			seondaryEmailTextField.sendKeys(secondaryEmailData);
		}
		public void phoneTextField(String phoneData)
		{
			phoneTextField.sendKeys(phoneData);
		}
		public void mobileTextField(String mobileData)
		{
			mobileTextField.sendKeys(mobileData);
		}
		public void faxTextField(String faxData)
		{
			faxTextField.sendKeys(faxData);
		}
		public void emailTextField(String emailData)
		{
			emailTextField.sendKeys(emailData);
		}
		public void websiteTextField(String websiteData)
		{
			websiteTextField.sendKeys(websiteData);
		}
		public void selectLeadStatus(String option)
		{
			Select select=new Select(leadSourceDropDown);
			select.selectByVisibleText(option);
		}
		public void selectRating(String Option)
		{
			Select select=new Select(ratingDropDown);
			select.selectByVisibleText(Option);
		}
		public void selectUserAssignedToRadioButton()
		{
			assignedToUserRadioButton.click();
		}
		public void selectGroupAssignedToRadioButton()
		{
			assignedToGroupRadioButton.click();
		}
		public void selectAssignedToDropdownlist(String option)
		{
			Select select=new Select(assignedToDropDown);
			select.selectByVisibleText(option);
		}
		public void addressStreetTextArea(String addressStreetData)
		{
			addressStreetTextArea.sendKeys(addressStreetData);
		}
		public void postalCode(String postalCodeData)
		{
			postalCodeTextField.sendKeys(postalCodeData);
		}
		public void countryTextField(String countryData)
		{
			countryTextField.sendKeys(countryData);
		}
		public void poBoxTextField(String poBoxData)
		{
			poboxTextField.sendKeys(poBoxData);
		}
		public void cityTextField(String cityData)
		{
			cityTextField.sendKeys(cityData);
		}
		public void stateTextField(String stateData)
		{
			stateTextField.sendKeys(stateData);
		}
		public void descriptionTextArea(String descriptionData)
		{
			descriptionTextArea.sendKeys(descriptionData);
		}
		public void saveButton()
		{
			saveButton.click();
		}
		
	
	}

