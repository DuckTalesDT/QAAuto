package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFiftySecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//52-Допустимое количесто центров учета при тарифе "Стандартный"
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceStand(driver);
												
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
			
		//Удаляем группы 
		centersPage.deleteAllGrup(driver);
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenterWizoutOne(driver);
		
		//Добавляем 2 ЦУ
		for(int i = 0; i < 2; i++){
			centersPage.addCenterThisMonth(driver);
			}
		
		//Добавляем лишний ЦУ
		centersPage.buttonAddCenter.click();
				
		//Проверяем результат
		if (promptCentersMore.equals(centersPage.labelPromptMoreCenter.getText()))	
			{
			//Нажимаем Отменить
			centersPage.buttonCenterDontSaveInMessage.click();	
			
			//Проверяем результат
			if (countCentersStand == (centersPage.countCenters(driver)))	
				System.out.println("Centers Fifty-second test is pass");
				else
					System.out.println("Centers Fifty-second test part №2 is false");
			}
			else
				System.out.println("Centers Fifty-second test part №1 is false");
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenterWizoutOne(driver);
						
		//Закрываем сайт
		driver.quit();
		
	}
}
