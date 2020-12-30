package PPASTestScenario;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.genericlib.Driver;
import com.genericlib.constants;

import ObjectRepository.LoginTest;
import ObjectRepository.PACSConfiguration;
import ObjectRepository.PPASConstantsData;

public class ConfigurationofPacs extends Driver implements PPASConstantsData{
	String sheetName = "Result";	
	int rowCount = constants.fileone.getRowCount("Result");
	Driver dr = new Driver();
	
	
	@Test(priority=8)
	public void ConfigurationPageofPACS() throws InterruptedException{
	//	test = extent.createTest("ConfigurationPageofPACS");
		LoginTest lt = new LoginTest();
		lt.PACSlogin();
		
		PACSConfiguration pc = new PACSConfiguration(driver);
		
		pc.ClickonConfiguraion().click();
		Thread.sleep(1000);
		pc.ClickonPacsConfiguraion().click();
		Thread.sleep(3000);
		
		String expextedText1 = pc.GetPACConfigText().getText();
		
		System.out.println(expextedText1);
		if(expextedText1.equals("Add PACS Configuration"))
		 {
			System.out.println("Pass");
			constants.fileone.setCellData(sheetName, "Status", 11 , "Pass");	
			
		 }
		
		 else
		 {
			 System.out.println("Fail");
			 constants.fileone.setCellData(sheetName, "Status", 11 , "Fail");
		 }
		
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expextedText1,"Add PACS Configuration");	
		
		
	}
	
	@Test(priority=9)
	public void AddPACSConfigurationFunctionality() throws InterruptedException{
	//	test = extent.createTest("AddPACSConfigurationFunctionality");
		PACSConfiguration pc = new PACSConfiguration(driver);
		
		pc.SelectSeason().sendKeys(Season);
		Thread.sleep(2000);
		pc.SelectLocationofPPC().sendKeys("Market Yard");
		Thread.sleep(2000);
		pc.SelectMarketYard().sendKeys("Chhatrang(MY060203)");
		Thread.sleep(2000);
		pc.SelectProcuringAgency().sendKeys(ProcuringAgency);
		Thread.sleep(2000);
		pc.SelectGunnybagspacksuppliedby().sendKeys("Miller");
		Thread.sleep(2000);
		pc.ClickOnSubmit().click();
		Thread.sleep(3000);
		pc.ClickOnYesButton().click();
		Thread.sleep(2000);
		pc.ClickOnClose().click();
		Thread.sleep(3000);
		
		String expextedText1 = pc.GetMessageText().getText();
		
		System.out.println(expextedText1);
		if(expextedText1.equals("You have Already Configured for Selected PPC"))
		 {
			System.out.println("Pass");
			constants.fileone.setCellData(sheetName, "Status", 12 , "Pass");	
			
		 }
		
		 else
		 {
			 System.out.println("Fail");
			 constants.fileone.setCellData(sheetName, "Status", 12 , "Fail");
		 }
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expextedText1,"You have Already Configured for Selected PPC");	
	
	}
	
	@Test(priority=10)
	public void VerifyViewPACSConfigurationFunctionality() throws InterruptedException{
	//	test = extent.createTest("VerifyViewPACSConfigurationFunctionality");
		PACSConfiguration pc = new PACSConfiguration(driver);
		
		pc.ClickOnView().click();
		Thread.sleep(3000);
		
		
		String expextedText1 = pc.GetRecentConfiguredStatus().getText();
		
		System.out.println(expextedText1);
		if(expextedText1.equals("Active"))
		 {
			System.out.println("Pass");
			constants.fileone.setCellData(sheetName, "Status", 13 , "Pass");	
			
		 }
		
		 else
		 {
			 System.out.println("Fail");
			 constants.fileone.setCellData(sheetName, "Status", 13 , "Fail");
		 }
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expextedText1,"Active");	
	
	}
	
	@Test(priority=11)
	public void VerifySessonCloseFunctionality() throws InterruptedException{
		//test = extent.createTest("VerifySessonCloseFunctionality");
		PACSConfiguration pc = new PACSConfiguration(driver);
		
		pc.ClickOnSeasonIcon().click();
		Thread.sleep(3000);
//		pc.ClickOnSeasonCloseButton().click();
//		Thread.sleep(2000);
//		pc.ClickOnYesButton().click();
//		Thread.sleep(2000);
		
		
		
		String expextedText1 = pc.GetSeasonText().getText();
		
		System.out.println(expextedText1);
		if(expextedText1.equals("Season Closed"))
		 {
			System.out.println("Pass");
			constants.fileone.setCellData(sheetName, "Status", 14 , "Pass");	
			
		 }
		
		 else
		 {
			 System.out.println("Fail");
			 constants.fileone.setCellData(sheetName, "Status", 14 , "Fail");
		 }
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expextedText1,"Season Closed");	
//		pc.ClickOnClose().click();
//		Thread.sleep(2000);
	}
	
	@Test(priority=12)
	public void StatusAfterSeasonClosed() throws InterruptedException{
	//	test = extent.createTest("StatusAfterSeasonClosed");
		PACSConfiguration pc = new PACSConfiguration(driver);
		
//		pc.ClickOnSeasonIcon().click();
//		Thread.sleep(3000);
//		pc.ClickOnSeasonCloseButton().click();
//		Thread.sleep(2000);
//		pc.ClickOnYesButton().click();
//		Thread.sleep(2000);
//		pc.ClickOnClose().click();
//		Thread.sleep(2000);
		
		
		
		String expextedText1 = pc.GetStatusAfterSeasonClosed().getText();
		
		System.out.println(expextedText1);
		if(expextedText1.equals("Inactive"))
		 {
			System.out.println("Pass");
			constants.fileone.setCellData(sheetName, "Status", 15 , "Pass");	
			
		 }
		
		 else
		 {
			 System.out.println("Fail");
			 constants.fileone.setCellData(sheetName, "Status", 15 , "Fail");
		 }
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expextedText1,"Active");	
	
	}
	
	@Test(priority=13)
	public void VeifyDuplicityPACSConfiguration() throws InterruptedException{
		//test = extent.createTest("VeifyDuplicityPACSConfiguration");
		PACSConfiguration pc = new PACSConfiguration(driver);
		
		pc.ClickonConfiguraion().click();
		Thread.sleep(1000);
		pc.ClickonPacsConfiguraion().click();
		Thread.sleep(3000);
		
		pc.SelectSeason().sendKeys(Season);
		Thread.sleep(2000);
		pc.SelectLocationofPPC().sendKeys(LocationofPPCMY);
		Thread.sleep(2000);
		pc.SelectMarketYard().sendKeys(MarketYard);
		Thread.sleep(2000);
		pc.SelectProcuringAgency().sendKeys(ProcuringAgency);
		Thread.sleep(2000);
		pc.SelectGunnybagspacksuppliedby().sendKeys(GunnyBagsForPackingSuppliedByPACS);
		Thread.sleep(2000);
		pc.ClickOnSubmit().click();
		Thread.sleep(3000);
		pc.ClickOnYesButton().click();
		Thread.sleep(2000);
		
		
		String expextedText1 = pc.GetMessageText().getText();
		
		System.out.println(expextedText1);
		if(expextedText1.equals("You have Already Configured for Selected PPC"))
		 {
			System.out.println("Pass");
			constants.fileone.setCellData(sheetName, "Status", 16 , "Pass");	
			
		 }
		
		 else
		 {
			 System.out.println("Fail");
			 constants.fileone.setCellData(sheetName, "Status", 16 , "Fail");
		 }
	
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expextedText1,"You have Already Configured for Selected PPC");	
		pc.ClickOnClose().click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	

}
