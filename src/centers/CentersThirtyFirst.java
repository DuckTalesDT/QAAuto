package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersThirtyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//31-Получение подсказки при создании группы  без названия
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
						
		//Нажимаем "Добавить Группу"
		centersPage.buttonAddGrup.click();
						
		//Не набираем название
		//centersPage.fieldGrupName.sendKeys(grupName);			
				
		//Нажимаем "Сохранить"
		centersPage.buttonGrupSave.click();
				
		//Проверяем результат
		Thread.sleep(1000);
		if (promptGrupNameEmpty.equals(centersPage.labelPromptEmptyName.getText()))
			System.out.println("Centers Thirty-first test is pass");
			else
				System.out.println("Centers Thirty-first test is false");
		
		//Нажимаем "Отмена"
		centersPage.buttonGrupDontSave.click();
		Thread.sleep(1000);
		
		//Удаляем Группы 
		centersPage.deleteAllGrup(driver);
						
		//Закрываем сайт
		driver.quit();
	}
}
