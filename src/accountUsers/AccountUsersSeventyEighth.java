package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class AccountUsersSeventyEighth extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//78-Всплывает подсказка при просмотре данных пользователем с доступом "Доступ запрещен"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePolZapr(driver);
						
		//Получаем сообщение
		String toolTipText = pvPage.promptPvDontOpen(driver);
				
		//Проверяем результат
		if (promptZaprPv.equals(toolTipText))
			System.out.println("AccountUsers Seventy-eightn test is pass");
			else
				System.out.println("AccountUsers Seventy-eightn test is false");
		
		//Закрываем сайт
		driver.quit();
		
	}

}
