package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredSeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//107-Всплывает подсказка при создании менеджера с паролем менне 6 символов 
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
		usersPage.fieldPassword.sendKeys(parolSmaller);
						
		//Повторяем пароль
		usersPage.fieldRepeatPassword.sendKeys(parolSmaller);
						
		//Нажимаем Сохранить
		usersPage.buttonSave.click();
		Thread.sleep(1000);
						
		//Проверяем результат
		if (promptParolChangeSmaller.equals(usersPage.labelPromptIncorrectData.getText()))
			System.out.println("AccountUsers One hundred seventh test is pass");
			else
				System.out.println("AccountUsers One hundred seventh test is false");
		
		//Возвращаемся к списку пользователей
		usersPage.buttonBackDontCreate.click();
		Thread.sleep(1000);
		
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
												
		//Закрываем сайт
		driver.quit();
			
	}
}	
