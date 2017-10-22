package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersFiftyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//51-Изменение роли "Пользователь" на роль "Менеджер"
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
											
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
		
		//Удаляем всех пользователей
		usersPage.deleteAllUserSecond(driver);
		
		//Добавляем Пользователя
		usersPage.addPolzovatel(driver);
		
		//Открываем Пользователя
		usersPage.buttonNameOpen.click();
		
		//Меняем роль на Менеджера
		usersPage.buttonRolManager.click();
		
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
						if (rolMen.equals(usersPage.labelRolFirst.getText()))
							if (userActivityYes.equals(usersPage.fieldActivityTable.getText()))
								System.out.println("AccountUsers Fifty-first test is pass");
								else
									System.out.println("AccountUsers Fifty-first test part №6 is false");
							else
								System.out.println("AccountUsers Fifty-first test part №5 is false");
						else
							System.out.println("AccountUsers Fifty-first test part №4 is false");
					else
						System.out.println("AccountUsers Fifty-first test part №3 is false");
				else
					System.out.println("AccountUsers Fifty-first test part №2 is false");
			else
				System.out.println("AccountUsers Fifty-first test part №1 is false");
														
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
		
	}

}
