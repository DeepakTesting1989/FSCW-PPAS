package PPASTestScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.genericlib.Driver;
import com.genericlib.constants;

import ObjectRepository.DistrictConfiguration;
import ObjectRepository.LoginTest;
import ObjectRepository.PPASConstantsData;

public class ConfigurationofDistrict extends Driver implements PPASConstantsData {
	String sheetName = "Result";	
	int rowCount = constants.fileone.getRowCount("Result");
	Driver dr = new Driver();
	
	


	@Test(priority=4)
	public void VerifyDistrictCofiguration() throws InterruptedException{
	//	test = extent.createTest("VerifyDistrictCofiguration");
		dr.getDriver();
		LoginTest lt = new LoginTest();
		lt.Districtlogin();
		
		DistrictConfiguration dc = new DistrictConfiguration(driver);
		
		dc.ClickOnConfiguration().click();
		Thread.sleep(3000);
		dc.ClickOnDistrictConfiguration().click();
		Thread.sleep(5000);
		String expextedText = dc.GetHeaderTextDistrict().getText();
		String actualText = "Configuration";
		
		System.out.println(expextedText);
		if(expextedText.equals("Add District Configuration"))
		 {
			System.out.println("Pass");
			constants.fileone.setCellData(sheetName, "Status", 7 , "Pass");	
			
		 }
		
		 else
		 {
			 System.out.println("Fail");
			 constants.fileone.setCellData(sheetName, "Status", 7 , "Fail");
		 }
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expextedText,"Add District Configuration");	
		
