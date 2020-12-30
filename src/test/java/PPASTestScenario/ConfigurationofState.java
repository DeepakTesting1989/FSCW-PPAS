package PPASTestScenario;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.genericlib.Driver;
import com.genericlib.Xls_AllMethods;
import com.genericlib.constants;

import ObjectRepository.DistrictConfiguration;
import ObjectRepository.LoginTest;
import ObjectRepository.PACSConfiguration;
import ObjectRepository.PPASConstantsData;
import ObjectRepository.StateConfiguration;


public class ConfigurationofState extends Driver implements PPASConstantsData {
	

	String sheetName = "Result";	
	int rowCount = constants.fileone.getRowCount("Result");
	Driver dr = new Driver();
	
	

	@Test(priority=0)
	public void VerifyredirectiontoConfigurationpage() throws InterruptedException{
	//	test = extent.createTest("VerifyStateAddStateConfigurationpage");
		LoginTest lt = new LoginTest();
		lt.Statelogin();
//		Thread.sleep(3000);
		StateConfiguration sc = new StateConfiguration(driver);
		String expextedText = sc.ClickOnConfiguration().getText();
		String actualText = "Configuration";
		
		System.out.println(expextedText);
		
		System.out.println(expextedText);
		if(expextedText.equals(actualText))
		 {
			System.out.println("Pass");
			constants.fileone.setCellData(sheetName, "Status", 2 , "Pass");	
			
		 }
		
		 else
		 {
			 System.out.println("Fail");
			 constants.fileone.setCellData(sheetName, "Status", 2 , "Fail");
		 }
		
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expextedText,actualText);	
		
//		int rowNum=2;
		
		
		
	}
	
	
	@Test(priority=1)
	public void AddStateConfigurationFunctionality() throws InterruptedException{
	//	test = extent.createTest("VerifyStateAddStateConfigurationpage");
	
		
		StateConfiguration sc = new StateConfiguration(driver);
		sc.ClickOnConfiguration().click();
		Thread.sleep(500);
		sc.ClickOnStateConfiguration().click();
		Thread.sleep(1500);
		
		
	    
		((JavascriptExecutor) driver).executeScript("document.getElementsByName('dtmStartDate')[0].removeAttribute('readonly');");
	    WebElement dateFld = sc.SelectStartDate();
	    dateFld.clear();
	    dateFld.sendKeys("29-Dec-2020");
	    Thread.sleep(3000);
	    
	    
	    
	    
	    
	    ((JavascriptExecutor) driver).executeScript("document.getElementsByName('dtmEndDate')[0].removeAttribute('readonly');");
	    sc.SelectEndDate().sendKeys("30-Dec-2020");
	   // dateFld2.clear();
	    
	    Thread.sleep(3000);
	    
	    
	    sc.SelectKMCYear(3);
	    Thread.sleep(1500);
	    
	    sc.SelectSeason().sendKeys(StateSeason);
	    Thread.sleep(1500);
	    
	    sc.EnterMillerTarget().sendKeys(MillerTargetedAcceptancedays);
	    Thread.sleep(1500);
	    
	    sc.EnterSeasonDescription().sendKeys(SeasonDescription);
	    Thread.sleep(1500);
	    
	    sc.ClickOnSubmit().click();
	    Thread.sleep(1500);
	    
	    
	    
		String expextedText = sc.GetsubmissionMeggage().getText();
		String actualText = "State Configuration already exists.";
		
		System.out.println(expextedText);
		
		System.out.println(expextedText);
		if(expextedText.equals(actualText))
		 {
			System.out.println("Pass");
			constants.fileone.setCellData(sheetName, "Status", 3 , "Pass");	
			
		 }
		
		 else
		 {
			 System.out.println("Fail");
			 constants.fileone.setCellData(sheetName, "Status", 3 , "Fail");
		 }
		
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expextedText,actualText);	
		sc.ClickOnCloseButton().click();
		Thread.sleep(1500);
		
	}
	
	
	@Test(priority=2)
	public void ViewAddedStateConfigurationFunctionality() throws InterruptedException{
	//	test = extent.createTest("VerifyStateAddStateConfigurationpage");
	
		
		StateConfiguration sc = new StateConfiguration(driver);
		sc.ClickOnViewTab().click();
		Thread.sleep(1500);
		
		String expextedText = sc.GetViewStatus().getText();
		String actualText = "Active";
		
		System.out.println(expextedText);
		
		System.out.println(expextedText);
		if(expextedText.equals(actualText))
		 {
			System.out.println("Pass");
			constants.fileone.setCellData(sheetName, "Status", 4 , "Pass");	
			
		 }
		
		 else
		 {
			 System.out.println("Fail");
			 constants.fileone.setCellData(sheetName, "Status", 4 , "Fail");
		 }
		
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expextedText,actualText);	
		
		
		
		
	}
	
	@Test(priority=3)
	public void VerifyStateCofigurationDuplicity() throws InterruptedException{
	//	test = extent.createTest("VerifyStateAddStateConfigurationpage");
	
		
		StateConfiguration sc = new StateConfiguration(driver);
		sc.ClickOnConfiguration().click();
		Thread.sleep(500);
		sc.ClickOnStateConfiguration().click();
		Thread.sleep(1500);
		
		((JavascriptExecutor) driver).executeScript("document.getElementsByName('dtmStartDate')[0].removeAttribute('readonly');");
	    WebElement dateFld = sc.SelectStartDate();
	    dateFld.clear();
	    dateFld.sendKeys("29-Dec-2020");
	    Thread.sleep(3000);
	    
	    
	    
	    
	    
	    ((JavascriptExecutor) driver).executeScript("document.getElementsByName('dtmEndDate')[0].removeAttribute('readonly');");
	    sc.SelectEndDate().sendKeys("30-Dec-2020");
	   // dateFld2.clear();
	    
	    Thread.sleep(3000);
	    
	    
	    sc.SelectKMCYear(3);
	    Thread.sleep(1500);
	    
	    sc.SelectSeason().sendKeys(StateSeason);
	    Thread.sleep(1500);
	    
	    sc.EnterMillerTarget().sendKeys(MillerTargetedAcceptancedays);
	    Thread.sleep(1500);
	    
	    sc.EnterSeasonDescription().sendKeys(SeasonDescription);
	    Thread.sleep(1500);
	    
	    sc.ClickOnSubmit().click();
	    Thread.sleep(1500);
	    
	    
		String expextedText = sc.GetsubmissionMeggage().getText();
		String actualText = "State Configuration already exists.";
		
		System.out.println(expextedText);
		
		System.out.println(expextedText);
		if(expextedText.equals(actualText))
		 {
			System.out.println("Pass");
			constants.fileone.setCellData(sheetName, "Status", 5 , "Pass");	
			
		 }
		
		 else
		 {
			 System.out.println("Fail");
			 constants.fileone.setCellData(sheetName, "Status", 5 , "Fail");
		 }
		
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expextedText,actualText);	
		
		sc.ClickOnCloseButton().click();
		Thread.sleep(1500);
		sc.ClickOnSetting().click();
		Thread.sleep(3000);
		sc.ClickOnLogout().click();
		Thread.sleep(3000);
		driver.close();
		
	}
	
	
	
