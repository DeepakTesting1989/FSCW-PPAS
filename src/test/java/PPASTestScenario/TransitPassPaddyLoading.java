package PPASTestScenario;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
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

import ObjectRepository.Common;
import ObjectRepository.LoginTest;
import ObjectRepository.PPASConstantsData;
import ObjectRepository.PaddyLoading;
import ObjectRepository.VehicleRegistration;

public class TransitPassPaddyLoading extends Driver implements PPASConstantsData {

	Driver dr = new Driver();
	XSSFWorkbook wb;
	XSSFSheet sht;
	String sheetName = "Result";	
	int rowCount = constants.fileone.getRowCount(sheetName);
	

	 @Test(priority=1)
		public void PaddyLoadingFunctionalityforRedirection() throws InterruptedException{
		//	test = extent.createTest("VerifyStateAddStateConfigurationpage");
			LoginTest lt = new LoginTest();
			lt.PACSlogin();
//			Thread.sleep(3000);
			PaddyLoading pl = new PaddyLoading(driver);
			
			pl.ClickOnTransitPass().click();
			Thread.sleep(2000);
			pl.ClickOnPaddyLoading().click();
			Thread.sleep(2000);
			pl.SelectPPC().sendKeys(PaddyProcurementCenter);
			Thread.sleep(2000);
			pl.SelectSeason().sendKeys(Season);
			Thread.sleep(2000);
			pl.SelectMiller().sendKeys(Miller);
			Thread.sleep(2000);
			pl.ClickOnSearchButton().click();
			Thread.sleep(2000);
			
			
			String expextedText = pl.Getpageheadertext().getText();;
			System.out.println(expextedText);
			if(expextedText.equals("Paddy Loading"))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 31 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 31 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,"Paddy Loading");
			
	 }
	 
	 @Test(priority=2)
		public void VerifyPaddyloadingfunctionality() throws InterruptedException{
		//	test = extent.createTest("VerifyPaddyloadingfunctionality");
			
			PaddyLoading pl = new PaddyLoading(driver);
			
			pl.ClickOnActionButton().click();
			Thread.sleep(2000);
			pl.CheckOnSerialOne().click();
			Thread.sleep(2000);
			
			String expextedText = pl.GetLoadingQuantity().getAttribute("value");
			System.out.println(expextedText);
			if(expextedText.equals("99.00"))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 32 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 32 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,"99.00", "Quantity not Showing proper");
			
			
	 }
			
			
		 @Test(priority=3)
		public void PaddyLoadingWithTotalLoadingQuantityMoreThanVehicleCCapacity() throws InterruptedException{
		//	test = extent.createTest("VerifyPaddyloadingfunctionality");
			
			PaddyLoading pl = new PaddyLoading(driver);
			Common cm = new Common(driver);
//			pl.CheckOnSerialOne().click();
//			Thread.sleep(2000);
			pl.GetLoadingQuantity().sendKeys("2100");
			Thread.sleep(2000);
			pl.BagLoading().click();
			Thread.sleep(2000);
			
			
			
			String expextedText = cm.GetAleartmessage();
			System.out.println(expextedText);
			
			if(expextedText.equals("You Can't Load More Than 99 Quintal"))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 33 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 33 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,"You Can't Load More Than 99 Quintal");
			
			cm.JavaAlertAccept();
	 }
		
		@Test(priority=4)
		public void ViewPaddyLoadingTotalLoadingQuantityMoreThanVendorReceiptQuantity() throws InterruptedException{
		//	test = extent.createTest("VerifyPaddyloadingfunctionality");
			
			PaddyLoading pl = new PaddyLoading(driver);
			Common cm = new Common(driver);
//			pl.CheckOnSerialOne().click();
//			Thread.sleep(2000);
			pl.GetLoadingQuantity().clear();
			pl.GetLoadingQuantity().sendKeys("100");
			Thread.sleep(2000);
			pl.BagLoading().click();
			Thread.sleep(2000);
			
			
			String expextedText = cm.GetAleartmessage();
			System.out.println(expextedText);
			
			if(expextedText.equals("You Can't Load More Than 99 Quintal"))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 34 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 34 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,"You Can't Load More Than 99 Quintal");
			
			cm.JavaAlertAccept();
	 }
		
		@Test(priority=5)
		public void VerifyLoadingBagsNoMoreThanVendorReceiptBags() throws InterruptedException{
			//test = extent.createTest("VerifyPaddyloadingfunctionality");
			
			PaddyLoading pl = new PaddyLoading(driver);
			Common cm = new Common(driver);
//			pl.CheckOnSerialOne().click();
//			Thread.sleep(2000);
			
			pl.BagLoading().sendKeys("11");
			pl.GetLoadingQuantity().click();
			Thread.sleep(2000);
			
			
			String expextedText = cm.GetAleartmessage();
			System.out.println(expextedText);
			
			if(expextedText.equals("You Can't Load more than 10 Bags"))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 35 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 35 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,"You Can't Load more than 10 Bags");
			
			cm.JavaAlertAccept();
	 }
		
		
		@Test(priority=6)
		public void VerifyPPCNotTPMoreThanMillerTarget() throws InterruptedException{
		//	test = extent.createTest("VerifyPaddyloadingfunctionality");
			
			PaddyLoading pl = new PaddyLoading(driver);
			
//			pl.CheckOnSerialOne().click();
//			Thread.sleep(2000);
	
			
			String expextedText = pl.TotalPurchaseQty().getText();
			System.out.println(expextedText);
			
			if(expextedText.equals("99"))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 36 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 36 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,"99", "Quantity exceeded");
			pl.ClickOnYes().click();
			
			
	 }
		
		@Test(priority=7)
		public void VerifyPaddyLoadingFunctionality() throws InterruptedException{
		//	test = extent.createTest("VerifyPaddyloadingfunctionality");
			
			PaddyLoading pl = new PaddyLoading(driver);
			
//			pl.CheckOnSerialOne().click();
//			Thread.sleep(2000);
			pl.ClickOnSubmitButton().click();
			Thread.sleep(2000);
			pl.ClickOnYes().click();
			Thread.sleep(2000);
	
			String expextedText = pl.GetSubmitMessage().getText();
			System.out.println(expextedText);
			
			if(expextedText.equalsIgnoreCase("TP Generated Successfully!!"))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 37 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 37 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,"TP Generated Successfully!! Your TP No Is 5");
			
			pl.Clickonclose();
			Thread.sleep(2000);
	 }
		
		@Test(priority=8)
		public void VeriyViewPaddyLoadingAndConfirm() throws InterruptedException{
		//	test = extent.createTest("VerifyPaddyloadingfunctionality");
			
			PaddyLoading pl = new PaddyLoading(driver);
			
//			pl.CheckOnSerialOne().click();
//			Thread.sleep(2000);
			pl.ClickOnTPTab().click();
			Thread.sleep(2000);
			pl.SelectPPC().sendKeys(PPC);
			Thread.sleep(2000);
			pl.SelectSeason().sendKeys(Season);
			Thread.sleep(2000);
			pl.SelectMiller().sendKeys(Miller);
			Thread.sleep(2000);
			pl.ClickOnSearchButton().click();
			Thread.sleep(2000);
			pl.ClickOnConfirmTP().click();
			Thread.sleep(2000);
			pl.ClickOnTPYes().click();
			Thread.sleep(2000);
			
			String expextedText = pl.GetSubmitMessage().getText();
			System.out.println(expextedText);
			
			if(expextedText.equals("TP Generated Successfully!! Your TP No Is 5"))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 38 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 38 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,"TP Generated Successfully!! Your TP No Is 5");
			
			pl.ClickOnCloseButton().click();
			Thread.sleep(2000);
			
	 }

		
		
		@Test(priority=8)
		public void VerifyDeleteFunctionalityOfTP() throws InterruptedException{
		//	test = extent.createTest("VerifyPaddyloadingfunctionality");
			
			PaddyLoading pl = new PaddyLoading(driver);
			
//			pl.CheckOnSerialOne().click();
//			Thread.sleep(2000);
			pl.ClickOnDeleteBtn().click();
			Thread.sleep(2000);
			pl.ClickOnYes().click();
			Thread.sleep(2000);

			String expextedText = pl.GetDeleteMessage().getText();
			System.out.println(expextedText);
			
			if(expextedText.equals("TP Deleted Successfully"))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 40 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 40 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,"TP Deleted Successfully");
			
			pl.ClickOnCloseButton().click();
			Thread.sleep(2000);
			
	 }
}
