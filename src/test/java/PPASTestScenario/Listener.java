package PPASTestScenario;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.log4testng.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.genericlib.Xls_AllMethods;



public class Listener extends BaseExtentReport implements ITestListener {
	int rowNum;
	ExtentReports extent = BaseExtentReport.extentReportSetUp();
	//WebDriver driver;
	//	static Xls_AllMethods fileone = new Xls_AllMethods("C:\\Users\\root\\eclipse-workspace\\PPAS\\Mapping_Excel_Report_Testcasewise.xlsx");
	//	String sheetName = "Result";	
	//	int rowCount = fileone.getRowCount("Result");
	//Logger logs;
	
	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		extent.flush();
	}
	
	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	//	logs.error(result.getMethod().getMethodName()+ " " + "test has been failed");
		test.log(Status.FAIL, "Test Case IS FAILED");
			test.fail(result.getThrowable());
		   
		   // to add error/exception in extent report
//		   for(rowNum=2; rowNum<=rowCount; rowNum++ ) {
//			   
//				fileone.setCellData("Result", "Status", rowNum, "Fail");
//				
//		   }
		
		
	}
	
	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		test.log(Status.SKIP, "Test Case IS SKIPPED");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = extent.createTest(result.getMethod().getMethodName());
	}
	  
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//logs.info(result.getMethod().getMethodName()+ " " + "test has been Passed" );
		test.log(Status.PASS, "Test Case IS PASSED");
		
//		for(rowNum=2; rowNum<=rowCount; rowNum++ ) {
//		fileone.setCellData("Result", "Status", rowNum, "Pass");
//		
//		
//		}
	}
	
/*	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		extent.flush();
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		test.log(Status.FAIL, "Test Case IS FAILED");
			test.fail(result.getThrowable());
		   
		   // to add error/exception in extent report
		   for(rowNum=2; rowNum<=rowCount; rowNum++ ) {
		   fileone.setCellData("Result", "Status", rowNum, "Fail");
		   }
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		test.log(Status.PASS, "Test Case IS PASSED");
		
		for(rowNum=2; rowNum<=rowCount; rowNum++ ) {
		fileone.setCellData("Result", "Status", rowNum, "Pass");
		}
	} */
	
	

}
