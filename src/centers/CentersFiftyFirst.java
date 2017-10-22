package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFiftyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//51-Допустимое количесто центров учета при тарифе "Персональный"
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
			{
			//Нажимаем Отменить
			centersPage.buttonCenterDontSaveInMessage.click();	
			
			//Проверяем результат
			if (countCentersPerso == (centersPage.countCenters(driver)))	
				System.out.println("Centers Fifty-first test is pass");
				else
					System.out.println("Centers Fifty-first test part №2 is false");
			}
			else
				System.out.println("Centers Fifty-first test part №1 is false");
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
						
		//Закрываем сайт
		driver.quit();
		
	}
}
