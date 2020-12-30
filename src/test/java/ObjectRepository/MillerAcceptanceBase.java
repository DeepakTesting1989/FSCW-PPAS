package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MillerAcceptanceBase {
	
	WebDriver driver;

		public MillerAcceptanceBase (WebDriver driver) {
	
		this.driver = driver;
	}

		
		By MillerTP = By.xpath("//span[contains(text(),'Transit Pass')]");
		By TPAcceptance = By.xpath("//a[contains(text(),'TP Acceptance')]");
		By MPACS = By.id("pacsId");
		By MPPC = By.id("ppcId");
		By season = By.id("season");
		By searchBtn = By.xpath("//*[@id='View']/div/div[3]/div/center/button");
		By acceptBtn = By.xpath("//*[@id='viewPacsTableId']/tbody/tr[2]/td[13]/a");
		By Yes = By.id("yes");
		By No = By.xpath("//button[contains(text(),'No')]");
		By CloseButton = By.xpath("//*[@id=\"myModalMessage\"]/div/div/div[2]/button");
		By getSubmitMessage = By.id("messageIdSpan");
		By getActionText = By.xpath("//tbody/tr[1]/td[13]");
		
		public WebElement ClickOnYes() {
			
			return driver.findElement(Yes);	
		}
		
		public WebElement ClickOnCloseButton() {
			
			return driver.findElement(CloseButton);	
		}
		
		public WebElement ClickOnMillerTP() {
			
			return driver.findElement(MillerTP);	
		}
		
		public WebElement ClickOnTPAcceptance() {
			
			return driver.findElement(TPAcceptance);	
		}
		
		public WebElement ClickOnMillerPACS() {
			
			return driver.findElement(MPACS);	
		}
		
		public WebElement ClickOnMillerPPC() {
			
			return driver.findElement(MPPC);	
		}
		
		public WebElement ClickOnSeason() {
			
			return driver.findElement(season);	
		}
		
		public WebElement ClickOnSearchButton() {
			
			return driver.findElement(searchBtn);	
		}
		
		public WebElement ClickOnAcceptButtom() {
			
			return driver.findElement(acceptBtn);	
		}
		
		public WebElement GetSubmitMessage() {
			
			return driver.findElement(getSubmitMessage);	
		}
		
		public WebElement GetActionText() {
			
			return driver.findElement(getActionText);	
		}
		
		
		
}
