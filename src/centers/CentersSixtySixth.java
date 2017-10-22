package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSixtySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//66-Все изменения по ЦУ/Группам сохраняются при каждом посещении приложения
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
		
		//Добавляем ЦУ за текущий месяц
		centersPage.addCenterThisMonth(driver);
		
		//Добавляем группу
		centersPage.addGrup(driver);
		
		//Выбираем данный центр учета
		centersPage.fieldCenterNameTable.click();
								
		//Набираем новое название центра учета
		centersPage.fieldCenterName.sendKeys(empty_15);
		centersPage.fieldCenterName.sendKeys(centerNameNew);
						
		//Нажимаем "Сохранить"
		centersPage.buttonCenterSave.click();
		Thread.sleep(3000);
		
		//Открываем группу
		centersPage.buttonGrupOpen.click();
				
		//Набираем новое название
		centersPage.fieldNewGrupName.sendKeys(empty_15);	
		centersPage.fieldNewGrupName.sendKeys(grupNameNew);			
						
		//Нажимаем "Переименовать"
		centersPage.buttonGrupRename.click();
		Thread.sleep(3000);
		
		//Закрываем сайт
		driver.close();
	
	}

}
