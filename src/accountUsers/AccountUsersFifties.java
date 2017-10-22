package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersFifties extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//50-Изменение роли "Менеджер" на роль "Пользователь"
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
		
		//Открываем Менеджера
		usersPage.buttonNameOpen.click();
		
		//Меняем роль на Пользователя
		usersPage.buttonRolPolzovatel.click();
		
		//Нажимаем Сохранить
		usersPage.buttonSave.click();
		Thread.sleep(3000);
						
		//Возвращаемся к списку пользователей
		usersPage.buttonBackDontCreate.click();	
		Thread.sleep(1000);
		
		//Проверяем результат
		if (countUsers_2 == (usersPage.countUsers(driver)))
			if (userName.equals(usersPage.buttonName.getText()))
				if (userMail.equals(usersPage.labelEmail.getText()))
					if (telephone.equals(usersPage.labelTelephone.getText()))
						if (rolPol.equals(usersPage.labelRolFirst.getText()))
							if (userActivityYes.equals(usersPage.fieldActivityTable.getText()))
								System.out.println("AccountUsers Fifties test is pass");
								else
									System.out.println("AccountUsers Fifties test part №6 is false");
							else
								System.out.println("AccountUsers Fifties test part №5 is false");
						else
							System.out.println("AccountUsers Fifties test part №4 is false");
					else
						System.out.println("AccountUsers Fifties test part №3 is false");
				else
					System.out.println("AccountUsers Fifties test part №2 is false");
			else
				System.out.println("AccountUsers Fifties test part №1 is false");
														
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
	}

}
