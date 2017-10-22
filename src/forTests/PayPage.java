package forTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PayPage extends Variables {
	
		//Labels
	public Label labelPaySumma = new Label(By.id("answer"));
	public Label labelUslugaFirstBeforeChange = new Label(By.xpath("//div[@class='wrapper']/div[2]/table/tbody/tr[1]"));
	public Label labelUslugaSecondBeforeChange = new Label(By.xpath("//div[@class='wrapper']/div[2]/table/tbody/tr[2]"));
	public Label labelUslugaThirdBeforeChange = new Label(By.xpath("//div[@class='wrapper']/div[2]/table/tbody/tr[3]"));
	public Label labelUslugaFourthBeforeChange = new Label(By.xpath("//div[@class='wrapper']/div[2]/table/tbody/tr[4]"));
	public Label labelNameTarifAfterChange = new Label(By.xpath("//div[@class='uni-title'][2]/h2/strong"));
	public Label labelUslugaFirstAfterChange = new Label(By.xpath("//div[@class='wrapper']/div[4]/table/tbody/tr[1]"));
	public Label labelUslugaSecondAfterChange = new Label(By.xpath("//div[@class='wrapper']/div[4]/table/tbody/tr[2]"));
	public Label labelUslugaThirdAfterChange = new Label(By.xpath("//div[@class='wrapper']/div[4]/table/tbody/tr[3]"));
	public Label labelUslugaFourthAfterChange = new Label(By.xpath("//div[@class='wrapper']/div[4]/table/tbody/tr[4]"));
		//Fields
	public Field fieldTarifPayDays = new Field(By.id("renewal_period_period"));
	public Field fieldTarifDays_30 = new Field(By.xpath("//option[@value='30']"));
	public Field fieldTarifDays_60 = new Field(By.xpath("//option[@value='60']"));
	public Field fieldTarifDays_90 = new Field(By.xpath("//option[@value='90']"));
	public Field fieldTarifDays_180 = new Field(By.xpath("//option[@value='180']"));
	public Field fieldTarifDays_360 = new Field(By.xpath("//option[@value='360']"));
		//Buttons
	public Button buttonTarif = new Button(By.xpath("//span[@class='holder']/mark[text()='Тариф:']"));
	public Button buttonPay = new Button(By.xpath("//a[@href='/fc/billing/status']"));

	
		
		//Methods		
	public int countUslugaBeforeChange(WebDriver driver) {
		return driver.findElements(By.xpath("//div[@class='wrapper']/div[2]/table/tbody/tr")).size();
	}
			
	public int countUslugaAfterChange(WebDriver driver) {
		return driver.findElements(By.xpath("//div[@class='wrapper']/div[4]/table/tbody/tr")).size();
	}
			
	public void goOptionPay(WebDriver driver) throws InterruptedException {
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.xpath(optionTarif))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath(optionPay)).click();
		Thread.sleep(3000);
	}

	public void setDays_30(WebDriver driver) throws InterruptedException {
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.id("renewal_period_period"))).perform();
		Thread.sleep(1000);
		fieldTarifDays_30.click();
		Thread.sleep(1000);
	}

	public void setDays_60(WebDriver driver) throws InterruptedException {
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.id("renewal_period_period"))).perform();
		Thread.sleep(1000);
		fieldTarifDays_60.click();
		Thread.sleep(1000);
	}
	
	public void setDays_90(WebDriver driver) throws InterruptedException {
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.id("renewal_period_period"))).perform();
		Thread.sleep(1000);
		fieldTarifDays_90.click();
		Thread.sleep(1000);
	}
	
	public void setDays_180(WebDriver driver) throws InterruptedException {
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.id("renewal_period_period"))).perform();
		Thread.sleep(1000);
		fieldTarifDays_180.click();
		Thread.sleep(1000);
	}
	
	public void setDays_360(WebDriver driver) throws InterruptedException {
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.id("renewal_period_period"))).perform();
		Thread.sleep(1000);
		fieldTarifDays_360.click();
		Thread.sleep(1000);
	}
}
