package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TargetDistributeBase {
	
	WebDriver driver;
	
	public TargetDistributeBase (WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	By targetDitribution = By.xpath("//span[contains(text(),'Target Distribution')]");
	By millerTarget = By.xpath("//a[contains(text(),'Miller Target')]");
	By verifyHeaderMessage = By.xpath("//*[@id='main']/div[3]/div/div/div[1]/div/div/h");
	By actionBtn = By.xpath("//tr[1]//td[5]//a[1]");
	By firstSerialNumber = By.id("distributedQty1");
	By secondSerialNumber = By.id("distributedQty2");
	By submitBtn = By.xpath("//*[@id=\"MPPASMasBean\"]/center/button[1]");
	By cancelBtn = By.xpath("//button[contains(text(),'Cancel')]");
	By getMessageText = By.id("messageIdSpan");
	By closePopup = By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/button");
	By Yes = By.id("yes");
	By messageID = By.id("messageIdSpan");
//	By Close = By.xpath("//*[@id='myModal']/div/div/div[2]/button");
	By CloseTwo = By.xpath("//*[@id='myModal2']/div/div/div[2]/button");
	By getExceededMessageText = By.id("messageClientIdSpan");
	
	public WebElement ClickOntargetDitribution() {
		
		return driver.findElement(targetDitribution);
	}
	
	public WebElement ClickOnMillerTarget() {
		
		return driver.findElement(millerTarget);
	}
	
	public WebElement GetHeaderMessage(){
		
		return driver.findElement(verifyHeaderMessage);
	}
	
	public WebElement ClickOnActionButton() {
		
		return driver.findElement(actionBtn);
	}
	
	public WebElement EnterTargetForFirstSerialNumber() {
		
		return driver.findElement(firstSerialNumber);
	}
	
	public WebElement EnterTargetForSecondSerialNumber() {
		
		return driver.findElement(secondSerialNumber);
	}
	
	public WebElement ClickOnSubmitButton() {
		
		return driver.findElement(submitBtn);
	}
	
	public WebElement ClickOnCancelButton() {
		
		return driver.findElement(submitBtn);
	}
	
	public WebElement GetMessageText() {
		
		return driver.findElement(getMessageText);
	}
	
	public WebElement ClickOnClose() {
		
		return driver.findElement(closePopup);
	}
	
	public WebElement ClickOnSecondClose() {
		
		return driver.findElement(CloseTwo);
	}

	public WebElement ClickOnYesButton() {
		
		return driver.findElement(Yes);

	}
	
	public WebElement GetExceededMessageError() {
		
		return driver.findElement(getExceededMessageText);

	}


}
