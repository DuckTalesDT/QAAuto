package entrance;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class EntranceSecond extends Variables  {
	
	@Test
	public void test() throws InterruptedException{
		// 2-При правильном введении данных при отключенной СМС-авторизации происходит вход в систему
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		
		//Открываем сайт
		driver.get(adressSyteEntrance);
		
		//Нажимаем кнопку "Вход"
		entrancePage.buttonSyteEntrance.click();
										
		//Набираем E-mail в поле "E-mail"
		entrancePage.fieldEntranceEmail.sendKeys(mail);
						
		//Набираем пароль в поле "Пароль"
		entrancePage.fieldEntranceParol.sendKeys(parol);
							
		//Нажимаем на кнопку "Войти"
		entrancePage.buttonEntrance.click();
						
		//Проверяем результат
		Thread.sleep(3000);
		if (pageSistem.equals(pvPage.buttonPv.getText()))
			System.out.println("Entrance Second test is pass");
			else 
				System.out.println("Entrance Second test is false");
											
		//Закрываем сайт
		driver.quit();
	}

}
