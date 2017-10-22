package centers;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFortyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//41-Отображение даты удаления центра учета
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
												
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
			
		//Удаляем группы 
		centersPage.deleteAllGrup(driver);
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
		
		//Создаем ЦУ 
		centersPage.addCenterThisMonth(driver);
		
		//Получаем ID данного ЦУ
		Thread.sleep(3000);
		String id = (centersPage.fieldCenterId.getAttribute("id"));
		
		//Удаляем ЦУ 
		centersPage.deleteCenter(driver);
					
		//Делаем активным "Показывать удаленные центры учета"
		centersPage.buttonPeriod.click();
		
		//Проверяем результат
		Thread.sleep(3000);
		if (centersThisMonth.equals(driver.findElement(By.xpath("//li[@id='"+ id +"']/div[3]")).getText()))
			System.out.println("Centers Forty-first test is pass");
			else
				System.out.println("Centers Forty-first test is false");
		
		//Делаем не активным "Показывать удаленные центры учета"
		centersPage.buttonPeriod.click();
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
						
		//Закрываем сайт
		driver.quit();
	}

}
