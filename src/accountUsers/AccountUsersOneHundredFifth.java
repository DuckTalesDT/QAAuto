package accountUsers;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//105-Таблица раздела имеет перечень колонок
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
											
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
						
		//Обрезаем текст колонки №2
		Thread.sleep(3000);
		String textForSecondBefore = driver.findElement(By.xpath("//thead[@class='grid-head']/tr/th[2]")).getText();
		String textForSecondAfter = textForSecondBefore.split("\\ ")[0];
				
		//Обрезаем текст колонки №4
		Thread.sleep(1000);
		String textForFourthBefore = driver.findElement(By.xpath("//thead[@class='grid-head']/tr/th[4]")).getText();
		String textForFourthAfter = textForFourthBefore.split("\\ ")[0];
						
		//Обрезаем текст колонки №5
		Thread.sleep(1000);
		String textForFifthBefore = driver.findElement(By.xpath("//thead[@class='grid-head']/tr/th[5]")).getText();
		String textForFifthAfter = textForFifthBefore.split("\\ ")[0];
								
		//Проверяем результат
		Thread.sleep(3000);
		if (lineTextUsers == (driver.findElements(By.xpath("//thead[@class='grid-head']/tr/th")).size()))
			if (textFirstlineUsers.equals(driver.findElement(By.xpath("//thead[@class='grid-head']/tr/th[1]")).getText()))
				if (textSecondlineUsers.equals(textForSecondAfter))
					if (textThirdlineUsers.equals(driver.findElement(By.xpath("//thead[@class='grid-head']/tr/th[3]")).getText()))
						if (textFourthlineUsers.equals(textForFourthAfter))
							if (textFifthlineUsers.equals(textForFifthAfter))
								if (textSixthlineUsers.equals(driver.findElement(By.xpath("//thead[@class='grid-head']/tr/th[6]")).getText()))
									if (textSeventhlineUsers.equals(driver.findElement(By.xpath("//thead[@class='grid-head']/tr/th[7]")).getText()))
										if (textEighthlineUsers.equals(driver.findElement(By.xpath("//thead[@class='grid-head']/tr/th[8]")).getText()))
											System.out.println("AccountUsers One hundred fifth test is pass");
											else
												System.out.println("AccountUsers One hundred fifth test part №9 is false");
										else
											System.out.println("AccountUsers One hundred fifth test part №8 is false");
									else
										System.out.println("AccountUsers One hundred fifth test part №7 is false");
								else
									System.out.println("AccountUsers One hundred fifth test part №6 is false");
							else
								System.out.println("AccountUsers One hundred fifth test part №5 is false");
						else
							System.out.println("AccountUsers One hundred fifth test part №4 is false");
					else
						System.out.println("AccountUsers One hundred fifth test part №3 is false");
				else
					System.out.println("AccountUsers One hundred fifth test part №2 is false");
			else
				System.out.println("AccountUsers One hundred fifth test part №1 is false");
																						
		//Закрываем сайт
		driver.quit();
			
	}
}	
