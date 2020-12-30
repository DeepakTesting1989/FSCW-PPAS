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
import ObjectRepository.PPASConstantsData;
import ObjectRepository.TargetDistributeBase;
import ObjectRepository.VehicleRegistration;

public class TrasitPassVehicleRegistration extends Driver implements PPASConstantsData {

	
	Driver dr = new Driver();
	XSSFWorkbook wb;
	XSSFSheet sht;
	String sheetName = "Result";	
	int rowCount = constants.fileone.getRowCount(sheetName);
	
	 
	 
	    @Test(priority=1)
				public void AddVehicleRegistrationforTransitPass() throws InterruptedException{
				//	test = extent.createTest("VerifyStateAddStateConfigurationpage");
					LoginTest lt = new LoginTest();
					lt.PACSlogin();
//					Thread.sleep(3000);
					VehicleRegistration vr = new VehicleRegistration(driver);
					
					vr.SelectTransitPass().click();
					Thread.sleep(2000);
					vr.SelectVehicleRegistration().click();
					Thread.sleep(2000);
					vr.SelectPPC().sendKeys(PaddyProcurementCenter);
					Thread.sleep(2000);
					vr.SelectSeason().sendKeys(SeasonforVR);
					Thread.sleep(2000);
					vr.SelectMiller().sendKeys("M/S SHERAWALI RICE MILLS PVT. LTD.(M060201)");
					Thread.sleep(2000);
					vr.EnterVehicleRegNo().sendKeys(VehicleNo);
					Thread.sleep(2000);
					vr.EnterDriverName().sendKeys(DriverName);
					Thread.sleep(2000);
					vr.EnterCarryingCapacity().sendKeys(CarryingCapacity);
					Thread.sleep(2000);
					vr.EnterMobileNo().sendKeys(MobileNo);
					Thread.sleep(2000);
					vr.ClickOnSubmitButton().click();
					Thread.sleep(2000);
					vr.ClickOnYesButton().click();
					Thread.sleep(2000);
		
					String expextedText = vr.GetMessageText().getText();
					System.out.println(expextedText);
					if(expextedText.equals("Vehicle Added Successfully."))
					 {
						System.out.println("Pass");
						constants.fileone.setCellData(sheetName, "Status", 28 , "Pass");	
						
					 }
					
					 else
					 {
						 System.out.println("Fail");
						 constants.fileone.setCellData(sheetName, "Status", 28 , "Fail");
					 }
					
					SoftAssert softAssert = new SoftAssert();
					softAssert.assertEquals(expextedText,"Vehicle Added Successfully.");
					vr.Closebutton().click();
					Thread.sleep(2000);
				}
	    
	    @Test(priority=2)
		public void VerifyDuplicateVehicleRegistration() throws InterruptedException{
		//	test = extent.createTest("VerifyDuplicateVehicleRegistration");
			
			
			VehicleRegistration vr = new VehicleRegistration(driver);
			
			vr.SelectTransitPass().click();
			Thread.sleep(2000);
			vr.SelectVehicleRegistration().click();
			Thread.sleep(2000);
			vr.SelectPPC().sendKeys(PaddyProcurementCenter);
			Thread.sleep(2000);
			vr.SelectSeason().sendKeys(SeasonforVR);
			Thread.sleep(2000);
			vr.SelectMiller().sendKeys(Miller);
			Thread.sleep(2000);
			vr.EnterVehicleRegNo().sendKeys("OD12H1123");
			Thread.sleep(2000);
			vr.EnterDriverName().sendKeys(DriverName);
			Thread.sleep(2000);
			vr.EnterCarryingCapacity().sendKeys(CarryingCapacity);
			Thread.sleep(2000);
			vr.EnterMobileNo().sendKeys(MobileNo);
			Thread.sleep(2000);
			vr.ClickOnSubmitButton().click();
			Thread.sleep(2000);
			vr.ClickOnYesButton().click();
			Thread.sleep(2000);

			String expextedText = vr.GetMessageText().getText();
			System.out.println(expextedText);
			if(expextedText.equals("Vehicle already exist."))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 29 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 29 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(expextedText,"Vehicle already exist.");
			
			vr.Closebutton().click();
			Thread.sleep(2000);
			
		}
		
		@Test(priority=3)
		public void VerifyViewVehicleRegistration() throws InterruptedException{
			//test = extent.createTest("VerifyViewVehicleRegistration");
			
//			Thread.sleep(3000);
			
			VehicleRegistration vr = new VehicleRegistration(driver);
			
			vr.SelectTransitPass().click();
			Thread.sleep(2000);
			vr.SelectVehicleRegistration().click();
			Thread.sleep(2000);
			vr.ClickOnViewButton().click();
			Thread.sleep(2000);
			vr.ClickOnSearchButton().click();
			
			String ppc= vr.GetAddedPPC().getText();
			
			System.out.println(ppc);
			if(ppc.equals("BAGHIAPADA(S1060101)"))
			 {
				System.out.println("Pass");
				constants.fileone.setCellData(sheetName, "Status", 30 , "Pass");	
				
			 }
			
			 else
			 {
				 System.out.println("Fail");
				 constants.fileone.setCellData(sheetName, "Status", 30 , "Fail");
			 }
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(ppc,"BAGHIAPADA(S1060101)");
			
			driver.close();
		}
			
}
