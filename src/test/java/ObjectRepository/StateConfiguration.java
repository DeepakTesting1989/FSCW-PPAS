package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class StateConfiguration {
	
	WebDriver driver;

	public StateConfiguration(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By configuration =By.xpath("//*[@id='sidebar-menu']/ul/li/a/span[1]");
	By stateConfig =By.xpath("//a[contains(text(),'State Configuration')]");
	By startDate =By.id("dtmStartDate");
	By endDate = By.id("dtmEndDate");
	By kmsYear =  By.id("intYear");
	By season = By.id("season");
	By millerTarget = By.id("intMiller_MaxAcceptedDays");
	By seasonDesc = By.id("vchSeasonDescription");
	By submitBtn = By.id("submit");
	By resetBtn =By.xpath("//button[contains(text(),'Reset')]");
	By settingBtn = By.xpath("//a[@class='nav-link dropdown-toggle nav-user']");
	By logoutBtn = By.xpath("//span[contains(text(),'Logout')]");
	By submissionMeggage = By.id("messageIdSpan");
	By CloseButton = By.xpath("//*[@id='myModal']/div/div/div[2]/button");
	By viewStatus = By.xpath("//td[contains(text(),'Active')]");
	
	public WebElement GetViewStatus() {
		
		return driver.findElement(viewStatus);
	}

	public WebElement ClickOnCloseButton() {
		
		return driver.findElement(CloseButton);
	}

	public WebElement GetsubmissionMeggage() {
		
		return driver.findElement(submissionMeggage);
	}

	public WebElement ClickOnConfiguration() {
		
		return driver.findElement(configuration);
	}
	
	public WebElement ClickOnStateConfiguration() {
		
		return driver.findElement(stateConfig);
	}
	
	public WebElement SelectStartDate() {
		
		return driver.findElement(startDate);
	}
	
	public WebElement SelectEndDate() {
		
		return driver.findElement(endDate);
	}
	
	public void SelectKMCYear(int index) {
		Select board = new Select(driver.findElement(kmsYear));
		board.selectByIndex(index);
//	return driver.findElement(kmsYear);
	}
		
	public WebElement SelectSeason() {
			
	return driver.findElement(season);
	}
	
	public WebElement EnterMillerTarget() {
		
	return driver.findElement(millerTarget);
	}
	
	public WebElement EnterSeasonDescription() {
		
	return driver.findElement(seasonDesc);
	}

	
	public WebElement ClickOnSubmit() {
		
	return driver.findElement(submitBtn);
	}

	public WebElement ClickOnReset() {
		
	return driver.findElement(resetBtn);
	}	
	
	public WebElement ClickOnSetting() {
		
	return driver.findElement(settingBtn);
	}
	
	public WebElement ClickOnLogout() {
		
	return driver.findElement(logoutBtn);
	}
	
	//View Tab
	By viewTab = By.xpath("//*[@id=\"main\"]/div[3]/div/div/div[2]/div/div/ul/li[2]/a");
	By stateConfigYear = By.id("intYear");
	By stateConfigSeason = By.id("vchSeasonDescription");
	By dtmStartDate = By.id("dtmStartDate");
	By dtmEndDate = By.id("dtmEndDate");
	By searchBtn = By.xpath("//*[@id=\"View\"]/div/div[2]/div[3]/button");
	
	public WebElement ClickOnViewTab() {
		
	return driver.findElement(viewTab);
	}
	
	public WebElement ClickOnStateConfigYear() {
		
	return driver.findElement(stateConfigYear);
	}
	
	public WebElement ClickOnStateConfigSeason() {
		
	return driver.findElement(stateConfigYear);
	}
	
	public WebElement ClickOnStartDate() {
		
	return driver.findElement(dtmStartDate);
	}
	
	public WebElement ClickOnEndDate() {
		
	return driver.findElement(dtmEndDate);
	}
	
	public WebElement ClickOnSearch() {
		
	return driver.findElement(searchBtn);
	}
}
