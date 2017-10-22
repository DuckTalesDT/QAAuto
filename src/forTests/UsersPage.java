package forTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UsersPage extends Variables {
	
		//Labels
	public Label labelTitle = new Label(By.xpath("//h2[@class='uni-title-output']"));
	public Label labelTelephone = new Label(By.xpath("//table[@class='big-table cs-data-grid-table']/tbody/tr[2]/td[5]"));
	public Label labelEmail = new Label(By.xpath("//table[@class='big-table cs-data-grid-table']/tbody/tr[2]/td[4]"));
	public Label labelRolFirst = new Label(By.xpath("//table[@class='big-table cs-data-grid-table']/tbody/tr[2]/td[6]"));
	public Label labelRolSecond = new Label(By.xpath("//table[@class='big-table cs-data-grid-table']/tbody/tr[3]/td[6]"));
	public Label labelRolManager = new Label(By.xpath("//div[@id='user_edit_role']/label[1]"));
	public Label labelRolPolzovatel = new Label(By.xpath("//div[@id='user_edit_role']/label[2]"));
	public Label labelPromptIncorrectData = new Label(By.xpath("//div[@class='form-message error in']"));
	public Label labelPromptMoreUsers = new Label(By.xpath("//p[@style='font-size: 25px; color: #ff0000;']"));
		//Fields
	public Field fieldTelephone = new Field(By.xpath("//div[@class='ep-twocol']/div[1]/div[1]/div/input"));
	public Field fieldName = new Field(By.xpath("//div[@class='ep-twocol']/div[1]/div[2]/div/input"));
	public Field fieldEmail = new Field(By.xpath("//div[@class='ep-twocol']/div[1]/div[3]/div/input"));
	public Field fieldPassword = new Field(By.xpath("//div[@class='ep-twocol']/div[2]/div[2]/div/div/input"));
	public Field fieldRepeatPassword = new Field(By.xpath("//div[@class='ep-twocol']/div[2]/div[3]/div/div/input"));
	public Field fieldSms = new Field(By.xpath("//div[@class='ep-twocol']/div[1]/div[4]/div/a"));
	public Field fieldActivity = new Field(By.xpath("//div[@class='ep-twocol']/div[2]/div[4]/div/a"));
	public Field fieldActivityTable = new Field(By.xpath("//a[@class='selectBox castomselect editing-boolean selectBox-dropdown']"));
	public Field fieldActivityTableSecond = new Field(By.xpath("//table[@class='big-table cs-data-grid-table']/tbody/tr[3]/td[6]"));
	public Field fieldComment = new Field(By.id("user_edit_comment"));
	public Field fieldDostup = new Field(By.xpath("//a[@class='selectBox castomselect editing-boolean grid-filter-choice selectBox-dropdown']"));
		//Buttons
	public Button buttonAdminOpen = new Button(By.linkText(name));
	public Button buttonNameOpen = new Button(By.linkText(userName));
	public Button buttonNameOpenNew = new Button(By.linkText(userNameNew));
	public Button buttonName = new Button(By.xpath("//table[@class='big-table cs-data-grid-table']/tbody/tr[2]/td[2]"));
	public Button buttonUsers = new Button(By.xpath("//a[@href='/fc/administration/user/list']"));
	public Button buttonAddUser = new Button(By.xpath("//span[@class='uni-btn-text']"));
	public Button buttonSave = new Button(By.xpath("//input[@class='ep-btn-mask']"));
	public Button buttonDontSave = new Button(By.linkText("Отменить"));
	public Button buttonBackCreate = new Button(By.xpath("//div[@class='ep-btns-line acl-btns']/a/span"));
	public Button buttonBackDontCreate = new Button(By.xpath("//span[@class='text-ep-link-cancel' and text()='Вернуться к списку пользователей']"));
	public Button buttonDelete = new Button(By.linkText("Удалить"));
	public Button buttonDeleteFourth = new Button(By.xpath("//table[@class='big-table cs-data-grid-table']/tbody/tr[4]/td[8]/a"));
	public Button buttonRolManager = new Button(By.id("user_edit_role_0"));
	public Button buttonRolPolzovatel = new Button(By.id("user_edit_role_1"));
	public Button buttonDostup = new Button(By.xpath("//a[@href='#ep-acl']"));
		
	
	
	//Methods
	public void goOptionUsers(WebDriver driver) throws InterruptedException {
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.xpath(optionAll))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath(optionUsers)).click();
		Thread.sleep(3000);
	}
	
	public int countUsers(WebDriver driver) throws InterruptedException {
		return driver.findElements(By.xpath("//div[@class='big-table-container uni-style-container']/table/tbody/tr")).size();
	}
	
	public void addManager (WebDriver driver) throws InterruptedException {
		buttonAddUser.click();
		fieldTelephone.sendKeys(telephone);
		fieldName.sendKeys(userName);
		fieldEmail.sendKeys(userMail);
		fieldSms.sendKeys(smsYes);
		fieldActivity.sendKeys(userIncludYes);
		buttonRolManager.click();
		fieldPassword.sendKeys(parol);
		fieldRepeatPassword.sendKeys(parol);
		buttonSave.click();
		Thread.sleep(3000);
		buttonBackCreate.click();
		Thread.sleep(1000);		
	}
	
	public String getPromptManager(WebDriver driver) throws InterruptedException {
		//Наводим на менеджера
		Actions toolTip = new Actions(driver);
		WebElement textPrompt = driver.findElement(By.xpath("//div[@id='user_edit_role']/label[1]"));	
		toolTip.moveToElement(textPrompt).build().perform();
		
		//Получаем текст
		WebElement toolTipElement = driver.findElement(By.cssSelector(".ui-tooltip"));
		String toolTipText = toolTipElement.getText();
		return toolTipText;
	}
	
	public void addPolzovatel (WebDriver driver) throws InterruptedException {
		buttonAddUser.click();
		fieldTelephone.sendKeys(telephone);
		fieldName.sendKeys(userName);
		fieldEmail.sendKeys(userMail);
		fieldSms.sendKeys(smsYes);
		fieldActivity.sendKeys(userIncludYes);
		buttonRolPolzovatel.click();
		fieldPassword.sendKeys(parol);
		fieldRepeatPassword.sendKeys(parol);
		buttonSave.click();
		Thread.sleep(3000);
		buttonBackCreate.click();
		Thread.sleep(1000);		
	}
	
	public String getPromptPolzovatel(WebDriver driver) throws InterruptedException {
		//Наводим на менеджера
		Actions toolTip = new Actions(driver);
		WebElement textPrompt = driver.findElement(By.xpath("//div[@id='user_edit_role']/label[2]"));	
		toolTip.moveToElement(textPrompt).build().perform();
				
		//Получаем текст
		WebElement toolTipElement = driver.findElement(By.cssSelector(".ui-tooltip"));
		String toolTipText = toolTipElement.getText();
		return toolTipText;
	
	}
	
	public void addUser(WebDriver driver) throws InterruptedException {
		buttonAddUser.click();
		fieldTelephone.sendKeys(telephone);
		fieldName.sendKeys(userName);
		fieldEmail.sendKeys(Integer.toString(number));
		fieldEmail.sendKeys(userMail);
		fieldPassword.sendKeys(parol);
		fieldRepeatPassword.sendKeys(parol);
		buttonSave.click();
		Thread.sleep(3000);
		buttonBackCreate.click();
		Thread.sleep(1000);
		number++;
	}	
	
	public void deleteSecondUser(WebDriver driver) throws InterruptedException {
		buttonDelete.click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	
	public void deleteFourthUser(WebDriver driver) throws InterruptedException {
		buttonDeleteFourth.click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
			
	public void deleteAllUserSecond(WebDriver driver) throws InterruptedException {
		int countUsersDelete = driver.findElements(By.xpath("//div[@class='big-table-container uni-style-container']/table/tbody/tr")).size() - 1;
		for (int usersDelete = countUsersDelete; usersDelete >0 ; usersDelete --)
			{
			buttonDelete.click();
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			}
	}
	
	public void deleteAllUserFourth(WebDriver driver) throws InterruptedException {
		int countUsersDelete = driver.findElements(By.xpath("//div[@class='big-table-container uni-style-container']/table/tbody/tr")).size() - 3;
		for (int usersDelete = countUsersDelete; usersDelete >0 ; usersDelete --)
			{
			buttonDeleteFourth.click();
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			}
	}
}
