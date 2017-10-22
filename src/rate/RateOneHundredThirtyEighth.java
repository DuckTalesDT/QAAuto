package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.EntrancePage;
import forTests.TarifPage;
import forTests.Variables;

public class RateOneHundredThirtyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//138-Активный тариф имеет указатель "Ваш тариф"
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
				
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
																				
		//Открываем "Информация о тарифах"
		tarifPage.goOptionAboutTarif(driver);
										
		//Проверяем результат
		if (!driver.findElement(By.xpath("//div[@class='bord-tarif']/div/p")).isDisplayed())
			if(driver.findElement(By.xpath("//div[@class='bord-tarif active-tarif current-tariff']/div/p")).isDisplayed())
				System.out.println("Rate One hundred thirty-eighth test is pass");
				else
					System.out.println("Rate One hundred thirty-eighth test part №2 is false");
			else
				System.out.println("Rate One hundred thirty-eighth test part №1 is false");
		
		//Закрываем сайт
		driver.quit();
	}

}
