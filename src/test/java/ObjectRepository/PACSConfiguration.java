package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PACSConfiguration {

	WebDriver driver;
	
	public PACSConfiguration(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By Config = By.xpath("//span[contains(text(),'Configuration')]");
	By PacsConfig = By.xpath("//a[contains(text(),'PACS Configuration')]");
	By getPACSText = By.xpath("//*[@id='main']/div[3]/div/div/div[1]/div/div/h");
	By season = By.id("intDistrictConfigurationId");
	By ppc = By.id("locationPpcId");
	By marketYard = By.id("marketYardSelId");
	By gunnyBag = By.id("intGunnyBagSuppliedBy");
	By ProcuringAgency = By.id("intAgencyId");
	By submitBtn = By.id("savebtnId");//*[@id="main"]/div[3]/div/div/div[2]/div/div[1]/ul/li[2]/a
	By viewBtn = By.xpath("//*[@id='main']/div[3]/div/div/div[2]/div/div[1]/ul/li[2]/a");
	By seasonIcon = By.xpath("//*[@id='viewPacsTableId']/tbody/tr[1]/td[8]");
	By seasonCloseButton = By.id("btnSelect");
	By Yes = By.id("yes");
	By messageID = By.id("messageIdSpan");
	By Close = By.xpath("//*[@id='myModal']/div/div/div[2]/button");
	By getSeasonText = By.xpath("//td[contains(text(),'Season Closed')]");
	By verifyAddedPACS = By.xpath("//tbody/tr[1]/td[7]");
	By getStatus = By.xpath("//tbody/tr[2]/td[7]");
	
	public WebElement ClickonConfiguraion () {
		
		return driver.findElement(Config);
	}
	public WebElement ClickonPacsConfiguraion () {
		
		return driver.findElement(PacsConfig);
	}
	public WebElement GetPACConfigText () {
		
		return driver.findElement(getPACSText);
	}
	public WebElement SelectSeason () {
		
		return driver.findElement(season);
	}
	public WebElement SelectLocationofPPC () {
		
		return driver.findElement(ppc);
	}
	public WebElement SelectMarketYard () {
		
		return driver.findElement(marketYard);
	}
	public WebElement SelectProcuringAgency() {
		
		return driver.findElement(ProcuringAgency);
	}
	public WebElement SelectGunnybagspacksuppliedby() {
		
		return driver.findElement(gunnyBag);
	}	
	public WebElement ClickOnSubmit() {
		
		return driver.findElement(submitBtn);
	}	
	public WebElement ClickOnView() {
		
		return driver.findElement(viewBtn);
	}	
	public WebElement ClickOnSeasonIcon() {
		
		return driver.findElement(seasonIcon);
	}
	public WebElement ClickOnSeasonCloseButton() {
		
		return driver.findElement(seasonCloseButton);
	}
	public WebElement ClickOnYesButton() {
		
		return driver.findElement(Yes);
	}
	public WebElement GetMessageText() {
		
	return driver.findElement(messageID);
	}
		
	public WebElement ClickOnClose() {
			
	return driver.findElement(Close);
	}
	public WebElement GetSeasonText() {
		
	return driver.findElement(getSeasonText);
	}
	public WebElement GetRecentConfiguredStatus() {
		
	return driver.findElement(verifyAddedPACS);
	}
	public WebElement GetStatusAfterSeasonClosed() {
		
	return driver.findElement(getStatus);
	}
	
}

