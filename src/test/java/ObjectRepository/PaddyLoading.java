package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaddyLoading {
	
WebDriver driver;
	
	public PaddyLoading (WebDriver driver) {
		
		this.driver = driver;
	}
	
	By TP = By.xpath("//span[contains(text(),'Transit Pass')]");
	By paddyLoading = By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[2]/ul/li[2]/a");
	By getHeaderText = By.xpath("//*[@id='main']/div[3]/div/div/div[1]/div/div/h");
	By PPC = By.id("intPpcId");
	By season = By.id("pacsConfigId");
	By miller = By.id("millerId");
	By vehicleRegNo = By.id("vehicleRegNo");
	By driverName = By.id("driverName");
	By SearchButton = By.id("searchBtn");
	By ActionButton = By.xpath("//tr[1]//td[9]//a[1]");
	By checkSerialOne = By.name("chkId");
	By checkSerialTwo = By.id("6398");
	By checkSerialThree = By.id("6399");
	By SubmitButton = By.id("savebtnId");
	By Yes = By.id("yes");
	By No = By.xpath("//button[contains(text(),'No')]");
	By CloseButton = By.xpath("//*[@id=\"myModalMessage\"]/div/div/div[2]/button");
	By Setting = By.xpath("//*[@id=\"main\"]/div[2]/nav/ul[1]/li/a");
	By Logout = By.xpath("//*[@id=\"main\"]/div[2]/nav/ul[1]/li/div/a[2]");
	By getResultText = By.xpath("//tr[1]//td[4]");
	By getLoadingQuantity = By.name("qty");
	By BagLoading = By.name("bag");
	By totalpurchaseQty = By.name("qty");
	By getSubmitMessage = By.id("messageIdSpan");
	By TPYes = By.id("yes1");
	By ConfirmTP = By.xpath("//*[@id='viewPacsTableId']/tbody/tr[2]/td[12]/a[1]");
	By TPTab = By.xpath("//*[@id='main']/div[3]/div/div/div[3]/div/div/ul/li[2]/a");
	By deleteBtn = By.xpath("//*[@id='viewPacsTableId']/tbody/tr[2]/td[12]/a[3]");
	By getDeleteMessage = By.xpath("//*[@id='messageIdSpa']");
	By pageHeader = By.xpath("//*[@id='main']/div[3]/div/div/div[1]/div/div/h");
	By FristCheckBox = By.id("6376");
	By close = By.xpath("//*[@data-dismiss='modal']");
	
	
	
	public WebElement Clickonclose() {
		
		return driver.findElement(close);	
	}
	
	public WebElement GetDeleteMessage() {
		
		return driver.findElement(getDeleteMessage);	
	}
	
	public WebElement ClickOnDeleteBtn() {
		
		return driver.findElement(deleteBtn);	
	}
	
	public WebElement ClickOnTPTab() {
		
		return driver.findElement(ConfirmTP);	
	}
	
	public WebElement ClickOnConfirmTP() {
		
		return driver.findElement(ConfirmTP);	
	}
	
	public WebElement ClickOnTPYes() {
		
		return driver.findElement(TPYes);	
	}
	
	public WebElement GetSubmitMessage() {
		
		return driver.findElement(getSubmitMessage);	
	}
	
	public WebElement TotalPurchaseQty() {
		
		return driver.findElement(totalpurchaseQty);	
	}
	
	public WebElement BagLoading() {
		
		return driver.findElement(BagLoading);	
	}
	
	public WebElement GetLoadingQuantity() {
		
		return driver.findElement(getLoadingQuantity);	
	}

	public WebElement GetTextResultdorMiller() {
		
		return driver.findElement(getResultText);	
	}

	public WebElement ClickOnTransitPass() {
		
		return driver.findElement(TP);	
	}
	
	public WebElement ClickOnPaddyLoading() {
		
		return driver.findElement(paddyLoading);
		
	}
	
	public WebElement GetHeaderText() {
		
		return driver.findElement(getHeaderText);
		
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
	
	public WebElement ClickOnSearchButton() {
		
		return driver.findElement(SearchButton);
		
	}
	
	public WebElement ClickOnActionButton() {
		
		return driver.findElement(ActionButton);
		
	}
	
	public WebElement CheckOnSerialOne() {
		
		return driver.findElement(checkSerialOne);
		
	}
	
	public WebElement CheckOnSerialTwo() {
		
		return driver.findElement(checkSerialOne);
		
	}
	
	public WebElement CheckOnSerialThree() {
		
		return driver.findElement(checkSerialThree);
		
	}
	

	public WebElement ClickOnSubmitButton() {
		
		return driver.findElement(SubmitButton);
		
	}
	
	public WebElement ClickOnYes() {
		
		return driver.findElement(Yes);
		
	}
	
	public WebElement ClickOnNo() {
		
		return driver.findElement(No);
		
	}
	
	public WebElement ClickOnCloseButton() {
		
		return driver.findElement(CloseButton);
		
	}
	
	public WebElement ClickOnSetting() {
		
		return driver.findElement(Setting);
		
	}
	
	public WebElement ClickOnLogout() {
		
		return driver.findElement(Logout);
		
	}
	
	public WebElement Getpageheadertext() {
		
		return driver.findElement(pageHeader);
		
	}
	
	public WebElement ClickOnFristCheckBox() {
		
		return driver.findElement(FristCheckBox);
		
	}
	
	
}
