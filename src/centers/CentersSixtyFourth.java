package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSixtyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//64-При создании Группы ячейка "Название" пустая
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
		
		//Нажимаем "Добавить группу"
		centersPage.buttonAddGrup.click();
		
		//Проверяем результат
		if (centerNameEmpty.equals(centersPage.fieldGrupName.getText()))
			System.out.println("Centers Sixty-fourth test is pass");
			else
				System.out.println("Centers Sixty-fourth is false");
		
		//Нажимаем "Отмена"
		centersPage.buttonGrupDontSave.click();
		
		//Удаляем Группу 
		centersPage.deleteAllGrup(driver);
						
		//Закрываем сайт
		driver.quit();
	}

}
