package ObjectRepository;

import org.testng.annotations.Test;

import com.genericlib.Driver;
import com.genericlib.LoginBase;

public class LoginTest extends Driver implements PPASConstantsData{
	
	Driver dr = new Driver();
	
	
	public void Statelogin() throws InterruptedException {
		dr.getDriver();
		LoginBase lb = new LoginBase(driver);
	
		lb.UserName().sendKeys(SUsername);
		lb.PassWord().sendKeys(SPassworde);
		Thread.sleep(12000);
		lb.ClickLogin().click();
		Thread.sleep(4000);
		
	}
	
	
	public void Districtlogin() throws InterruptedException {
		
		LoginBase lb = new LoginBase(driver);
	
		lb.UserName().sendKeys(DUsername);
		lb.PassWord().sendKeys(DPassword);
		Thread.sleep(12000);
		lb.ClickLogin().click();
		Thread.sleep(4000);
	}
	
	
	public void PACSlogin() throws InterruptedException {
		dr.getDriver();
		LoginBase lb = new LoginBase(driver);
	
		lb.UserName().sendKeys(PacsUsername);
		lb.PassWord().sendKeys(PacsPassword);
		Thread.sleep(12000);
		lb.ClickLogin().click();
		Thread.sleep(4000);
		
	}
	
	public void Millerlogin() throws InterruptedException {
		dr.getDriver();
		LoginBase lb = new LoginBase(driver);
	
		lb.UserName().sendKeys(MUsername);
		lb.PassWord().sendKeys(MPassword);
		Thread.sleep(12000);
		lb.ClickLogin().click();
		Thread.sleep(4000);
		
	}

}