		Select sl1 = new Select(dc.SelectMandiLabourChargesExcludingLoadingBy());
		sl1.selectByVisibleText(MLChargesPByPACS);
		Thread.sleep(3000);
		
		
	}
	
	
	@Test(priority=5)
	public void AddDistrictConfigurationFunctionality() throws InterruptedException{
	//	test = extent.createTest("AddDistrictConfigurationFunctionality");
		DistrictConfiguration dc = new DistrictConfiguration(driver);
		
		//dc.SelectMandiLabourChargesExcludingLoadingBy().sendKeys(MLChargesPByPACS);
		
//		dc.SelectMandiLabourChargesExcludingLoadingBy().sendKeys(MandiLChargesDirectPurchaseCenterPByPACS);
//		Thread.sleep(2000);
		dc.SelectProcurementCapacityPerDay().sendKeys(ProcuremenCapacityperDay);
		Thread.sleep(2000);
		dc.SelectLabourChargesForLoadingBy().sendKeys(LChargesPaddyLoadingPByPACS);
		Thread.sleep(2000);
		dc.EnterMaximumFarmerSalePerDay().sendKeys(MaxPaddyFarmerSalePDay);
		Thread.sleep(2000);
		dc.SelectLabourChargesAtPPCBy().sendKeys(MandiLChargesDirectPurchaseCenterPByPACS);
		Thread.sleep(2000);
		dc.SelectTransportationDoneBy().sendKeys(TransportationofPaddyByPACS);
		Thread.sleep(2000);
		dc.ClickOnSubmit().click();
		Thread.sleep(2000);
		dc.ClickOnYes().click();
		Thread.sleep(3000);
		
		
		String expextedText1 = dc.GetMessageText().getText();
		
		System.out.println(expextedText1);
		if(expextedText1.equals("District Configuration already exists."))
		 {
			System.out.println("Pass");
			constants.fileone.setCellData(sheetName, "Status", 8 , "Pass");	
			
		 }
		
		 else
		 {
			 System.out.println("Fail");
			 constants.fileone.setCellData(sheetName, "Status", 8 , "Fail");
		 }
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expextedText1,"District Configuration already exists.");	
		
		dc.ClickOnClose().click();
		Thread.sleep(3000);
	}
	
	
	@Test(priority=6)
	public void ViewAndEditDistrictConfigurationFunctionality() throws InterruptedException{
		//test = extent.createTest("ViewAndEditDistrictConfigurationFunctionality");
		DistrictConfiguration dc = new DistrictConfiguration(driver);
		
		dc.ClickOnViewTab().click();
		Thread.sleep(2000);
		dc.ClickOnAction().click();
		Thread.sleep(2000);
		
		dc.SelectProcurementCapacityPerDay().clear();
		dc.SelectProcurementCapacityPerDay().sendKeys("3200");
		Thread.sleep(2000);
		dc.EnterMaximumFarmerSalePerDay().clear();
		dc.EnterMaximumFarmerSalePerDay().sendKeys("95");
		Thread.sleep(2000);
		
		dc.ClickUpdateButton().click();
		Thread.sleep(2000);
		dc.ClickOnUpdatedYes().click();
		Thread.sleep(2000);
		
		
		String expextedText1 = dc.GetMessageText().getText();
		String actual = "Data Updated Successfully";
		System.out.println(expextedText1);
		if(expextedText1.equals(actual))
		 {
			System.out.println("Pass");
			constants.fileone.setCellData(sheetName, "Status", 9 , "Pass");	
			
		 }
		
		 else
		 {
			 System.out.println("Fail");
			 constants.fileone.setCellData(sheetName, "Status", 9 , "Fail");
		 }
		
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expextedText1,actual);	
		dc.ClickOnCloseButton().click();
		Thread.sleep(2000);
		
	}
	
	
	@Test(priority=7)
	public void VerifyDistrictCofigurationDuplicity() throws InterruptedException{
	//	test = extent.createTest("VerifyDistrictCofigurationDuplicity");
		DistrictConfiguration dc = new DistrictConfiguration(driver);
		
		dc.ClickOnConfiguration().click();
		Thread.sleep(2000);
		dc.ClickOnDistrictConfiguration().click();
		Thread.sleep(3000);
//		dc.SelectMandiLabourChargesExcludingLoadingBy().sendKeys(MLChargesPByPACS);
//		Thread.sleep(2000);
		Select sl1 = new Select(dc.SelectMandiLabourChargesExcludingLoadingBy());
		sl1.selectByVisibleText(MLChargesPByPACS);
		Thread.sleep(3000);
		dc.SelectProcurementCapacityPerDay().sendKeys(ProcuremenCapacityperDay);
		Thread.sleep(2000);
		dc.SelectLabourChargesForLoadingBy().sendKeys(LChargesPaddyLoadingPByPACS);
		Thread.sleep(2000);
		dc.EnterMaximumFarmerSalePerDay().sendKeys(MaxPaddyFarmerSalePDay);
		Thread.sleep(2000);
		dc.SelectLabourChargesAtPPCBy().sendKeys(MandiLChargesDirectPurchaseCenterPByPACS);
		Thread.sleep(2000);
		dc.SelectTransportationDoneBy().sendKeys(TransportationofPaddyByPACS);
		Thread.sleep(2000);
		dc.ClickOnSubmit().click();
		Thread.sleep(2000);
		dc.ClickOnYes().click();
		Thread.sleep(3000);
		
		String expextedText1 = dc.GetMessageText().getText();
		
		System.out.println(expextedText1);
		if(expextedText1.equals("District Configuration already exists."))
		 {
			System.out.println("Pass");
			constants.fileone.setCellData(sheetName, "Status", 10 , "Pass");	
			
		 }
		
		 else
		 {
			 System.out.println("Fail");
			 constants.fileone.setCellData(sheetName, "Status", 10 , "Fail");
		 }
		
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expextedText1,ProcuremenCapacityperDay);	
		
		dc.ClickOnClose().click();
		Thread.sleep(3000);
		dc.ClickOnSetting().click();
		Thread.sleep(2000);
		dc.ClickOnLogout().click();
		Thread.sleep(3000);
		driver.close();
	}
	
}
