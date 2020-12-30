package PPASTestScenario;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.genericlib.constants;

public class BaseExtentReport {

	
	public static ExtentHtmlReporter htmlReporter;
	//public static ExtentSparkReporter reporter;
	public static ExtentReports extent;
	public static  ExtentTest test;
	WebDriver driver;
	 
	
	
	public static ExtentReports extentReportSetUp() {
		

		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/ValidationExtentReport/VerifyValidation-Report.html");
		htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/extentreportconfig.xml"));
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		
		htmlReporter.config().setDocumentTitle("FSCW Test Report"); 
		htmlReporter.config().setReportName("Functional Test"); 
		
		htmlReporter.config().setTheme(Theme.DARK);
		  
		extent.setSystemInfo("Host name", "Test Server");
		extent.setSystemInfo("Environment", "QC");
		
		return extent;
	}
	
//	 @AfterMethod
//	    public void tearDown(ITestResult result) throws IOException {
//			  if (result.getStatus() == ITestResult.FAILURE) {
//			   test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
//			   test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent report
//			   //String screenshotPath = Testc.getScreenshot(driver, result.getName());
//			  //s test.addScreenCaptureFromPath(screenshotPath);// adding screen shot
//			  } else if (result.getStatus() == ITestResult.SKIP) {
//			   test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
//			  }
//			  else if (result.getStatus() == ITestResult.SUCCESS) {
//			   test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
//			  }
//				
//			  extent.flush();
//			 
//			 }
	     

	
	@AfterClass
	public void finishExtentReport() {
		
		driver.close();
	}
	
	

	public void getScreenShots(String testCaseName){

		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+ "\\SSReport\\" + testCaseName + ".png";
		try {
			FileUtils.copyFile(source, new File(destinationFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
