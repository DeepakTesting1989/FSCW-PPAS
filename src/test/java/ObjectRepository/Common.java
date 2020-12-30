package ObjectRepository;

import org.openqa.selenium.WebDriver;

public class Common {
	
	WebDriver driver;
	
	public Common(WebDriver driver){
		
		driver=this.driver;
	}
	
	
	public String GetAleartmessage() {
		String msg = driver.switchTo().alert().getText();
		return msg;
	}

	public void JavaAlertDismiss() {
		driver.switchTo().alert().dismiss();
	}

	public void JavaAlertAccept() {
		driver.switchTo().alert().accept();
	}
	

}
