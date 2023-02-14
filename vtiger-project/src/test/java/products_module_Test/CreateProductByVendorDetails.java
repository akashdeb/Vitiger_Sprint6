package products_module_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import vitiger.genericUtility.BaseClass;
import vitiger.genericUtility.IPathConstant;
import vtiger.pomRepository.CreateNewVendorPage;
import vtiger.pomRepository.CreatingNewProductPage;
import vtiger.pomRepository.HomePage;
import vtiger.pomRepository.ProductPage;
import vtiger.pomRepository.VendorInformationPage;
import vtiger.pomRepository.VendorLookUpPage;
import vtiger.pomRepository.VendorsPage;

public class CreateProductByVendorDetails extends BaseClass {
	
	@Test
	public void createProductByVendorDetails() {
		
		String expectedVendorInformation = "Exide";
		HomePage home=new HomePage(driver);
		home.clickOnVendors();
		
		VendorsPage vendor=new VendorsPage(driver);
		vendor.clickOnVendorPlusButton();
		
		CreateNewVendorPage createVendor = new CreateNewVendorPage(driver);
		createVendor.createVendor(expectedVendorInformation, "300-Sales-Software");
		
		VendorInformationPage vendorInfo = new VendorInformationPage(driver);
		String actualVendorInformation = vendorInfo.verifyVendor(expectedVendorInformation);
		
		Assert.assertTrue(actualVendorInformation.contains(expectedVendorInformation), "Vendor information has not been verified");
		System.out.println("Vendor information has been verified");
		
		home.clickOnProducts();
		
		ProductPage product=new ProductPage(driver);
		product.clickOnProductPlusButton();
		
		CreatingNewProductPage createProduct = new CreatingNewProductPage(driver);
		createProduct.productName("Toyota-V12");
		
		createProduct.clickOnvendorLookUpIcon();
		
		wUtils.switchToWindow(driver, "Vendors&action");
		
		VendorLookUpPage vendorLookUp = new VendorLookUpPage(driver);
		vendorLookUp.clickOnVendor(expectedVendorInformation);
		
		wUtils.switchToWindow(driver, "Products");
				
		createProduct.uploadProductImage("/src/test/resources/Resume.docx");
		
		createProduct.saveButton();
		
	}

}
