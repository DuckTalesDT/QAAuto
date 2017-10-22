package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredTwentyFourthPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//124-Все изменения по пользователям/менеджерам сохраняются при каждом посещении приложения
		EntrancePage entrancePage = new EntrancePage();
		UsersPage usersPage = new UsersPage();
								
		//Запускаем приложение и проходим авторизацию
		entrancePage.entrance(driver);
											
		//Открываем "Пользователи аккаунта"
		usersPage.goOptionUsers(driver);
		
		//Проверяем результат
		if (rolPol.equals(usersPage.labelRolFirst.getText()))
			if (rolPol.equals(usersPage.labelRolSecond.getText()))
				{
				//Открываем 1-го пользователя
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
				if (rolMen.equals(usersPage.labelRolFirst.getText()))
					if (rolPol.equals(usersPage.labelRolSecond.getText()))
						System.out.println("AccountUsers One hundred twenty-fourth test is pass");
						else
							System.out.println("AccountUsers One hundred twenty-fourth test part №4 is false");
					else
						System.out.println("AccountUsers One hundred twenty-fourth test part №3 is false");
				}
				else
					System.out.println("AccountUsers One hundred twenty-fourth test part №2 is false");
			else
				System.out.println("AccountUsers One hundred twenty-fourth test part №1 is false");
			
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
												
		//Закрываем сайт
		driver.close();
	}
}
