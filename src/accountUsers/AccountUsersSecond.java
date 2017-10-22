package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersSecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//2-Добавление пользователя
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
											
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
		
		//Удаляем всех пользователей
		usersPage.deleteAllUserSecond(driver);
				
		//Добавляем пользователя
		usersPage.addPolzovatel(driver);
				
		//Проверяем результат
		if (countUsers_2 == (usersPage.countUsers(driver)))
			if (userName.equals(usersPage.buttonName.getText()))
				if (userMail.equals(usersPage.labelEmail.getText()))
					if (telephone.equals(usersPage.labelTelephone.getText()))
						if (rolPol.equals(usersPage.labelRolFirst.getText()))
							if (userActivityYes.equals(usersPage.fieldActivityTable.getText()))
								{
								//Открываем Пользователя
								usersPage.buttonNameOpen.click();
								
								//Проверяем
								if (smsYes.equals(usersPage.fieldSms.getText()))
									System.out.println("AccountUsers Second test is pass");
									else
										System.out.println("AccountUsers Second test part №7 is false");
								
								//Возвращаемся к списку пользователей
								usersPage.buttonBackDontCreate.click();
								}
								else
									System.out.println("AccountUsers Second test part №6 is false");
							else
								System.out.println("AccountUsers Second test part №5 is false");
						else
							System.out.println("AccountUsers Second test part №4 is false");
					else
						System.out.println("AccountUsers Second test part №3 is false");
				else
					System.out.println("AccountUsers Second test part №2 is false");
			else
				System.out.println("AccountUsers Second test part №1 is false");
														
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
				
	}

}
