package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersThirtyFifth extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//35-Изменения функционала "Включен" на "Нет"   
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
											
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
		
		//Удаляем всех пользователей
		usersPage.deleteAllUserSecond(driver);
				
		//Добавляем Менеджера
		usersPage.addManager(driver);
		
		//Меняем значение колонки "Включен" на Нет
		usersPage.fieldActivityTable.sendKeys(userActivityNo);
		Thread.sleep(1000);
		
		//Проверяем результат
		if (countUsers_2 == (usersPage.countUsers(driver)))
			if (userName.equals(usersPage.buttonName.getText()))
				if (userMail.equals(usersPage.labelEmail.getText()))
					if (telephone.equals(usersPage.labelTelephone.getText()))
						if (rolMen.equals(usersPage.labelRolFirst.getText()))
							if (userActivityNo.equals(usersPage.fieldActivityTable.getText()))
								{
								//Открываем Менеджера
								usersPage.buttonNameOpen.click();
								
								//Проверяем
								if (userActivityNo.equals(usersPage.fieldActivity.getText()))
									System.out.println("AccountUsers Thirty-fifth test is pass");
									else
										System.out.println("AccountUsers Thirty-fifth test part №7 is false");
								
								//Возвращаемся к списку пользователей
								usersPage.buttonBackDontCreate.click();
								}
								else
									System.out.println("AccountUsers Thirty-fifth test part №6 is false");
							else
								System.out.println("AccountUsers Thirty-fifth test part №5 is false");
						else
							System.out.println("AccountUsers Thirty-fifth test part №4 is false");
					else
						System.out.println("AccountUsers Thirty-fifth test part №3 is false");
				else
					System.out.println("AccountUsers Thirty-fifth test part №2 is false");
			else
				System.out.println("AccountUsers Thirty-fifth test part №1 is false");
														
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
	}

}
