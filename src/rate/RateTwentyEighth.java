package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateTwentyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//28-Отказ от изменения тарифа
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
														
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
		
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
				
		//Выбираем тариф "Vip"
		tarifPage.buttonTarifVip.click();
							
		//Нажимаем "Изменить тарифный план"
		tarifPage.buttonChangeTarif.click();
							
		//Нажимаем "Отменить"
		tarifPage.buttonDontAgreeChangeTarif.click();
		Thread.sleep(1000);
						
		//Открываем “Оплата/продление”
		payPage.goOptionPay(driver);
		
		//Проверяем результат
		if (driver.findElements(By.xpath(tarifBack)).size() == 0)
			System.out.println("Rate Twenty-eighth test is pass");
			else
				System.out.println("Rate Twenty-eighth test is false");
				
		//Закрываем сайт
		driver.quit();
	}

}
