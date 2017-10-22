package centers;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFiftyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//59-Таблица раздела имеет перечень колонок
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
												
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
								
		//Проверяем результат
		if (lineTextCenters == (driver.findElements(By.xpath("//ul[@class='fc-office-ttls']/li")).size()))
			if (textFirstLineCenters.equals(driver.findElement(By.xpath("//ul[@class='fc-office-ttls']/li[1]")).getText()))
				if (textSecondLineCenters.equals(driver.findElement(By.xpath("//ul[@class='fc-office-ttls']/li[2]")).getText()))
					if (textThirdLineCenters.equals(driver.findElement(By.xpath("//ul[@class='fc-office-ttls']/li[3]")).getText()))
						if (textFourthLineCenters.equals(driver.findElement(By.xpath("//ul[@class='fc-office-ttls']/li[4]")).getText()))
							if (textFifthLineCenters.equals(driver.findElement(By.xpath("//ul[@class='fc-office-ttls']/li[5]")).getText()))
								System.out.println("Centers Fifty-ninth test is pass");
								else
									System.out.println("Centers Fifty-ninth test part №6 is false");
							else
								System.out.println("Centers Fifty-ninth test part №5 is false");
						else
							System.out.println("Centers Fifty-ninth test part №4 is false");
					else
						System.out.println("Centers Fifty-ninth test part №3 is false");
				else
					System.out.println("Centers Fifty-ninth test part №2 is false");
			else
				System.out.println("Centers Fifty-ninth test part №1 is false");
		
		//Закрываем сайт
		driver.quit();
		
	}
}
