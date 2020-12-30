package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DistrictConfiguration {
	
	WebDriver driver;

	public DistrictConfiguration(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By configuration =By.xpath("//span[contains(text(),'Configuration')]");
	By districtConfig =By.xpath("//a[contains(text(),'District Configuration')]");
	By getDistrictHeader = By.xpath("//*[@id='main']/div[3]/div/div/div[1]/div/div/h");
	By mandiLoadingLCharge = By.xpath("//select[@id='intLabourChargesExcludingLoadingBy']");
	By ProcurementCapacityPerDay =  By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/input[1]");
	By LChargesForLoadingBy = By.xpath("//select[@id='intLabourChargesForLoadingBy']"); 
	By MaxFarmerSalePerDay = By.xpath("//input[@id='dblMaximumFarmerSalePerDay']");
	By LChargesAtPPCBy = By.xpath("//select[@id='intLabourChargesAtPPCBy']");
	By TransportationBy = By.xpath("//select[@id='intTransportationBy']");
	By submitBtn = By.xpath("//*[@id=\"DistrictConfigurationBean\"]/div[2]/div/button[1]");
	By Yes = By.xpath("//*[@id='myModal3']/div/div/div[2]/button[1]");
	By messageID = By.id("messageIdSpan");
	By Close = By.xpath("//*[@id='myModal']/div/div/div[2]/button");
	By resetBtn = By.xpath("//*[@id=\"DistrictConfigurationBean\"]/div[2]/div/button[2]");
	By settingBtn = By.xpath("//a[@class='nav-link dropdown-toggle nav-user']");
	By logoutBtn = By.xpath("//span[contains(text(),'Logout')]");
	By updateButton = By.xpath("//button[contains(text(),'Update')]");
	By closeButton = By.xpath("//*[@id='myModal']/div/div/div[2]/button");
	By yes = By.xpath("//*[@id='myModal3']/div/div/div[2]/button[1]");
	
	
	public WebElement ClickOnUpdatedYes() {
		
		return driver.findElement(yes);
	}
	public WebElement ClickOnCloseButton() {
		
		return driver.findElement(closeButton);
	}

	public WebElement ClickOnConfiguration() {
		
		return driver.findElement(configuration);
	}
	
	public WebElement ClickOnDistrictConfiguration() {
		
		return driver.findElement(districtConfig);
	}
	
	public WebElement GetHeaderTextDistrict() {
		
		return driver.findElement(getDistrictHeader);
	}
	
	public WebElement SelectMandiLabourChargesExcludingLoadingBy() {
		
		return driver.findElement(mandiLoadingLCharge);
	}
	
	public WebElement SelectProcurementCapacityPerDay() {
		
		return driver.findElement(ProcurementCapacityPerDay);
	}
	
	public WebElement SelectLabourChargesForLoadingBy() {
	
	return driver.findElement(LChargesForLoadingBy);
	}
		
	public WebElement EnterMaximumFarmerSalePerDay() {
			
	return driver.findElement(MaxFarmerSalePerDay);
	}
	
	public WebElement SelectLabourChargesAtPPCBy() {
		
	return driver.findElement(LChargesAtPPCBy);
	}
	
	public WebElement SelectTransportationDoneBy() {
		
	return driver.findElement(TransportationBy);
	}

	
	public WebElement ClickOnSubmit() {
		
	return driver.findElement(submitBtn);
	}
	
	public WebElement ClickOnYes() {
		
	return driver.findElement(Yes);
	}
	
	public WebElement GetMessageText() {
		
	return driver.findElement(messageID);
	}
	
	public WebElement ClickOnClose() {
		
	return driver.findElement(Close);
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
	
	public WebElement ClickUpdateButton() {
		
		return driver.findElement(updateButton);
		}
	
	//View Config
	
	By viewTab =By.xpath("//*[@id=\"main\"]/div[3]/div/div/div[2]/div/div[1]/ul/li[2]/a");
	By actionBtn =By.xpath("//*[@id=\"viewPacsTableId\"]/tbody/tr/td[11]/a");
	
	
	public WebElement ClickOnViewTab() {
		
	return driver.findElement(viewTab);
	}
	
	public WebElement ClickOnAction() {
		
	return driver.findElement(actionBtn);
	}
	
	
	//View PACS Config
	
	By viewPACSConfig =By.xpath("//*[@id=\"main\"]/div[3]/div/div/div[2]/div/div/ul/li[3]/a");
	By ppc = By.id("intConfigurationFor");
	By agency = By.id("intAgencyId");
	By searchBtn = By.id("//*[@id=\"DistrictConfigurationBean\"]/div[3]/div/center/button");
	By actionBtn2 = By.xpath("//*[@id=\"viewPacsTableId\"]/tbody/tr[1]/td[7]/a");
	By mandiiOnSunday = By.id("sunday1");
	By mandiiOnMonday = By.id("monday1");
	By mandiiOnTuesday = By.id("tuesday1");
	By mandiiOnWednesday = By.id("wednesday1");
	By mandiiOnThursday = By.id("thursday1");
	By mandiOnFriday = By.id("friday1");
	By mandiiOnSaturday = By.id("saturday1");
	By saveUpdate = By.id("savebtnId");
	
	public WebElement ClickOnViewPACSConFig() {
		
	return driver.findElement(viewPACSConfig);
		
	}
	
	public WebElement SelectPPC() {
		
	return driver.findElement(ppc);
	
	}
	
	public WebElement SelectAgency() {
		
	return driver.findElement(agency);
		
	}
	
	public WebElement ClickOnSearch() {
		
	return driver.findElement(searchBtn);
			
	}
	
	public WebElement ClickOnPACSConfigAction() {
		
	return driver.findElement(actionBtn2);
				
	}
	
	public WebElement CheckMandiiOnSunday() {
		
	return driver.findElement(mandiiOnSunday);
					
	}
	
	public WebElement CheckMandiiOnMonday() {
		
	return driver.findElement(mandiiOnMonday);
					
	}
	
	public WebElement CheckMandiiOnTuesday() {
		
	return driver.findElement(mandiiOnTuesday);
					
	}
	
	public WebElement CheckMandiiOnWednesday() {
		
	return driver.findElement(mandiiOnWednesday);
					
	}
	
	public WebElement CheckMandiiOnThursday() {
		
	return driver.findElement(mandiiOnThursday);
					
	}
	
	public WebElement CheckMandiiOnFriday() {
		
	return driver.findElement(mandiOnFriday);
					
	}
	
	public WebElement CheckMandiiOnSaturday() {
	
	return driver.findElement(mandiiOnSaturday);
					
	}
	
	public WebElement ClickOnUpdate() {
			
	return driver.findElement(saveUpdate);
						
	}
	
}
