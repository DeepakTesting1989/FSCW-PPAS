package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchaseBase {
	
WebDriver driver;
	
	public PurchaseBase (WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	By purchase = By.xpath("//span[contains(text(),'Purchase')]");
	By paddyPurchase = By.xpath("//a[contains(text(),'Paddy Purchase')]");
	By PPC = By.id("intPpcId");
	By Token = By.id("tokenScheduleId");
	By getTokenText = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/select[1]/option[2]");
	By SourceOfPackingMaterial = By.id("paddyPackMaterialSrc");
	By TestNo = By.id("paddyTestNo");
	By testDate = By.id("paddyTestDate");
	By sampleNumber = By.id("paddySampleNo");
	By paddyT = By.id("paddyType");
	By remarks = By.id("paddyRejectionRemark");
	By qualityType = By.id("intpaddyQualityId");
	By InorganicForeignMatter = By.id("paddyQualityStatusValId1");
	By OrganicForeignMatter = By.id("paddyQualityStatusValId2");
	By AdmixtureofLowerClass = By.id("paddyQualityStatusValId3");
	By DamagedDiscolouredSproutedWeeviled = By.id("paddyQualityStatusValId4");
	By ImmaturShrunkenShrivelled = By.id("paddyQualityStatusValId5");
	By MoistureContent = By.id("paddyQualityStatusValId6");
	By Greygrain = By.id("paddyQualityStatusValId7");
	By NoOfBag = By.id("paddyNoOfBag");
	By GrossWeight = By.id("paddyGrossWeight");
	By paddyPackingMaterial = By.id("paddyPackingMaterial");
	By TokenScheduleQty = By.xpath("//tr[3]//td[2]");
	By NetWeight = By.id("paddyNetWeight");
	By submitBtn = By.id("purSavebtnId");
	By getMessage = By.id("messageClientIdSpan");
	By closeBtn = By.xpath("//*[@id='myModal2']/div/div/div[2]/button");
	By getMandMessage = By.xpath("//*[@id='messageClientIdSpan']");
	By viewBtn = By.xpath("//*[@id='main']/div[3]/div/div/div[2]/div/div[1]/ul/li[2]/a");
	By agencyId = By.id("agencyId");
	By searchBtnId = By.id("searchBtnId");
	By getFarmerCode = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[5]");
	By farmerCode = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/table[1]/tbody[1]/tr[2]/td[6]");
	
	
	public WebElement GetFarmerCodeInPurchase() {
		
		return driver.findElement(farmerCode);
	}
	
	public WebElement GetTokenText() {
		
		return driver.findElement(getTokenText);
	}
	
	public WebElement GetFarmerCode() {
		
		return driver.findElement(getFarmerCode);
	}
	
	public WebElement ClickOnSearch() {
		
		return driver.findElement(searchBtnId);
	}
	
	public WebElement SelectaAencyId() {
		
		return driver.findElement(agencyId);
	}
	
	public WebElement ClickOnView() {
		
		return driver.findElement(viewBtn);
	}
	
	public WebElement GetgetMandatoryMessage() {
		
		return driver.findElement(getMandMessage);
	}
	public WebElement ClickOnClose() {
		
		return driver.findElement(closeBtn);
	}
	public WebElement GetSubmissionMessage() {
		
		return driver.findElement(getMessage);
	}
	public WebElement ClickOnPurchase() {
		
		return driver.findElement(purchase);
	}
	public WebElement ClickOnPaddyPurchase() {
		
		return driver.findElement(paddyPurchase);
	}
	public WebElement SelectPPC() {
		
		return driver.findElement(PPC);
	}
	public WebElement SelectPendingTokenForPurchase() {
		
		return driver.findElement(Token);
	}
	public WebElement SelectSourceOfPackingMaterial() {
		
		return driver.findElement(SourceOfPackingMaterial);
	}
	public WebElement EnterTestNo() {
		
		return driver.findElement(TestNo);
	}
	public WebElement SelectTestDate() {
		
		return driver.findElement(testDate);
	}
	public WebElement EnterSampleNo() {
		
		return driver.findElement(sampleNumber);
	}
	public WebElement SelectPaddyType() {
		
		return driver.findElement(paddyT);
	}
	public WebElement EnterRemarks() {
		
		return driver.findElement(remarks);
	}	
	public WebElement SelectQualityType() {
		
		return driver.findElement(qualityType);
	}
	public WebElement EnterInorganicForeignMatterRating() {
		
		return driver.findElement(InorganicForeignMatter);
	}
	public WebElement EnterOrganicForeignMatterRating() {
		
		return driver.findElement(OrganicForeignMatter);
	}
	public WebElement EnterAdmixtureofLowerClassRating() {
		
		return driver.findElement(AdmixtureofLowerClass);
	}
	public WebElement EnterDamagedDiscolouredSproutedWeeviledRating() {
		
		return driver.findElement(DamagedDiscolouredSproutedWeeviled);
	}
	public WebElement EnterImmaturShrunkenShrivelled() {
		
		return driver.findElement(ImmaturShrunkenShrivelled);
	}
	public WebElement EnterMoistureContent() {
		
		return driver.findElement(MoistureContent);
	}
	public WebElement EnterGreygrain() {
		
		return driver.findElement(Greygrain);
	}
	
	public WebElement EnterNoOfBag() {
		
		return driver.findElement(NoOfBag);
	}
	public WebElement EnterGrossWeight() {
		
		return driver.findElement(GrossWeight);
	}
	public WebElement EnterpaddyPackingMaterial() {
		
		return driver.findElement(paddyPackingMaterial);
	}
	public WebElement GetTokenScheduleQty() {
		
		return driver.findElement(TokenScheduleQty);
	}
	public WebElement GetNetWeight() {
		
		return driver.findElement(NetWeight);
	}
	public WebElement ClickOnSubmit() {
		
		return driver.findElement(submitBtn);
	}
	
		
}
