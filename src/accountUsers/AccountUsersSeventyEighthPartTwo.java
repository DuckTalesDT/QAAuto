package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class AccountUsersSeventyEighthPartTwo extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//78-Всплывает подсказка при просмотре данных пользователем с доступом "Доступ запрещен"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePolZapr(driver);
						
		//Получаем сообщение
		String toolTipText = udpPage.promptUdpDontOpen(driver);

		//Проверяем результат
		if (promptZaprUdp.equals(toolTipText))
			System.out.println("AccountUsers Seventy-eighth test is pass");
			else
				System.out.println("AccountUsers Seventy-eighth test is false");
		
		//Закрываем сайт
		driver.quit();
		
	}

}
