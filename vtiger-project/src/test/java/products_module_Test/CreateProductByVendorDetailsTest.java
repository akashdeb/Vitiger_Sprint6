package products_module_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import vitiger.genericUtility.BaseClass;
import vitiger.genericUtility.IPathConstant;
import vtiger.pomRepository.CreateNewVendorPage;
import vtiger.pomRepository.CreatingNewProductPage;
import vtiger.pomRepository.HomePage;
import vtiger.pomRepository.ProductInformationPage;
import vtiger.pomRepository.ProductPage;
import vtiger.pomRepository.VendorInformationPage;
import vtiger.pomRepository.VendorLookUpPage;
import vtiger.pomRepository.VendorsPage;
@Listeners(vitiger.genericUtility.ListenersImplementationClass.class)
/**
 * 
 * @author Akash
 *
 */
public class CreateProductByVendorDetailsTest extends BaseClass {
	
	@Test(retryAnalyzer = vitiger.genericUtility.RetryAnalyserImplementationClass.class)
	public void createProductByVendorDetailsTest() throws EncryptedDocumentException, IOException {
		
		//Test Scripts Datas
		String expectedVendorInformation = "Exide";
		String ProductName = eUtils.fetchDataFromExcelSheet(IPathConstant.PRODUCTSHEETNAME, 51, 2);
		
		//Object creation of POM Classes
		HomePage home=new HomePage(driver);
		VendorsPage vendor=new VendorsPage(driver);
		VendorInformationPage vendorInfo = new VendorInformationPage(driver);
		CreatingNewProductPage createProduct = new CreatingNewProductPage(driver);
		ProductPage product=new ProductPage(driver);
		VendorLookUpPage vendorLookUp = new VendorLookUpPage(driver);
		ProductInformationPage productInfo = new ProductInformationPage(driver);

		//Creating a Vendor to avoid data dependency
		CreateNewVendorPage createVendor = new CreateNewVendorPage(driver);

		home.clickOnVendors();
		
		vendor.clickOnVendorPlusButton();
		
		createVendor.createVendor(expectedVendorInformation, "300-Sales-Software");
		
		String actualVendorInformation = vendorInfo.verifyVendor(expectedVendorInformation);
		
		//Verifing Vendor is created or not
		Assert.assertTrue(actualVendorInformation.contains(expectedVendorInformation), "Vendor information has not been verified");
		System.out.println("Vendor information has been verified");
		
		//Creating Products
		home.clickOnProducts();
		
		product.clickOnProductPlusButton();
		
		createProduct.productName("Toyota-V12");
		
		createProduct.clickOnvendorLookUpIcon();
		
		wUtils.switchToWindow(driver, "Vendors&action");
		
		vendorLookUp.clickOnVendor(expectedVendorInformation);
		
		wUtils.switchToWindow(driver, "Products");
				
		createProduct.uploadProductImage("/src/test/resources/Resume.docx");
		
		createProduct.saveButton();
		
		String actualProductName = productInfo.verifyProduct("Toyota-V12");
		
		//Verifying product is created or not
		Assert.assertTrue(actualProductName.contains("Toyota-V12"), "Product Name has not been verified");
	}

}
