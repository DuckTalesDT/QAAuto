package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersThirtyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//35-Отклонение в удалении группы
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
						
		//Добавляем Группу
		centersPage.addGrup(driver);
		
		//Нажимаем Удалить
		centersPage.buttonGrupDelete.click();
										
		//Подтверждаем
		centersPage.buttonDontAgreeGrupDelete.click();
						
		//Проверяем результат
		if (countGrups_1 == (centersPage.countGrups(driver)))
			System.out.println("Centers Thirty-fifth test is pass");
			else
				System.out.println("Centers Thirty-fifth test is false");
		
		//Удаляем группы 
		centersPage.deleteAllGrup(driver);
		
		//Закрываем сайт
		driver.quit();
	}
}
