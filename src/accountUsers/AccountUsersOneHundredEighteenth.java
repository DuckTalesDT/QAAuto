package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredEighteenth extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//118-При добавлении нового пользователя/менеджера все ячейки пустые
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
											
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
		
		//Удаляем всех пользователей
		usersPage.deleteAllUserSecond(driver);
				
		//Нажимаем Добавить пользователя
		usersPage.buttonAddUser.click();
		Thread.sleep(1000);
				
		//Проверяем результат
		if (nameEmpty.equals(usersPage.fieldTelephone.getText()))
			if (nameEmpty.equals(usersPage.fieldName.getText()))
				if (nameEmpty.equals(usersPage.fieldEmail.getText()))
					if (nameEmpty.equals(usersPage.fieldPassword.getText()))
						if (nameEmpty.equals(usersPage.fieldRepeatPassword.getText()))
							System.out.println("AccountUsers One nundred eighteenth test is pass");
							else
								System.out.println("AccountUsers One nundred eighteenth test part №5 is false");
						else
							System.out.println("AccountUsers One nundred eighteenth test part №4 is false");
					else
						System.out.println("AccountUsers One nundred eighteenth test part №3 is false");
				else
					System.out.println("AccountUsers One nundred eighteenth test part №2 is false");
			else
				System.out.println("AccountUsers One nundred eighteenth test part №1 is false");
		
		//Возвращаемся к списку пользователей
		usersPage.buttonBackDontCreate.click();
			
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
		
		
	}

}
