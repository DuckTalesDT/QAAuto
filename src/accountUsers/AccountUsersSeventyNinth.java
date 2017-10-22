package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class AccountUsersSeventyNinth extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//79-Всплывает подсказка при редактировании данных пользователем с доступом "Доступ запрещен"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePolZapr(driver);
						
		//Получаем сообщение
		String toolTipText = pvPage.promptPvDontOpen(driver);
				
		//Проверяем результат
		if (promptZaprPv.equals(toolTipText))
			System.out.println("AccountUsers Seventy-ninth test is pass");
			else
				System.out.println("AccountUsers Seventy-ninth test is false");
		
		//Закрываем сайт
		driver.quit();
		
	}

}
