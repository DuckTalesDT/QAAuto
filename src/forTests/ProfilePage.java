package forTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ProfilePage extends Variables {
	
		//Labels
	public Label labelPrompt = new Label(By.xpath("//div[@class='form-message error in']"));
		//Fields
	public Field fieldTelephone = new Field(By.id("profile_edit_phone"));
	public Field fieldSms = new Field(By.xpath("//a[@class='selectBox castomselect selectBox-dropdown']"));
	public Field fieldName = new Field(By.id("profile_edit_firstName"));
	public Field fieldEmail = new Field(By.id("profile_edit_email"));
	public Field fieldPassword = new Field(By.id("profile_edit_oldPassword"));
	public Field fieldNewPassword = new Field(By.id("profile_edit_password_first"));
	public Field fieldRepeatPassword = new Field(By.id("profile_edit_password_second"));
		//Buttons
	public Button buttonProfile = new Button(By.xpath("//a[@href='/fc/profile']"));
	public Button buttonChangeParol = new Button(By.xpath("//a[@href='javascript:void(0);']"));
	public Button buttonSave = new Button(By.cssSelector("input.ep-btn-mask"));
	public Button buttonShowPassword = new Button(By.xpath("//div[@class='ep-col']/div[1]/div/div/button"));
	public Button buttonShowNewPassword = new Button(By.xpath("//div[@class='ep-col']/div[2]/div/div/div/button"));
	public Button buttonShowRepeatPassword = new Button(By.xpath("//div[@class='ep-col']/div[2]/div[2]/div/div/button"));
	
		
	
	//Methods
	public void goOptionEditingProfile(WebDriver driver) throws InterruptedException {
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.xpath(optionAll))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath(optionEditingProfile)).click();
	}
	
	public void save(WebDriver driver) throws InterruptedException {
		buttonSave.click();
		Thread.sleep(3000);
	}

}


	
	