//	@Test(priority=4)
//	public void VerifyDistrictCofiguration() throws InterruptedException{
//	//	test = extent.createTest("VerifyDistrictCofiguration");
//		dr.getDriver();
//		LoginTest lt = new LoginTest();
//		lt.Districtlogin();
//		
//		DistrictConfiguration dc = new DistrictConfiguration(driver);
//		
//		dc.ClickOnConfiguration().click();
//		Thread.sleep(3000);
//		dc.ClickOnDistrictConfiguration().click();
//		Thread.sleep(5000);
//		String expextedText = dc.GetHeaderTextDistrict().getText();
//		String actualText = "Configuration";
//		
//		System.out.println(expextedText);
//		if(expextedText.equals("Add District Configuration"))
//		 {
//			System.out.println("Pass");
//			constants.fileone.setCellData(sheetName, "Status", 7 , "Pass");	
//			
//		 }
//		
//		 else
//		 {
//			 System.out.println("Fail");
//			 constants.fileone.setCellData(sheetName, "Status", 7 , "Fail");
//		 }
//		
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(expextedText,"Add District Configuration");	
//		
//		Select sl1 = new Select(dc.SelectMandiLabourChargesExcludingLoadingBy());
//		sl1.selectByVisibleText(MLChargesPByPACS);
//		Thread.sleep(3000);
//		
//		
//	}
//	
//	
//	@Test(priority=5)
//	public void AddDistrictConfigurationFunctionality() throws InterruptedException{
//	//	test = extent.createTest("AddDistrictConfigurationFunctionality");
//		DistrictConfiguration dc = new DistrictConfiguration(driver);
//		
//		//dc.SelectMandiLabourChargesExcludingLoadingBy().sendKeys(MLChargesPByPACS);
//		
////		dc.SelectMandiLabourChargesExcludingLoadingBy().sendKeys(MandiLChargesDirectPurchaseCenterPByPACS);
////		Thread.sleep(2000);
//		dc.SelectProcurementCapacityPerDay().sendKeys(ProcuremenCapacityperDay);
//		Thread.sleep(2000);
//		dc.SelectLabourChargesForLoadingBy().sendKeys(LChargesPaddyLoadingPByPACS);
//		Thread.sleep(2000);
//		dc.EnterMaximumFarmerSalePerDay().sendKeys(MaxPaddyFarmerSalePDay);
//		Thread.sleep(2000);
//		dc.SelectLabourChargesAtPPCBy().sendKeys(MandiLChargesDirectPurchaseCenterPByPACS);
//		Thread.sleep(2000);
//		dc.SelectTransportationDoneBy().sendKeys(TransportationofPaddyByPACS);
//		Thread.sleep(2000);
//		dc.ClickOnSubmit().click();
//		Thread.sleep(2000);
//		dc.ClickOnYes().click();
//		Thread.sleep(3000);
//		
//		
//		String expextedText1 = dc.GetMessageText().getText();
//		
//		System.out.println(expextedText1);
//		if(expextedText1.equals("District Configuration Successful"))
//		 {
//			System.out.println("Pass");
//			constants.fileone.setCellData(sheetName, "Status", 8 , "Pass");	
//			
//		 }
//		
//		 else
//		 {
//			 System.out.println("Fail");
//			 constants.fileone.setCellData(sheetName, "Status", 8 , "Fail");
//		 }
//		
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(expextedText1,"District Configuration Successful");	
//		
//		dc.ClickOnClose().click();
//		Thread.sleep(3000);
//	}
//	
//	
//	@Test(priority=6)
//	public void ViewAndEditDistrictConfigurationFunctionality() throws InterruptedException{
//		//test = extent.createTest("ViewAndEditDistrictConfigurationFunctionality");
//		DistrictConfiguration dc = new DistrictConfiguration(driver);
//		
//		dc.ClickOnViewTab().click();
//		Thread.sleep(2000);
//		dc.ClickOnAction().click();
//		Thread.sleep(2000);
//		
//		
//		String expextedText1 = dc.SelectProcurementCapacityPerDay().getText();
//		
//		System.out.println(expextedText1);
//		if(expextedText1.equals(ProcuremenCapacityperDay))
//		 {
//			System.out.println("Pass");
//			constants.fileone.setCellData(sheetName, "Status", 9 , "Pass");	
//			
//		 }
//		
//		 else
//		 {
//			 System.out.println("Fail");
//			 constants.fileone.setCellData(sheetName, "Status", 9 , "Fail");
//		 }
//		
//		
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(expextedText1,ProcuremenCapacityperDay);	
//		
//		
//	}
//	
//	
//	@Test(priority=7)
//	public void VerifyDistrictCofigurationDuplicity() throws InterruptedException{
//	//	test = extent.createTest("VerifyDistrictCofigurationDuplicity");
//		DistrictConfiguration dc = new DistrictConfiguration(driver);
//		
//		dc.ClickOnConfiguration().click();
//		Thread.sleep(2000);
//		dc.ClickOnDistrictConfiguration().click();
//		Thread.sleep(3000);
////		dc.SelectMandiLabourChargesExcludingLoadingBy().sendKeys(MLChargesPByPACS);
////		Thread.sleep(2000);
//		Select sl1 = new Select(dc.SelectMandiLabourChargesExcludingLoadingBy());
//		sl1.selectByVisibleText(MLChargesPByPACS);
//		Thread.sleep(3000);
//		dc.SelectProcurementCapacityPerDay().sendKeys(ProcuremenCapacityperDay);
//		Thread.sleep(2000);
//		dc.SelectLabourChargesForLoadingBy().sendKeys(LChargesPaddyLoadingPByPACS);
//		Thread.sleep(2000);
//		dc.EnterMaximumFarmerSalePerDay().sendKeys(MaxPaddyFarmerSalePDay);
//		Thread.sleep(2000);
//		dc.SelectLabourChargesAtPPCBy().sendKeys(MandiLChargesDirectPurchaseCenterPByPACS);
//		Thread.sleep(2000);
//		dc.SelectTransportationDoneBy().sendKeys(TransportationofPaddyByPACS);
//		Thread.sleep(2000);
//		dc.ClickOnSubmit().click();
//		Thread.sleep(2000);
//		dc.ClickOnYes().click();
//		Thread.sleep(3000);
//		
//		String expextedText1 = dc.GetMessageText().getText();
//		
//		System.out.println(expextedText1);
//		if(expextedText1.equals("District Configuration already exists."))
//		 {
//			System.out.println("Pass");
//			constants.fileone.setCellData(sheetName, "Status", 10 , "Pass");	
//			
//		 }
//		
//		 else
//		 {
//			 System.out.println("Fail");
//			 constants.fileone.setCellData(sheetName, "Status", 10 , "Fail");
//		 }
//		
//		
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(expextedText1,ProcuremenCapacityperDay);	
//		
//		dc.ClickOnClose().click();
//		Thread.sleep(3000);
//		dc.ClickOnSetting().click();
//		Thread.sleep(2000);
//		dc.ClickOnLogout().click();
//		Thread.sleep(3000);
//		driver.close();
//	}
//	
//	@Test(priority=8)
//	public void ConfigurationPageofPACS() throws InterruptedException{
//	//	test = extent.createTest("ConfigurationPageofPACS");
//		LoginTest lt = new LoginTest();
//		lt.PACSlogin();
//		
//		PACSConfiguration pc = new PACSConfiguration(driver);
//		
//		pc.ClickonConfiguraion().click();
//		Thread.sleep(1000);
//		pc.ClickonPacsConfiguraion().click();
//		Thread.sleep(3000);
//		
//		String expextedText1 = pc.GetPACConfigText().getText();
//		
//		System.out.println(expextedText1);
//		if(expextedText1.equals("Add PACS Configuration"))
//		 {
//			System.out.println("Pass");
//			constants.fileone.setCellData(sheetName, "Status", 11 , "Pass");	
//			
//		 }
//		
//		 else
//		 {
//			 System.out.println("Fail");
//			 constants.fileone.setCellData(sheetName, "Status", 11 , "Fail");
//		 }
//		
//		
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(expextedText1,"Add PACS Configuration");	
//		
//		
//	}
//	
//	@Test(priority=9)
//	public void AddPACSConfigurationFunctionality() throws InterruptedException{
//	//	test = extent.createTest("AddPACSConfigurationFunctionality");
//		PACSConfiguration pc = new PACSConfiguration(driver);
//		
//		pc.SelectSeason().sendKeys(Season);
//		Thread.sleep(2000);
//		pc.SelectLocationofPPC().sendKeys(LocationofPPCMY);
//		Thread.sleep(2000);
//		pc.SelectMarketYard().sendKeys(MarketYard);
//		Thread.sleep(2000);
//		pc.SelectProcuringAgency().sendKeys(ProcuringAgency);
//		Thread.sleep(2000);
//		pc.SelectGunnybagspacksuppliedby().sendKeys(GunnyBagsForPackingSuppliedByPACS);
//		Thread.sleep(2000);
//		pc.ClickOnSubmit().click();
//		Thread.sleep(3000);
//		pc.ClickOnYesButton().click();
//		Thread.sleep(2000);
//		pc.ClickOnClose().click();
//		Thread.sleep(3000);
//		
//		String expextedText1 = pc.GetMessageText().getText();
//		
//		System.out.println(expextedText1);
//		if(expextedText1.equals("PACS Configuration Successful"))
//		 {
//			System.out.println("Pass");
//			constants.fileone.setCellData(sheetName, "Status", 12 , "Pass");	
//			
//		 }
//		
//		 else
//		 {
//			 System.out.println("Fail");
//			 constants.fileone.setCellData(sheetName, "Status", 12 , "Fail");
//		 }
//		
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(expextedText1,"PACS Configuration Successful");	
//	
//	}
//	
//	@Test(priority=10)
//	public void VerifyViewPACSConfigurationFunctionality() throws InterruptedException{
//	//	test = extent.createTest("VerifyViewPACSConfigurationFunctionality");
//		PACSConfiguration pc = new PACSConfiguration(driver);
//		
//		pc.ClickOnView().click();
//		Thread.sleep(3000);
//		
//		
//		String expextedText1 = pc.GetRecentConfiguredStatus().getText();
//		
//		System.out.println(expextedText1);
//		if(expextedText1.equals("Active"))
//		 {
//			System.out.println("Pass");
//			constants.fileone.setCellData(sheetName, "Status", 13 , "Pass");	
//			
//		 }
//		
//		 else
//		 {
//			 System.out.println("Fail");
//			 constants.fileone.setCellData(sheetName, "Status", 13 , "Fail");
//		 }
//		
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(expextedText1,"Active");	
//	
//	}
//	
//	@Test(priority=11)
//	public void VerifySessonCloseFunctionality() throws InterruptedException{
//		//test = extent.createTest("VerifySessonCloseFunctionality");
//		PACSConfiguration pc = new PACSConfiguration(driver);
//		
//		pc.ClickOnSeasonIcon().click();
//		Thread.sleep(3000);
//		pc.ClickOnSeasonCloseButton().click();
//		Thread.sleep(2000);
//		pc.ClickOnYesButton().click();
//		Thread.sleep(2000);
//		pc.ClickOnClose().click();
//		Thread.sleep(2000);
//		
//		
//		String expextedText1 = pc.GetSeasonText().getText();
//		
//		System.out.println(expextedText1);
//		if(expextedText1.equals("Season Closed"))
//		 {
//			System.out.println("Pass");
//			constants.fileone.setCellData(sheetName, "Status", 14 , "Pass");	
//			
//		 }
//		
//		 else
//		 {
//			 System.out.println("Fail");
//			 constants.fileone.setCellData(sheetName, "Status", 14 , "Fail");
//		 }
//		
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(expextedText1,"Season Closed");	
//	
//	}
//	
//	@Test(priority=12)
//	public void StatusAfterSeasonClosed() throws InterruptedException{
//	//	test = extent.createTest("StatusAfterSeasonClosed");
//		PACSConfiguration pc = new PACSConfiguration(driver);
//		
////		pc.ClickOnSeasonIcon().click();
////		Thread.sleep(3000);
////		pc.ClickOnSeasonCloseButton().click();
////		Thread.sleep(2000);
////		pc.ClickOnYesButton().click();
////		Thread.sleep(2000);
////		pc.ClickOnClose().click();
////		Thread.sleep(2000);
//		
//		
//		
//		String expextedText1 = pc.GetStatusAfterSeasonClosed().getText();
//		
//		System.out.println(expextedText1);
//		if(expextedText1.equals("Inactive"))
//		 {
//			System.out.println("Pass");
//			constants.fileone.setCellData(sheetName, "Status", 15 , "Pass");	
//			
//		 }
//		
//		 else
//		 {
//			 System.out.println("Fail");
//			 constants.fileone.setCellData(sheetName, "Status", 15 , "Fail");
//		 }
//		
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(expextedText1,"Active");	
//	
//	}
//	
//	@Test(priority=13)
//	public void VeifyDuplicityPACSConfiguration() throws InterruptedException{
//		//test = extent.createTest("VeifyDuplicityPACSConfiguration");
//		PACSConfiguration pc = new PACSConfiguration(driver);
//		
//		pc.ClickonConfiguraion().click();
//		Thread.sleep(1000);
//		pc.ClickonPacsConfiguraion().click();
//		Thread.sleep(3000);
//		
//		pc.SelectSeason().sendKeys(Season);
//		Thread.sleep(2000);
//		pc.SelectLocationofPPC().sendKeys(LocationofPPCMY);
//		Thread.sleep(2000);
//		pc.SelectMarketYard().sendKeys(MarketYard);
//		Thread.sleep(2000);
//		pc.SelectProcuringAgency().sendKeys(ProcuringAgency);
//		Thread.sleep(2000);
//		pc.SelectGunnybagspacksuppliedby().sendKeys(GunnyBagsForPackingSuppliedByPACS);
//		Thread.sleep(2000);
//		pc.ClickOnSubmit().click();
//		Thread.sleep(3000);
//		pc.ClickOnYesButton().click();
//		Thread.sleep(2000);
//		pc.ClickOnClose().click();
//		Thread.sleep(3000);
//		
//		String expextedText1 = pc.GetMessageText().getText();
//		
//		System.out.println(expextedText1);
//		if(expextedText1.equals("PACS Configuration Successful"))
//		 {
//			System.out.println("Pass");
//			constants.fileone.setCellData(sheetName, "Status", 16 , "Pass");	
//			
//		 }
//		
//		 else
//		 {
//			 System.out.println("Fail");
//			 constants.fileone.setCellData(sheetName, "Status", 16 , "Fail");
//		 }
//	
//		
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(expextedText1,"You have Already Configured for Selected PPC");	
//	
//		driver.quit();
//	}
//	
//	
	
	
}
