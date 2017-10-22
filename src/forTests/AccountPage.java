package forTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AccountPage extends Variables {
	
		//Labels
	public Label labelEditingAccount = new Label(By.className("uni-title-output"));
	public Label messagePrompt = new Label(By.xpath("//div[@class='form-message error in']"));
		//Fields
	public Field fieldName = new Field(By.id("account_profile_title"));
	public Field fieldRassilka = new Field(By.id("account_profile_reminderRevenue"));
	public Field fieldRassilkaYes = new Field(By.xpath("//option[@value='1']"));
	public Field fieldRassilkaNo = new Field(By.xpath("//option[@value='0']"));
	public Field fieldDays = new Field(By.id("account_profile_possibleEditDays"));
	public Field fieldTime = new Field(By.id("account_profile_timezone"));
	public Field fieldTimeLisbon = new Field(By.xpath("//option[@value='Europe/Lisbon']"));
	public Field fieldTimeKiev = new Field(By.xpath("//option[@value='Europe/Kiev']"));
	public Field fieldValuta = new Field(By.id("account_profile_baseCurrency"));
	public Field fieldValutaUah = new Field(By.xpath("//option[@value='UAH']"));
		//Buttons
	public Button buttonEditingAccount = new Button(By.xpath("//a[@class='holder' and @href='/fc/administration/account/profile']"));
	public Button buttonSettingsAccount = new Button(By.xpath("//div[@id='wrapper']/nav/div/ul/li[4]/div/ul/li[3]/a"));
	public Button buttonSave = new Button(By.cssSelector("input.ep-btn-mask"));
	
	
	
		//Methods
	public void optionEditingAccount(WebDriver driver) throws InterruptedException {
		
		//Открываем "Редактирование аккаунта"
		buttonEditingAccount.click();
		Thread.sleep(3000);
	}
	
	public void goOptionAccountSettinth(WebDriver driver) throws InterruptedException {
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.xpath(optionAll))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath(optionAccountSettinth)).click();
		Thread.sleep(3000);
	}
	
	public void save(WebDriver driver) throws InterruptedException {
		buttonSave.click();
		Thread.sleep(1000);
	}
	
}
