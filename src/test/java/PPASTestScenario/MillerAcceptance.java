package PPASTestScenario;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import ObjectRepository.MillerAcceptanceBase;
import ObjectRepository.PPASConstantsData;
import ObjectRepository.PaddyLoading;

public class MillerAcceptance extends Driver implements PPASConstantsData{

	
	Driver dr = new Driver();
//	static Xls_AllMethods fileone = new Xls_AllMethods("C:\\Users\\root\\eclipse-workspace\\PPAS\\Mapping_Excel_Report_Testcasewise.xlsx");
	XSSFWorkbook wb;
	XSSFSheet sht;
	String sheetName = "Result";	
	int rowCount = constants.fileone.getRowCount(sheetName);
	

	 
	    @Test(priority=1)
				public void AcceptanceOfTransitPass() throws InterruptedException{
				//	test = extent.createTest("VerifyStateAddStateConfigurationpage");
					LoginTest lt = new LoginTest();
					lt.Millerlogin();
//					Thread.sleep(3000);
					MillerAcceptanceBase ma = new MillerAcceptanceBase(driver);
					
					ma.ClickOnMillerTP().click();
					Thread.sleep(2000);
					ma.ClickOnTPAcceptance().click();
					Thread.sleep(2000);
					ma.ClickOnMillerPACS().sendKeys(MPACS);
					Thread.sleep(2000);
					ma.ClickOnMillerPPC().sendKeys(MPPC);
					Thread.sleep(2000);
					ma.ClickOnSearchButton().click();
					Thread.sleep(2000);
					ma.ClickOnAcceptButtom().click();
					Thread.sleep(2000);
					
					
					String expextedText = ma.GetActionText().getText();;
					System.out.println(expextedText);
					if(expextedText.equals("Accepted"))
					 {
						System.out.println("Pass");
						constants.fileone.setCellData(sheetName, "Status", 41 , "Pass");	
						
					 }
					
					 else
					 {
						 System.out.println("Fail");
						 constants.fileone.setCellData(sheetName, "Status", 41 , "Fail");
					 }
					
					SoftAssert softAssert = new SoftAssert();
					softAssert.assertEquals(expextedText,"Accepted");
					
					driver.close();
			 }
	
}
