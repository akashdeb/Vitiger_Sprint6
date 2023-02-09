package lead_module_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import vitiger.genericUtility.BaseClass;
import vitiger.genericUtility.IPathConstant;
import vtiger.pomRepository.CreateNewLeadPage;
import vtiger.pomRepository.HomePage;
import vtiger.pomRepository.LeadInformationPage;
import vtiger.pomRepository.LeadsPage;
/**
 * This is a class to create a Leads
 * @author Akash
 *
 */
@Listeners(vitiger.genericUtility.ListenersImplementationClass.class)
public class CreateLeadTest extends BaseClass {
	
	@Test
	public void toCreateALeadAndToVerifyTheLead() throws EncryptedDocumentException, IOException, InterruptedException {
		
		//Creating an object of all POM classes
		LeadInformationPage leadInfo=new LeadInformationPage(driver);
		HomePage home=new HomePage(driver);
		LeadsPage leads = new LeadsPage(driver);
		CreateNewLeadPage createLead = new CreateNewLeadPage(driver);

		//Fetch test script data from test data of test case
		String salutationOfLead = eUtils.fetchDataFromExcelSheet(IPathConstant.LEADSHEETNAME, 17, 2);
		String expectedLeadfirstName = eUtils.fetchDataFromExcelSheet(IPathConstant.LEADSHEETNAME, 18, 2);
		String lastName = eUtils.fetchDataFromExcelSheet(IPathConstant.LEADSHEETNAME, 19, 2);
		String companyName = eUtils.fetchDataFromExcelSheet(IPathConstant.LEADSHEETNAME, 20, 2);
		String industry = eUtils.fetchDataFromExcelSheet(IPathConstant.LEADSHEETNAME, 21, 2);
		int randomNo = jUtils.generateRandomNo(1000);
		
		//Clicking on Leads Module
		home.clickOnLeads();
		
		//Clicking on Leads plus button image
		leads.clickOnLeadPlusButton();
		
		//Creating a new Lead
		createLead.selectSalutation(salutationOfLead);
		createLead.firstName(expectedLeadfirstName+randomNo);
		createLead.lastName(lastName+randomNo);
		createLead.companyName(companyName);
		createLead.industryDropDown(industry);
		createLead.selectUserAssignedToRadioButton();
		createLead.saveButton();
		
		//Verifying Lead has been created or not
		String actualLeadFirstName = leadInfo.verifyLeadInfo(expectedLeadfirstName);
		
		Assert.assertTrue(actualLeadFirstName.contains(expectedLeadfirstName), "Fail: The Lead has not been created");
		System.out.println("Pass: The Lead has been created");
		
	}

}
