package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersOneHundredTwentyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//124-Все изменения по пользователям/менеджерам сохраняются при каждом посещении приложения
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
		
		//Нажимаем Добавить пользователя
		usersPage.buttonAddUser.click();
										
		//Вводим телефон
		usersPage.fieldTelephone.sendKeys(telephone);
										
		//Вводим Имя
		usersPage.fieldName.sendKeys(userName);
										
		//Вводим E-mail
		usersPage.fieldEmail.sendKeys(1+userMail);
								
		//Устанавливаем СМС-авторизация=Да
		usersPage.fieldSms.sendKeys(smsYes);
				
		//Устанавливаем Активность=Да
		usersPage.fieldActivity.sendKeys(userIncludYes);
										
		//Выбираем роль Пользователь
		usersPage.buttonRolPolzovatel.click();
										
		//Вводим пароль
		usersPage.fieldPassword.sendKeys(parol);
										
		//Повторяем пароль
		usersPage.fieldRepeatPassword.sendKeys(parol);
										
		//Нажимаем Сохранить
		usersPage.buttonSave.click();
		Thread.sleep(3000);
						
		//Возвращаемся к списку пользователей
		usersPage.buttonBackCreate.click();
		Thread.sleep(1000);		
		
		//Открываем Менеджера
		usersPage.buttonNameOpen.click();
				
		//Меняем роль на Пользователя
		usersPage.buttonRolPolzovatel.click();
				
		//Нажимаем Сохранить
		usersPage.buttonSave.click();
		Thread.sleep(3000);
								
		//Возвращаемся к списку пользователей
		usersPage.buttonBackDontCreate.click();	
								
		//Закрываем сайт
		driver.quit();
		
		
	}
}
