package PPASTestScenario;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
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

import ObjectRepository.LoginTest;
import ObjectRepository.PACSConfiguration;
import ObjectRepository.PPASConstantsData;
import ObjectRepository.StateConfiguration;
import ObjectRepository.TargetDistributeBase;


public class TargetDistributionProcess extends Driver implements PPASConstantsData {

	
	Driver dr = new Driver();
	XSSFWorkbook wb;
	XSSFSheet sht;
	String sheetName = "Result";	
	int rowCount = constants.fileone.getRowCount(sheetName);
	

	 
	 @Test(priority=1)
		public void RedirectionofViewMillerTarget() throws InterruptedException{
		//	test = extent.createTest("VerifyStateAddStateConfigurationpage");
			LoginTest lt = new LoginTest();
			lt.PACSlogin();
//			Thread.sleep(3000);
			TargetDistributeBase td = new TargetDistributeBase(driver);
			
			td.ClickOntargetDitribution().click();
			Thread.sleep(2000);
			td.ClickOnMillerTarget().click();
			Thread.sleep(2000);
			
			String expextedText = td.GetHeaderMessage().getText();
			String actualText ="View MIller Targe";
			System.out.println(expextedText);
			if(expextedText.equals("View MIller Target"))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 17 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 17 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,actualText);	
			
		}
	 
	 
	 @Test(priority=2)
		public void MillerTargetDistributionFunctionality() throws InterruptedException{
		//	test = extent.createTest("VerifyStateAddStateConfigurationpage");
			
			TargetDistributeBase td = new TargetDistributeBase(driver);
			
			td.ClickOnActionButton().click();
			Thread.sleep(2000);
			td.EnterTargetForFirstSerialNumber().clear();
			Thread.sleep(2000);
			td.EnterTargetForFirstSerialNumber().sendKeys(TargetForSecondSerialNumber);
			Thread.sleep(2000);
			td.ClickOnSubmitButton().click();
			Thread.sleep(2000);
			td.ClickOnYesButton().click();
			Thread.sleep(2000);
			
			String expextedText = td.GetMessageText().getText();
			String actualText ="Target Distributed Successfully.";
			System.out.println(expextedText);
			if(expextedText.equals("Target Distributed Successfully."))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 18 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 18 , "Fail");
			 }
//			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,actualText);	
			
			td.ClickOnClose().click();
			Thread.sleep(2000);
			
		}
	 
	 @Test(priority=3)
		public void VerifyTargetMillerQuantity() throws InterruptedException{
			//test = extent.createTest("VerifyStateAddStateConfigurationpage");
			
			TargetDistributeBase td = new TargetDistributeBase(driver);
			
			td.ClickOnActionButton().click();
			Thread.sleep(2000);
			td.EnterTargetForFirstSerialNumber().clear();
			Thread.sleep(2000);
			td.EnterTargetForFirstSerialNumber().sendKeys("6500");
			Thread.sleep(2000);
			td.ClickOnSubmitButton().click();
			Thread.sleep(3000);
						
			String expextedText = td.GetExceededMessageError().getText();
			String actualText = "Target Distributed Quantity can't be greater than total alloted quantity.";
			System.out.println(expextedText);
			
			if(expextedText.equals(actualText))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 19 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 19 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,actualText);	
			
			td.ClickOnSecondClose().click();
			Thread.sleep(3000);
			
			driver.close();
		}
	 
}
