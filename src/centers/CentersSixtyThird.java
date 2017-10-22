package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSixtyThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//63-При создании ЦУ ячейки "Название" и "Комментарий" пустые
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
		
		//Нажимаем "Добавить центр учета"
		centersPage.buttonAddCenter.click();
		
		//Проверяем результат
		if (centerNameEmpty.equals(centersPage.fieldCenterName.getText()))
			if (centerCommentEmpty.equals(centersPage.fieldCenterComment.getText()))
				System.out.println("Centers Sixty-third test is pass");
				else
					System.out.println("Centers Sixty-third test part №2 is false");
			else
				System.out.println("Centers Sixty-third part №1 is false");
		
		//Нажимаем "Отмена"
		centersPage.buttonCenterDontSave.click();
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
						
		//Закрываем сайт
		driver.quit();
	}

}
