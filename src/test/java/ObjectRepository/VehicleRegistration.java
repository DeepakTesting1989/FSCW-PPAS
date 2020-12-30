package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VehicleRegistration {
	
WebDriver driver;
	
	public VehicleRegistration (WebDriver driver) {
		
		this.driver = driver;
	}
	
	By TP = By.xpath("//span[contains(text(),'Transit Pass')]");
	By VR = By.xpath("//a[contains(text(),'Vehicle Registration')]");
	By PPC = By.id("intPpcId");
	By season = By.id("pacsConfigId");
	By miller = By.id("millerId");
	By vehicleRegNo = By.id("vehicleRegNo");
	By driverName = By.id("driverName");
	By CarryingCapacity = By.id("vehicleCarryingCapacity");
	By MobileNo = By.id("mobileNo");
	By SubmitButton = By.id("savebtnId");
	By getMessageText = By.id("messageIdSpan");
	By closePopup = By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/button");
	By Yes = By.xpath("//*[@id='myModal3']/div/div/div[2]/button[1]");
	By Close = By.xpath("//div[@id='myModal']//button[@class='btn btn-danger'][contains(text(),'Close')]");
	By ViewButton = By.xpath("//*[@id=\"main\"]/div[3]/div/div/div[2]/div/div[1]/ul/li[2]/a");
	By searchButton = By.xpath("//*[@id=\"View\"]/div/div[3]/div/center/button");
	By verifyVehicleNumber = By.xpath("//td[contains(text(),'OR17W1212')]");
	By getAdded= By.xpath("//tbody/tr[1]/td[3]");
	By closebutton = By.xpath("//*[@id='myModal']/div/div/div[2]/button");
	
	public WebElement Closebutton () {
		
		return driver.findElement(closebutton);
	}

	public WebElement GetAddedPPC () {
		
		return driver.findElement(getAdded);
	}
	
	public WebElement GetVehicleNumber() {
		
		return driver.findElement(verifyVehicleNumber);
	}
	
	public WebElement GetMessageText() {
		
		return driver.findElement(getMessageText);
	}
	
	public WebElement ClickOnClose() {
		
		return driver.findElement(Close);
	}
	
	public WebElement ClickOnYesButton() {
		
		return driver.findElement(Yes);

	}
	
	public WebElement SelectTransitPass() {
		
		return driver.findElement(TP);
		
	}
	public WebElement SelectVehicleRegistration() {
		
		return driver.findElement(VR);
		
	}	
	public WebElement SelectPPC() {
		
		return driver.findElement(PPC);
		
	}
	
	public WebElement SelectSeason() {
		
		return driver.findElement(season);
		
	}	
	
	public WebElement SelectMiller() {
		
		return driver.findElement(miller);
		
	}	
	
	public WebElement EnterVehicleRegNo() {
		
		return driver.findElement(vehicleRegNo);
		
	}
	
	public WebElement EnterDriverName() {
		
		return driver.findElement(driverName);
		
	}
	
	public WebElement EnterCarryingCapacity() {
		
		return driver.findElement(CarryingCapacity);
		
	}
	
	public WebElement EnterMobileNo() {
		
		return driver.findElement(MobileNo);
		
	}	

	public WebElement ClickOnSubmitButton() {
		
		return driver.findElement(SubmitButton);
		
	}	
	
	public WebElement ClickOnViewButton() {
		
		return driver.findElement(ViewButton);
		
	}	
	
	public WebElement ClickOnSearchButton() {
		
		return driver.findElement(searchButton);
		
	}
	
	
}
