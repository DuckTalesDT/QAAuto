package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersFirst extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//1-Добавление менеджера
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
						
		//Проверяем результат
		if (countUsers_2 == (usersPage.countUsers(driver)))
			if (userName.equals(usersPage.buttonName.getText()))
				if (userMail.equals(usersPage.labelEmail.getText()))
					if (telephone.equals(usersPage.labelTelephone.getText()))
						if (rolMen.equals(usersPage.labelRolFirst.getText()))
							if (userActivityYes.equals(usersPage.fieldActivityTable.getText()))
								{
								//Открываем Менеджера
								usersPage.buttonNameOpen.click();
								
								//Проверяем
								if (smsYes.equals(usersPage.fieldSms.getText()))
									System.out.println("AccountUsers First test is pass");
									else
										System.out.println("AccountUsers First test part №7 is false");
								
								//Возвращаемся к списку пользователей
								usersPage.buttonBackDontCreate.click();
								}
								else
									System.out.println("AccountUsers First test part №6 is false");
							else
								System.out.println("AccountUsers First test part №5 is false");
						else
							System.out.println("AccountUsers First test part №4 is false");
					else
						System.out.println("AccountUsers First test part №3 is false");
				else
					System.out.println("AccountUsers First test part №2 is false");
			else
				System.out.println("AccountUsers First test part №1 is false");
												
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
		
	}

}
