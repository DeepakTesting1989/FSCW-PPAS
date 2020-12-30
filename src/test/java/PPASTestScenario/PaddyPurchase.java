package PPASTestScenario;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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

import ObjectRepository.LoginTest;
import ObjectRepository.PPASConstantsData;
import ObjectRepository.PaddyLoading;
import ObjectRepository.PurchaseBase;

public class PaddyPurchase extends Driver implements PPASConstantsData {
	
	
	Driver dr = new Driver();
	XSSFWorkbook wb;
	XSSFSheet sht;
	String sheetName = "Result";	
	int rowCount = constants.fileone.getRowCount(sheetName);

	 
	 @Test(priority=1)
		public void VerifyAddPaddyPurchase() throws InterruptedException{
			//test = extent.createTest("VerifyStateAddStateConfigurationpage");
			LoginTest lt = new LoginTest();
			lt.PACSlogin();
//			Thread.sleep(3000);
			PurchaseBase pb = new PurchaseBase(driver);
			
			pb.ClickOnPurchase().click();
			Thread.sleep(2000);
			pb.ClickOnPaddyPurchase().click();
			Thread.sleep(2000);
			pb.SelectPPC().sendKeys(PPC);
			Thread.sleep(2000);
			
			pb.SelectPendingTokenForPurchase().sendKeys("Token-120 (Qty-121.11 Qtl.)");
			Thread.sleep(4000);
			
			
			
			String expextedText = pb.GetTokenText().getText();
			System.out.println(expextedText);
			if(expextedText.equals("Token-111 (Qty-84.76 Qtl.)"))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 20 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 20 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,"Token-120 (Qty-121.11 Qtl.)");
			
			
	 }
	 
	 @Test(priority=2)
		public void ValidateTestdateshouldnotmorethenCurrentdate() throws InterruptedException{
			//test = extent.createTest("VerifyStateAddStateConfigurationpage");
////			LoginTest lt = new LoginTest();
////			lt.PACSlogin();
////			Thread.sleep(3000);
			PurchaseBase pb = new PurchaseBase(driver);
			
		
			Select sl1 = new Select(pb.SelectSourceOfPackingMaterial());
			sl1.selectByVisibleText(SourceOfPackingMaterial);
			
			Thread.sleep(2000);
			pb.EnterTestNo().sendKeys(TestNo);
			Thread.sleep(3000);

			((JavascriptExecutor) driver).executeScript("document.getElementsByName('paddyTestDate')[0].removeAttribute('readonly');");
		    WebElement dateFld = pb.SelectTestDate();
		    //dateFld.clear();
		    
		    dateFld.clear();
		    Thread.sleep(2000);
		    dateFld.sendKeys("28-Dec-2020");
			//pb.SelectTestDate().sendKeys(TestDate);
			Thread.sleep(2000);
	 
			pb.EnterSampleNo().sendKeys(SampleNo);
			Thread.sleep(2000);
			Select sl3 = new Select(pb.SelectPaddyType());
			sl3.selectByVisibleText(PaddyType);
			Thread.sleep(2000);
			pb.EnterRemarks().sendKeys(Remark);
			Thread.sleep(2000);
			Select sl4 = new Select(pb.SelectQualityType());
			sl4.selectByVisibleText(QualityType);
			//pb.SelectPaddyType().sendKeys(QualityType);
			Thread.sleep(2000);
			pb.EnterInorganicForeignMatterRating().sendKeys("1");
			Thread.sleep(800);
			pb.EnterOrganicForeignMatterRating().sendKeys("2");
			Thread.sleep(800);
			pb.EnterAdmixtureofLowerClassRating().sendKeys("3");
			Thread.sleep(800);
			pb.EnterDamagedDiscolouredSproutedWeeviledRating().sendKeys("4");
			Thread.sleep(800);
			pb.EnterImmaturShrunkenShrivelled().sendKeys("5");
			Thread.sleep(800);
			pb.EnterMoistureContent().sendKeys("6");
			Thread.sleep(800);
			pb.EnterGreygrain().sendKeys("3");
			Thread.sleep(800);
			pb.EnterNoOfBag().sendKeys("5");
			Thread.sleep(800);
			pb.EnterGrossWeight().sendKeys("30");
			Thread.sleep(800);
			pb.EnterpaddyPackingMaterial().sendKeys("3");
			Thread.sleep(800);
			pb.ClickOnSubmit().click();
			Thread.sleep(2000);
			
			String expextedText = pb.GetSubmissionMessage().getText();
			System.out.println(expextedText);
			if(expextedText.equals("Test Date Should Not Be Previous Schedule Date."))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 22 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 22 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,"Test Date Should Not Be Previous Schedule Date.");

			pb.ClickOnClose().click();
			Thread.sleep(2000);
	 }
	 
	 
	 @Test(priority=3)
		public void PaddyLoadingFunctionalityforRedirection() throws InterruptedException{
			//test = extent.createTest("ValidateTestdateshouldnotmorethenCurrentdate");

			PurchaseBase pb = new PurchaseBase(driver);
			
			

			((JavascriptExecutor) driver).executeScript("document.getElementsByName('paddyTestDate')[0].removeAttribute('readonly');");
		    WebElement dateFld = driver.findElement(By.id("paddyTestDate"));
		    //dateFld.clear();
		    dateFld.clear();
		    Thread.sleep(2000);
		    dateFld.sendKeys("30-Dec-2020");
			
			Thread.sleep(2000);
			
			pb.ClickOnSubmit().click();
			Thread.sleep(2000);
			
			String expextedText = pb.GetSubmissionMessage().getText();
			System.out.println(expextedText);
			if(expextedText.equalsIgnoreCase("Vendor Receipt Generated Successfully,Your No is "))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 21 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 21 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,"Vendor Receipt Generated Successfully,Your No is ");
			
			pb.ClickOnClose().click();
			Thread.sleep(2000);
	 
	 }
	 
	 @Test(priority=4)
		public void ValidateGrossWeightnotmorethanTokenshedulequantity() throws InterruptedException{
			//test = extent.createTest("ValidateGrossWeightnotmorethanTokenshedulequantity");

			PurchaseBase pb = new PurchaseBase(driver);

			pb.SelectPPC().sendKeys("BAGHIAPADA(S1060101)");
			Thread.sleep(2000);
			
			pb.SelectPendingTokenForPurchase().sendKeys("Token-119 (Qty-111.42 Qtl.)");
			Thread.sleep(2000);
			pb.SelectSourceOfPackingMaterial().sendKeys(SourceOfPackingMaterial);
			Thread.sleep(2000);
			Select sl1 = new Select(pb.SelectSourceOfPackingMaterial());
			sl1.selectByVisibleText(SourceOfPackingMaterial);
			
			Thread.sleep(2000);
			pb.EnterTestNo().sendKeys(TestNo);
			Thread.sleep(3000);

			((JavascriptExecutor) driver).executeScript("document.getElementsByName('paddyTestDate')[0].removeAttribute('readonly');");
		    WebElement dateFld = driver.findElement(By.id("paddyTestDate"));
		    //dateFld.clear();
		    dateFld.sendKeys("30-Dec-2020");
			
			Thread.sleep(2000);
			pb.EnterSampleNo().sendKeys(SampleNo);
			Thread.sleep(2000);
			Select sl3 = new Select(pb.SelectPaddyType());
			sl3.selectByVisibleText(PaddyType);
			Thread.sleep(2000);
			pb.EnterRemarks().sendKeys(Remark);
			Thread.sleep(2000);
			Select sl4 = new Select(pb.SelectQualityType());
			sl4.selectByVisibleText(QualityType);
			//pb.SelectPaddyType().sendKeys(QualityType);
			Thread.sleep(2000);
			pb.EnterInorganicForeignMatterRating().sendKeys("1");
			Thread.sleep(2000);
			pb.EnterOrganicForeignMatterRating().sendKeys("2");
			Thread.sleep(2000);
			pb.EnterAdmixtureofLowerClassRating().sendKeys("3");
			Thread.sleep(2000);
			pb.EnterDamagedDiscolouredSproutedWeeviledRating().sendKeys("4");
			Thread.sleep(2000);
			pb.EnterImmaturShrunkenShrivelled().sendKeys("5");
			Thread.sleep(2000);
			pb.EnterMoistureContent().sendKeys("6");
			Thread.sleep(2000);
			pb.EnterGreygrain().sendKeys("3");
			Thread.sleep(800);
			pb.EnterNoOfBag().sendKeys("5");
			Thread.sleep(2000);
			pb.EnterGrossWeight().sendKeys("120");
			Thread.sleep(2000);
			pb.EnterpaddyPackingMaterial().sendKeys("3");
			Thread.sleep(2000);
			pb.ClickOnSubmit().click();
			Thread.sleep(2000);
			
			//Farmer Cannot Sale More than Scheduled Qty.
			String expextedText = pb.GetSubmissionMessage().getText();
			System.out.println(expextedText);
			if(expextedText.equals("Farmer Cannot Sale More than Scheduled Qty."))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 23 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 23 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,"Farmer Cannot Sale More than Scheduled Qty.");
			
			pb.ClickOnClose().click();
			Thread.sleep(2000);
	 }
	 
	 
	 @Test(priority=5)
		public void PurchaseMandatorinessOfParameterResults() throws InterruptedException{
			//test = extent.createTest("PurchaseMandatorinessOfParameterResults");

			PurchaseBase pb = new PurchaseBase(driver);
			
			pb.SelectPPC().sendKeys("BAGHIAPADA(S1060101)");
			Thread.sleep(2000);
			
			pb.SelectPendingTokenForPurchase().sendKeys(PendingTokenForPurchase);
			Thread.sleep(2000);
			
			pb.SelectSourceOfPackingMaterial().sendKeys(SourceOfPackingMaterial);
			Thread.sleep(2000);
			Select sl1 = new Select(pb.SelectSourceOfPackingMaterial());
			sl1.selectByVisibleText(SourceOfPackingMaterial);
			
			Thread.sleep(2000);
			
			pb.EnterTestNo().sendKeys(TestNo);
			Thread.sleep(3000);
			
			((JavascriptExecutor) driver).executeScript("document.getElementsByName('paddyTestDate')[0].removeAttribute('readonly');");
		    WebElement dateFld = driver.findElement(By.id("paddyTestDate"));
		    //dateFld.clear();
		    dateFld.sendKeys("30-Dec-2020");
		    Thread.sleep(2000);
			
			

		
			
			Thread.sleep(2000);
			pb.EnterSampleNo().sendKeys(SampleNo);
			Thread.sleep(2000);
			Select sl3 = new Select(pb.SelectPaddyType());
			sl3.selectByVisibleText(PaddyType);
			Thread.sleep(2000);
			pb.EnterRemarks().sendKeys(Remark);
			Thread.sleep(2000);
			Select sl4 = new Select(pb.SelectQualityType());
			sl4.selectByVisibleText(QualityType);
			//pb.SelectPaddyType().sendKeys(QualityType);
			Thread.sleep(2000);
			pb.EnterInorganicForeignMatterRating().sendKeys("1");
			Thread.sleep(2000);
			pb.ClickOnSubmit().click();
			Thread.sleep(2000);
			
			String expextedText = pb.GetgetMandatoryMessage().getText();
			System.out.println(expextedText);
			if(expextedText.equals("Please Enter All Quality Parameter Values."))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 24 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 24 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,"Please Enter All Quality Parameter Values.");
			
			pb.ClickOnClose().click();
			Thread.sleep(2000);
			
	 }
			 

	 @Test(priority=6)
		public void PurchaseWithPreviousScheduleDate() throws InterruptedException{
		//	test = extent.createTest("PurchaseWithPreviousScheduleDate");

			PurchaseBase pb = new PurchaseBase(driver);
		
			pb.SelectPPC().sendKeys("BAGHIAPADA(S1060101)");
			Thread.sleep(2000);
			
			pb.SelectPendingTokenForPurchase().sendKeys(PendingTokenForPurchase);
			Thread.sleep(2000);
			pb.SelectSourceOfPackingMaterial().sendKeys(SourceOfPackingMaterial);
			Thread.sleep(2000);
			Select sl1 = new Select(pb.SelectSourceOfPackingMaterial());
			sl1.selectByVisibleText(SourceOfPackingMaterial);
			
			Thread.sleep(2000);
			pb.EnterTestNo().sendKeys(TestNo);
			Thread.sleep(3000);

			((JavascriptExecutor) driver).executeScript("document.getElementsByName('paddyTestDate')[0].removeAttribute('readonly');");
		    WebElement dateFld = driver.findElement(By.id("paddyTestDate"));
		    //dateFld.clear();
		    dateFld.sendKeys("02-10-2020");
			Thread.sleep(2000);
			
			pb.ClickOnSubmit().click();
			Thread.sleep(2000);
			
			String expextedText = pb.GetSubmissionMessage().getText();
			System.out.println(expextedText);
			if(expextedText.equals("Test Date Should Not Be Previous Schedule Date."))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 25 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 25 , "Fail");
				
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,"Test Date Should Not Be Previous Schedule Date.");
			
			pb.ClickOnClose().click();
			Thread.sleep(2000);
			
	 }
		
	@Test(priority=7)
		public void VerifyAddedPaddyPurchaseDetailsInViewTab() throws InterruptedException{
		//	test = extent.createTest("VerifyAddedPaddyPurchaseDetailsInViewTab");

			PurchaseBase pb = new PurchaseBase(driver);
			pb.ClickOnView().click();
			Thread.sleep(2000);
			pb.SelectPPC().sendKeys("BAGHIAPADA(S1060101)");
			Thread.sleep(2000);
			pb.ClickOnSearch().click();
			Thread.sleep(2000);
			
			String expextedText = pb.GetFarmerCode().getText();
			String Actual = pb.GetFarmerCodeInPurchase().getText();
			System.out.println(expextedText);
			System.out.println(Actual);
			if(expextedText.equals(Actual))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 26 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 26 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,Actual);
			driver.close();
	 }

//	@Test(priority=8)
//	public void ValidatePurchasedatainPrintScreen() throws InterruptedException{
//		test = extent.createTest("ValidatePurchasedatainPrintScreen");
//
//		PurchaseBase pb = new PurchaseBase(driver);
//		
//	}
	
}
