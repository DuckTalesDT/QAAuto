package forTests;

import org.openqa.selenium.By;

public class MainPage extends Variables {
	
		//Labels
	public Label labelTitle = new Label(By.xpath("//h2[@class='uni-title-output']"));
	public Label labelAccount = new Label(By.xpath("//a[@class='holder' and @href='/fc/administration/account/profile']"));
	public Label labelVersion = new Label(By.className("copyright"));
		//Fields
	public Field fieldName = new Field(By.xpath("//a[@href='/fc/administration/account/profile' and @class='holder']"));
	public Field fieldEmail = new Field(By.xpath("//ul[@class='nav']/li[4]"));
		//Buttons
	public Button buttonLogo = new Button(By.className("logo"));
	public Button buttonAboutService = new Button(By.xpath("//a[@href='http://finance-controlling.net/']"));
	public Button buttonSyteEntrance = new Button(By.cssSelector("li.enter-li.collapse-hide > a"));
	public Button buttonExit = new Button(By.xpath("//a[@class='holder logged-links']"));		
}
