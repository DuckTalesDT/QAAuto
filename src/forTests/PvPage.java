package forTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PvPage extends Variables {
	CentersPage centersPage = new CentersPage();
	
		//Labels
	public Label labelTitle = new Label(By.xpath("//div[@class='wrapper forecast-wrapper ng-scope']/div/h2"));
	public Label labelGrafikTitle = new Label(By.xpath("//h2[@class='pp-title' and text()='Прогноз центра учета']"));
	public Label labelGrafikCenterName = new Label(By.xpath("//div[@class='gsc-g graph-frame fc-office-graphic-mon']"));
	public Label labelPromptSmallDays = new Label(By.xpath("//div[@class='graphic-side']/div[3]"));
	public Label labelSalesPeriodTitle = new Label(By.xpath("//h2[@class='uni-title-output']"));
		//Fields
	public Field fieldCenterFirst = new Field(By.xpath("//tbody[@class='fc-office-list']/tr[1]/td"));
	public Field fieldCenterSecond = new Field(By.xpath("//tbody[@class='fc-office-list']/tr[2]/td"));
	public Field fieldCenterThird = new Field(By.xpath("//tbody[@class='fc-office-list']/tr[3]/td"));
	public Field fieldPlan_1 = new Field(By.xpath("//tbody[@class='fc-office-list']/tr[1]/td[2]/input"));
	public Field fieldPlan_2 = new Field(By.xpath("//tbody[@class='fc-office-list']/tr[2]/td[2]/input"));
	public Field fieldPlan_3 = new Field(By.xpath("//tbody[@class='fc-office-list']/tr[3]/td[2]/input"));
	public Field fieldPlanPlus_1 = new Field(By.xpath("//tbody[@class='fc-office-list']/tr[1]/td[3]/input"));
	public Field fieldPlanTotal = new Field(By.xpath("//tbody[@class='fc-office-list']/tr[4]/td[2]/span"));
	public Field fieldPlanPersent = new Field(By.xpath("//span[@class='percent-control']/span"));
	public Field fieldPrognoz_1 = new Field(By.xpath("//tbody[@class='fc-office-list']/tr[1]/td[3]/span"));
	public Field fieldPrognozTotal = new Field(By.xpath("//tbody[@class='fc-office-list']/tr[4]/td[3]"));
	public Field fieldPrognozPlus_1 = new Field(By.xpath("//tbody[@class='fc-office-list']/tr[1]/td[4]"));
	public Field fieldFactKassa_1 = new Field(By.xpath("//tbody[@class='fc-office-list']/tr[1]/td[2]"));
	public Field fieldFactKassaTotal = new Field(By.xpath("//tbody[@class='fc-office-list']/tr[4]/td[2]"));
	public Field fieldKassa_1 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[1]/td[2]/input"));
	public Field fieldKassa_2 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[2]/td[2]/input"));
	public Field fieldKassa_3 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[3]/td[2]/input"));
	public Field fieldKassa_4 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[4]/td[2]/input"));
	public Field fieldKassa_5 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[5]/td[2]/input"));
	public Field fieldKassa_6 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[6]/td[2]/input"));
	public Field fieldKassa_7 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[7]/td[2]/input"));
	public Field fieldKassa_8 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[8]/td[2]/input"));
	public Field fieldKassa_9 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[9]/td[2]/input"));
	public Field fieldKassa_10 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[10]/td[2]/input"));
	public Field fieldKassa_11 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[11]/td[2]/input"));
	public Field fieldKassa_12 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[12]/td[2]/input"));
	public Field fieldKassa_13 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[13]/td[2]/input"));
	public Field fieldKassa_14 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[14]/td[2]/input"));
	public Field fieldKassa_15 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[15]/td[2]/input"));
	public Field fieldKassa_16 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[16]/td[2]/input"));
	public Field fieldKassa_17 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[17]/td[2]/input"));
	public Field fieldKassa_18 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[18]/td[2]/input"));
	public Field fieldKassa_19 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[19]/td[2]/input"));
	public Field fieldKassa_20 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[20]/td[2]/input"));
	public Field fieldKassa_21 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[21]/td[2]/input"));
	public Field fieldKassa_22 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[22]/td[2]/input"));
	public Field fieldKassa_23 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[23]/td[2]/input"));
	public Field fieldKassa_24 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[24]/td[2]/input"));
	public Field fieldKassa_25 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[25]/td[2]/input"));
	public Field fieldKassa_26 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[26]/td[2]/input"));
	public Field fieldKassa_27 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[27]/td[2]/input"));
	public Field fieldKassa_28 = new Field(By.xpath("//tbody[@class='fc-office-revenue-list']/tr[28]/td[2]/input"));
	public Field fieldKassaBottan = new Field(By.xpath("//table[@class='cs-table fc-office-revenue-table']/tfoot/tr/th[2]/span/span"));
	public Field fieldKassaTop = new Field(By.xpath("//table[@class='cs-table fc-office-revenue-table']/thead/tr/th[2]/span/span"));
	public Field fieldDayPrognoz = new Field(By.id("fc-interval-length"));		
	public Field fieldKoefficient_1 = new Field(By.xpath("//div[@class='pp-body pp-season-table-body wide-popup']/div/div/table/tbody/tr/td[3]/input"));		
	public Field fieldKoefficientTotal = new Field(By.xpath("//div[@class='pp-body pp-season-table-body wide-popup']/div/div/table/tbody/tr[4]/td[3]/input"));	
	public Field fieldKoefficientSave = new Field(By.xpath("//div[@class='pp-body pp-season-table-body wide-popup']/div/div/table/tbody/tr/td[4]"));	
	public Field fieldKoefficientSaveTotal = new Field(By.xpath("//div[@class='pp-body pp-season-table-body wide-popup']/div/div/table/tbody/tr[4]/td[4]"));
	public Field fieldKoefficientTotalPrognoz = new Field(By.xpath("//div[@class='pp-body pp-season-table-body wide-popup']/div/div/table/tbody/tr[4]/td[2]"));		
	public Field fieldSalesPeriodCenterFirst = new Field(By.xpath("//span[@class='fs-drop office-change']/span[1]"));
	public Field fieldSalesPeriodCenterSecond = new Field(By.xpath("//span[@class='fs-drop office-change']/span[2]"));
	public Field fieldSalesPeriodCenterName = new Field(By.className("highcharts-title"));
		//Buttons
	public Button buttonPv = new Button(By.linkText("Прогноз выручки"));
	public Button buttonAddCenter = new Button(By.xpath("//a[@href='/fc/administration/office/create']"));
	public Button buttonCenterEdit = new Button(By.xpath("//i[@class='fc-icon-edit']"));
	public Button buttonBefoteMonth = new Button(By.xpath("//div[@class='fc-period-button fc-month-back']"));
	public Button buttonAfterMonth = new Button(By.xpath("//div[@class='fc-period-button fc-month-forward']"));   
	public Button buttonBeginMonth = new Button(By.id("fc-fb-first"));   
	public Button buttonTotalPrognoz = new Button(By.xpath("//label[@for='fc-office-show-total']"));   
	public Button buttonFactKassa = new Button(By.xpath("//label[@for='fc-office-show-factcolumn']"));  
	public Button buttonGrafikBig = new Button(By.xpath("//a[@href='javascript:void(0);' and text()='Увеличить']"));  
	public Button buttonGrafikSmall = new Button(By.xpath("//div[@id='wrapper']/div[3]/div/div/div/div[2]/a/i"));  
	public Button buttonKoefficientOpen = new Button(By.xpath("//span[@class='uni-btn-text']")); 
	public Button buttonKoefficientClose = new Button(By.cssSelector("i.i-pp-close-item.icon-circle_close_delete")); 
	public Button buttonKoefficientSave = new Button(By.xpath("//div[@class='pp-body pp-season-table-body wide-popup']/div/div/table/tbody/tr/td[4]")); 
	public Button buttonSalesPeriodOpen = new Button(By.xpath("//ul[@class='btns-title forecast-graphs-button']/li[3]")); 
	public Button buttonSalesPeriodClose = new Button(By.xpath("//div[@id='wrapper']/div[2]/div[6]/div/div/div/div[2]/a/i")); 
	public Button buttonSalesPeriodCenters = new Button(By.xpath("//span[@class='fs-txt']/span")); 
	
	
	
		//Methods
	public void optionPv(WebDriver driver) throws InterruptedException {
		buttonPv.click();
		Thread.sleep(3000);
		}
	
	public int countCenters(WebDriver driver) throws InterruptedException {
		return driver.findElements(By.xpath("//tbody[@class='fc-office-list']/tr")).size();
	}
	
	public int countSalesPeriodCountCenters(WebDriver driver) throws InterruptedException {
		return driver.findElements(By.xpath("//span[@class='fs-drop office-change']/span[@class='fs-drop-item ng-binding ng-scope']")).size();
	}
	
	public int countDays(WebDriver driver) throws InterruptedException {
		return driver.findElements(By.xpath("//tbody[@class='fc-office-revenue-list']/tr")).size();
	}
	
	public String promptPvDontOpen(WebDriver driver) throws InterruptedException {
		
		//Открываем "Прогноз выручки"
		Actions toolTip = new Actions(driver);
		WebElement textPrompt = driver.findElement(By.linkText("Прогноз выручки"));
		
		//Получаем текст подсказки
		toolTip.moveToElement(textPrompt).build().perform();
		WebElement toolTipElement = driver.findElement(By.cssSelector(".ui-tooltip"));
		
		String toolTipText = toolTipElement.getText();
		return toolTipText;
	}
	
	public void addCenterBeforeMonth(WebDriver driver) throws InterruptedException {
		buttonAddCenter.click();
		centersPage.fieldCenterName.sendKeys(centerName);
		if (!centersPage.buttonBeforePeriod.isEnabled()){
			centersPage.buttonBeforePeriod.click();
		}
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
	}
	
	public void addCenterThisMonth(WebDriver driver) throws InterruptedException {
		buttonAddCenter.click();
		centersPage.fieldCenterName.sendKeys(centerName);
		if (centersPage.buttonBeforePeriod.isEnabled()){
			centersPage.buttonBeforePeriod.click();
		}
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);		
	}
	
	public void goBeforeMonth(WebDriver driver) throws InterruptedException {
		buttonBefoteMonth.click();
		Thread.sleep(3000);
	}
	
	public void goAfterMonth(WebDriver driver) throws InterruptedException {
		buttonAfterMonth.click();
		Thread.sleep(3000);
	}
		
	public void inputPlanFirst_1000(WebDriver driver) throws InterruptedException {
		fieldPlan_1.sendKeys(empty_15);
		fieldPlan_1.sendKeys(dataCeloe_1000);
		labelTitle.click();
		Thread.sleep(3000);
	}
	
	public void setTotalPlan(WebDriver driver) throws InterruptedException {
		fieldPlan_1.sendKeys(empty_15);
		fieldPlan_1.sendKeys(dataCeloe_1000);
		labelTitle.click();
		Thread.sleep(1000);
		fieldPlan_2.sendKeys(empty_15);
		fieldPlan_2.sendKeys(dataCeloe_1000);
		labelTitle.click();
		Thread.sleep(1000);
		fieldPlan_3.sendKeys(empty_15);
		fieldPlan_3.sendKeys(dataCeloe_1000);
		labelTitle.click();
		Thread.sleep(1000);
		buttonTotalPrognoz.click();
		Thread.sleep(1000);
	}
		
	public void inputKassaFirst_1000(WebDriver driver) throws InterruptedException {
		fieldKassa_1.sendKeys(data_1000);
		fieldKassa_1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}
	
	public void setPrognoz(WebDriver driver) throws InterruptedException {
		fieldKassa_1.sendKeys(data_1000);
		fieldKassa_1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		fieldKassa_2.sendKeys(data_1000);
		fieldKassa_2.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		fieldKassa_3.sendKeys(data_1000);
		fieldKassa_3.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		fieldKassa_4.sendKeys(data_1000);
		fieldKassa_4.sendKeys(Keys.ENTER);
		Thread.sleep(1000);	
		fieldDayPrognoz.sendKeys(empty_2);
		fieldDayPrognoz.sendKeys(dateDays_4);
		fieldDayPrognoz.sendKeys(Keys.ENTER);
		Thread.sleep(3000);	
	}
	
	public void inputKassa(WebDriver driver) throws InterruptedException {
		fieldKassa_1.sendKeys(data_1000);
		fieldKassa_1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		fieldKassa_10.sendKeys(data_1000);
		fieldKassa_10.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		fieldKassa_20.sendKeys(data_1000);
		fieldKassa_20.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		fieldKassa_28.sendKeys(data_1000);
		fieldKassa_28.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		fieldPlan_1.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}	
	
	public void inputPv(WebDriver driver) throws InterruptedException {
		fieldCenterFirst.click();
		Thread.sleep(3000);
		fieldPlan_1.sendKeys(empty_15);
		fieldPlan_1.sendKeys(dataCeloe_72000);
		labelTitle.click();
		Thread.sleep(1000);
		fieldKassa_1.sendKeys(empty_15);
		fieldKassa_1.sendKeys(data_26000);
		fieldKassa_1.sendKeys(Keys.ENTER);
		fieldKassa_10.sendKeys(empty_15);
		fieldKassa_10.sendKeys(data_26000);
		fieldKassa_10.sendKeys(Keys.ENTER);
		fieldKassa_28.sendKeys(empty_15);
		fieldKassa_28.sendKeys(data_26000);
		fieldKassa_28.sendKeys(Keys.ENTER);
		fieldPlan_1.sendKeys(Keys.TAB);
		Thread.sleep(1000);		
	}		
}
