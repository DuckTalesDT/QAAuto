package centers;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersSixtySixthPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//66-Все изменения по ЦУ/Группам сохраняются при каждом посещении приложения
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
												
		//Открываем "Центры учета"
		centersPage.goOptionCenters(driver);
		
		//Проверяем результат
		Thread.sleep(3000);
		if (countCenters_1 == (centersPage.countCenters(driver)))
			if (centerNameNew.equals(centersPage.fieldCenterNameFirstTable.getText()))
				if (countGrups_1 == (centersPage.countGrups(driver)))
					if (grupNameNew.equals(centersPage.fieldGrupNameTable.getText()))
						{
						//Выбираем данный центр учета
						centersPage.fieldCenterNameNewTable.click();
												
						//Набираем новое название центра учета
						centersPage.fieldCenterName.sendKeys(empty_15);
						centersPage.fieldCenterName.sendKeys(centerName);
										
						//Нажимаем "Сохранить"
						centersPage.buttonCenterSave.click();
						Thread.sleep(3000);
						
						//Открываем группу
						centersPage.buttonGrupOpen.click();
								
						//Набираем новое название
						centersPage.fieldNewGrupName.sendKeys(empty_15);	
						centersPage.fieldNewGrupName.sendKeys(grupName);			
										
						//Нажимаем "Переименовать"
						centersPage.buttonGrupRename.click();
						Thread.sleep(3000);
						
						Thread.sleep(3000);
						if (countCenters_1 == (centersPage.countCenters(driver)))
							if (centerName.equals(centersPage.fieldCenterNameFirstTable.getText()))
								if (countGrups_1 == (centersPage.countGrups(driver)))
									if (grupName.equals(centersPage.fieldGrupNameTable.getText()))
										System.out.println("Centers Sixty-sixth test is pass");
										else
											System.out.println("Centers Sixty-sixth test part №8 is false");
									else
										System.out.println("Centers Sixty-sixth test part №7 is false");
								else
									System.out.println("Centers Sixty-sixth test part №6 is false");
							else
								System.out.println("Centers Sixty-sixth test part №5 is false");
						
						}
						else
							System.out.println("Centers Sixty-sixth test part №4 is false");
					else
						System.out.println("Centers Sixty-sixth test part №3 is false");
				else
					System.out.println("Centers Sixty-sixth test part №2 is false");
			else
				System.out.println("Centers Sixty-sixth test part №1 is false");
		
		//Удаляем Группы 
		centersPage.deleteAllGrup(driver);
		
		//Удаляем ЦУ 
		centersPage.deleteAllCenter(driver);
						
		//Закрываем сайт
		driver.quit();
		
		
	}

}
