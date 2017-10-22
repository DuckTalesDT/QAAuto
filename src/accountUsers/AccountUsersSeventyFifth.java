package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class AccountUsersSeventyFifth extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//75-Всплывает подсказка при редактировании данных менеджером с доступом "Доступ запрещен"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceManZapr(driver);
						
		//Получаем сообщение
		String toolTipText = pvPage.promptPvDontOpen(driver);
				
		//Проверяем результат
		if (promptZaprPv.equals(toolTipText))
			System.out.println("AccountUsers Seventy-fifth test is pass");
			else
				System.out.println("AccountUsers Seventy-fifth test is false");
		
		//Закрываем сайт
		driver.quit();
		
	}

}
