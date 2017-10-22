package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class AccountUsersSeventyFourth extends Variables {
			
	@Test
	public void test() throws InterruptedException{
		//74-Всплывает подсказка при просмотре данных менеджером с доступом "Доступ запрещен"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceManZapr(driver);
						
		//Получаем сообщение
		String toolTipText = pvPage.promptPvDontOpen(driver);
				
		//Проверяем результат
		if (promptZaprPv.equals(toolTipText))
			System.out.println("AccountUsers Seventy-fourth test is pass");
			else
				System.out.println("AccountUsers Seventy-fourth test is false");
		
		//Закрываем сайт
		driver.quit();
				
	}

}
