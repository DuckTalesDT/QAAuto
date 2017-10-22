package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFiftyFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//55-Получение сообщения при превышении Max допустимого количества центров учета при тарифе "Персональный"
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePers(driver);
												
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
			
		//Удаляем группы 
		centersPage.deleteAllGrup(driver);
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
		
		//Нажимаем "Добавить центр учета"
		centersPage.buttonAddCenter.click();
		
		//Проверяем результат
		if (promptCentersMore.equals(centersPage.labelPromptMoreCenter.getText()))	
			System.out.println("Centers Fifty-fifth test is pass");
			else
				System.out.println("Centers Fifty-fifth test is false");
		
		//Нажимаем Отменить
		centersPage.buttonCenterDontSaveInMessage.click();	
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
						
		//Закрываем сайт
		driver.quit();
		
	}
}
