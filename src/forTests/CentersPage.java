package forTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CentersPage extends Variables {
		
		//Labels
	public Label labelTitle = new Label(By.xpath("//h2[@class='uni-title-output']"));
	public Label labelPromptEmptyName = new Label(By.xpath("//div[@class='fc-new-group-name-error']"));
	public Label labelPromptMoreCenter = new Label(By.xpath("//p[@style='font-size: 25px; color: #ff0000;']"));
	public Label labelCenterDateCreate = new Label(By.xpath("//li[@class='fc-office-item']/div[2]"));
	public Label labelGrupDateCreate = new Label(By.xpath("//div[@class='fc-office-row']/div[2]"));
		//Fields
	public Field fieldCenterName = new Field(By.id("office_title"));
	public Field fieldCenterComment = new Field(By.id("office_comment"));
	public Field fieldGrupName = new Field(By.id("fc-new-group-name"));
	public Field fieldNewGrupName = new Field(By.id("fc-edit-group-name"));
	public Field fieldCenterId = new Field(By.xpath("//li[@class='fc-office-item']"));
	public Field fieldCenterNameTable = new Field(By.linkText("ќфис"));
	public Field fieldCenterNameNewTable = new Field(By.linkText("ќфис новый"));
	public Field fieldCenterNameFirstTable = new Field(By.xpath("//div[@id='fc-office-list']/ul[2]/li[1]/div"));
	public Field fieldCenterNameSecondTable = new Field(By.xpath("//div[@id='fc-office-list']/ul[2]/li[2]/div"));
	public Field fieldCenterNameThirdTable = new Field(By.xpath("//div[@id='fc-office-list']/ul[2]/li[3]/div"));
	public Field fieldGrupNameTable = new Field(By.xpath("//div[@id='fc-office-list']/ul/li/div/div"));
		//Buttons
	public Button buttonCenters = new Button(By.xpath("//a[@href='/fc/administration/office/groups']"));
	public Button buttonAddCenter = new Button(By.xpath("//div[@class='pagination-after-btn add-new-center']/a[2]"));
	public Button buttonCenterSave = new Button(By.className("ep-btn-mask"));
	public Button buttonCenterDontSave = new Button(By.xpath("//span[@class='text-ep-link-cancel']"));
	public Button buttonCenterDontSaveInMessage = new Button(By.linkText("ќтменить"));
	public Button buttonCenterDelete = new Button(By.xpath("//div[@id='fc-office-list']/ul[2]/li/div[5]"));
	public Button buttonAgreeCenterDelete = new Button(By.id("fc-office-delete-office-button"));
	public Button buttonDontAgreeCenterDelete = new Button(By.xpath("//div[@id='wrapper']/div/div[2]/div[4]/div/div/div/div[2]/div/div/div/a/span"));
	public Button buttonBeforePeriod = new Button(By.xpath("//div[@class='wrfield wrhidden fc-form-checkbox']"));
	public Button buttonAddGrup = new Button(By.xpath("//div[@class='pagination-after-btn add-new-center']/a[1]"));
	public Button buttonGrupSave = new Button(By.xpath("//span[@class='uni-btn-text small-btn-text']"));
	public Button buttonGrupOpen = new Button(By.xpath("//ul[@id='fc-office-groups']/li/div/div/a"));
	public Button buttonGrupRename = new Button(By.id("fc-rename-group-button"));
	public Button buttonGrupDontSave = new Button(By.xpath("//a[@href='javascript:void(0);']/span[text()='ќтменить']"));
	public Button buttonGrupDontRename = new Button(By.xpath("//div[@id='wrapper']/div/div[2]/div[2]/div/div/div/div[2]/a/i"));
	public Button buttonGrupDelete = new Button(By.xpath("//li[@class='fc-office-group']/div/div[5]"));
	public Button buttonAgreeGrupDelete = new Button(By.id("fc-delete-group-button"));
	public Button buttonDontAgreeGrupDelete = new Button(By.xpath("//div[@id='wrapper']/div/div[2]/div[3]/div/div/div/div[2]/div/div/div/a/span"));
	public Button buttonPeriod = new Button(By.cssSelector("i.uni-checkbox-i"));
	public Button buttonCenterOutdors = new Button(By.xpath("//span[@class='text-ep-link-cancel']"));
	
				
		
	//Methods
	public void goOptionCenters(WebDriver driver) throws InterruptedException {
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.xpath(optionAll))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath(optionCenters)).click();
		Thread.sleep(3000);
	}
	
	public int countCenters(WebDriver driver) throws InterruptedException {
		return driver.findElements(By.xpath("//div[@id='fc-office-list']/ul[2]/li[@class='fc-office-item']")).size();
	}
	
	public int countGrups(WebDriver driver) throws InterruptedException {
		return driver.findElements(By.xpath("//ul[@id='fc-office-groups']/li")).size();
	}
	
public void addCenterBeforeMonth(WebDriver driver) throws InterruptedException {
		buttonAddCenter.click();
		fieldCenterName.sendKeys(centerName);
		if (!buttonBeforePeriod.isEnabled()){
			buttonBeforePeriod.click();
		}
		buttonCenterSave.click();
		Thread.sleep(3000);		
	}
	
	public void addCenterThisMonth(WebDriver driver) throws InterruptedException {
		buttonAddCenter.click();
		fieldCenterName.sendKeys(centerName);
		if (buttonBeforePeriod.isEnabled()){
			buttonBeforePeriod.click();
		}
		buttonCenterSave.click();
		Thread.sleep(3000);		
	}
	
	public void addGrup(WebDriver driver) throws InterruptedException {
		buttonAddGrup.click();
		fieldGrupName.sendKeys(grupName);			
		buttonGrupSave.click();
		Thread.sleep(3000);
	}
	
	public void deleteCenter(WebDriver driver) throws InterruptedException {
		buttonCenterDelete.click();
		buttonAgreeCenterDelete.click();
		Thread.sleep(3000);
	}
	
	public void deleteAllCenter(WebDriver driver) throws InterruptedException {
		int countCentersDelete = driver.findElements(By.xpath("//div[@id='fc-office-list']/ul[2]/li[@class='fc-office-item']")).size();
		for (int centersDelete = countCentersDelete; centersDelete > 0; centersDelete --)
			{
			buttonCenterDelete.click();
			buttonAgreeCenterDelete.click();
			Thread.sleep(3000);
			}
	}
	
	public void deleteAllCenterWizoutOne(WebDriver driver) throws InterruptedException {
		int countCentersDelete = driver.findElements(By.xpath("//div[@id='fc-office-list']/ul[2]/li[@class='fc-office-item']")).size() - 1;
		for (int centersDelete = countCentersDelete; centersDelete > 0; centersDelete --)
			{
			buttonCenterDelete.click();
			buttonAgreeCenterDelete.click();
			Thread.sleep(3000);
			}
	}
	
	public void deleteAllGrup(WebDriver driver) throws InterruptedException {
		int countGrupDelete = driver.findElements(By.xpath("//ul[@id='fc-office-groups']/li")).size();
		for (int grupDelete = countGrupDelete; grupDelete > 0; grupDelete --)
			{
			buttonGrupDelete.click();
			buttonAgreeGrupDelete.click();
			Thread.sleep(3000);
			}
	}	
}
