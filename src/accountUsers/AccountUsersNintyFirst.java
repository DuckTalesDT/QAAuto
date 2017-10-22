package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersNintyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//91-Получение подсказки при создании менеджера/пользователя с неверным вводом данных в графу "Повторите пароль"
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
										
		//Вводим телефон
		usersPage.fieldTelephone.sendKeys(telephone);
										
		//Вводим Имя
		usersPage.fieldName.sendKeys(userName);
										
		//Вводим E-mail
		usersPage.fieldEmail.sendKeys(userMail);
								
		//Устанавливаем СМС-авторизация=Да
		usersPage.fieldSms.sendKeys(smsYes);
						
		//Устанавливаем Активность=Да
		usersPage.fieldActivity.sendKeys(userIncludYes);
										
		//Выбираем роль Менеджера
		usersPage.buttonRolManager.click();
										
		//Вводим пароль
		usersPage.fieldPassword.sendKeys(parol);
										
		//Повторяем пароль не правильно
		usersPage.fieldRepeatPassword.sendKeys(parolNew);
										
		//Нажимаем Сохранить
		usersPage.buttonSave.click();
		Thread.sleep(1000);
		
		//Проверяем результат
		if (promptIncorrectUserPasswordRepeat.equals(usersPage.labelPromptIncorrectData.getText()))
			System.out.println("AccountUsers Ninty-first test is pass");
			else
				System.out.println("AccountUsers Ninty-first test is false");
						
		//Возвращаемся к списку пользователей
		usersPage.buttonBackDontCreate.click();
			
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
												
		//Закрываем сайт
		driver.quit();
	}
}	
