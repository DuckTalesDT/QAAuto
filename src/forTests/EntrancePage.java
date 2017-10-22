package forTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntrancePage extends Variables {
	
		//Lables
	public Label LabelEntrance = new Label(By.xpath("//h1[@class='i-title' and text()='Вход в систему']"));
	public Label LabelChangePassword = new Label(By.xpath("//h1[@class='i-title' and text()='Восстановление пароля']"));
	public Label LabelRegistration = new Label(By.xpath("//h1[@class='i-title' and text()='Регистрация в системе']"));
	public Label LabelPromptRepeatIncorrectEmail = new Label(By.id("rec-login-error"));
	public Label LabelPromptIncorrectData = new Label(By.id("pre-login-error"));
		//Fields
	public Field fieldEntranceEmail = new Field(By.name("username"));
	public Field fieldEntranceParol = new Field(By.name("password"));
	public Field fieldEntranceEmailNewPassword = new Field(By.cssSelector("#password-recovery > form > div.form-container > div.fc-line > div.wrfield > input[name=\"username\"]"));
		//Buttons
	public Button buttonSyteEntrance = new Button(By.cssSelector("li.enter-li.collapse-hide > a"));
	public Button buttonRegistration = new Button(By.linkText("Регистрация"));
	public Button buttonEntrance = new Button(By.cssSelector("input.fc-btn"));
	public Button buttonRepeatPassword = new Button(By.className("link-i-frame"));
	public Button buttonRepeatDispach = new Button(By.xpath("//input[@value='Отправить']"));
	public Button buttonLogo = new Button(By.xpath("//a[@href='https://finance-controlling.net']"));
	
		
	
	//Methods
	public void entrance(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mail);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}
	
	public void entranceNewMail(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mailNew);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}
	
	public void entranceNewParol(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mail);
		fieldEntranceParol.sendKeys(parolNew);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}
	
	public void entranceXParol(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mail);
		fieldEntranceParol.sendKeys(parolX);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
		}
	
	public void entranceSmallerParol(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mail);
		fieldEntranceParol.sendKeys(parolSmaller);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
		}
	
	public void entranceMaxim(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mailMaxim);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}
	
	public void entranceMaximPv(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mailMaximPv);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}
	
	public void entranceMaximUdp(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mailMaximUdp);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}
	
	public void entranceStand(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mailStand);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}
	
	public void entranceStandPv(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mailStandPv);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}
	
	public void entranceStandUdp(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mailStandUdp);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}
	
	public void entranceOptim(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mailOptim);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}
	
	public void entranceOptimPv(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mailOptimPv);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}
	
	public void entranceOptimUdp(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mailOptimUdp);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}
	
	public void entrancePers(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mailPers);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}
	
	public void entranceManRedact(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mailManRedact);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}

	public void entranceManChten(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mailManChten);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}

	public void entranceManZapr(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mailManZapr);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}

	public void entrancePolRedact(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mailPolRedact);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}

	public void entrancePolChten(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mailPolChten);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}

	public void entrancePolZapr(WebDriver driver) throws InterruptedException {
		fieldEntranceEmail.sendKeys(mailPolZapr);
		fieldEntranceParol.sendKeys(parol);
		Thread.sleep(1000);
		buttonEntrance.click();
		Thread.sleep(5000);
	}
}
