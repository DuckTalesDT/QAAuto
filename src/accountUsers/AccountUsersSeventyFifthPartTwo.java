package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class AccountUsersSeventyFifthPartTwo extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//75-Всплывает подсказка при редактировании данных менеджером с доступом "Доступ запрещен"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entranceManZapr(driver);
						
		//Получаем сообщение
		String toolTipText = udpPage.promptUdpDontOpen(driver);

		//Проверяем результат
		if (promptZaprUdp.equals(toolTipText))
			System.out.println("AccountUsers Seventy-fifth test is pass");
			else
				System.out.println("AccountUsers Seventy-fifth test is false");
		
		//Закрываем сайт
		driver.quit();
		
	}

}
