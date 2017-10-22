package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class AccountUsersSeventyNinthPartTwo extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//79-Всплывает подсказка при редактировании данных пользователем с доступом "Доступ запрещен"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrancePolZapr(driver);
						
		//Получаем сообщение
		String toolTipText = udpPage.promptUdpDontOpen(driver);

		//Проверяем результат
		if (promptZaprUdp.equals(toolTipText))
			System.out.println("AccountUsers Seventy-ninth test is pass");
			else
				System.out.println("AccountUsers Seventy-ninth test is false");
		
		//Закрываем сайт
		driver.quit();
		
	}

}
