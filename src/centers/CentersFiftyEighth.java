package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFiftyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//58-Получение сообщения при превышении Max допустимого количества центров учета при тарифе "Максимальный"
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceMaxim(driver);
												
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
			
		//Удаляем группы 
		centersPage.deleteAllGrup(driver);
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenterWizoutOne(driver);
		
		//Добавляем 24 ЦУ
		for(int i = 0; i < 24; i++){
			centersPage.addCenterThisMonth(driver);
			}
		
		//Нажимаем "Добавить центр учета" лишний ЦУ
		centersPage.buttonAddCenter.click();
				
		//Проверяем результат
		if (promptCentersMore.equals(centersPage.labelPromptMoreCenter.getText()))	
			System.out.println("Centers Fifty-eighth test is pass");
			else
				System.out.println("Centers Fifty-eighth test is false");
		
		//Нажимаем Отменить
		centersPage.buttonCenterDontSaveInMessage.click();
				
		//Удаляем ЦУ 
		centersPage.deleteAllCenterWizoutOne(driver);
						
		//Закрываем сайт
		driver.quit();
		
	}
}
