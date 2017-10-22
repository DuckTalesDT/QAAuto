package accountUsers;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.UsersPage;
import forTests.Variables;

public class AccountUsersFiftySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//56-Удаление комментария
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
										
		//Выбираем роль Пользователь
		usersPage.buttonRolPolzovatel.click();
										
		//Вводим пароль
		usersPage.fieldPassword.sendKeys(parol);
										
		//Повторяем пароль
		usersPage.fieldRepeatPassword.sendKeys(parol);
		
		//Вносим комментария
		usersPage.fieldComment.sendKeys(userComment);
										
		//Нажимаем Сохранить
		usersPage.buttonSave.click();
		Thread.sleep(3000);
								
		//Возвращаемся к списку пользователей
		usersPage.buttonBackCreate.click();
		Thread.sleep(1000);		
						
		//Открываем Пользователя
		usersPage.buttonNameOpen.click();
		
		//Удаляем комментарий
		usersPage.fieldComment.sendKeys(Keys.END);
		usersPage.fieldComment.sendKeys(empty_35);
				
		//Нажимаем Сохранить
		usersPage.buttonSave.click();
		Thread.sleep(3000);
		
		//Возвращаемся к списку пользователей
		usersPage.buttonBackDontCreate.click();	
		
		//Открываем Пользователя
		usersPage.buttonNameOpen.click();
		
		//Проверяем результат
		Thread.sleep(1000);
		if (userCommentEmpty.equals(usersPage.fieldComment.getText()))
			System.out.println("AccountUsers Fifty-sixth test is pass");
			else
				System.out.println("AccountUsers Fifty-sixth test is false");
		
		//Возвращаемся к списку пользователей
		usersPage.buttonBackDontCreate.click();	
			
		//Удаляем пользователей 
		usersPage.deleteAllUserSecond(driver);
										
		//Закрываем сайт
		driver.quit();
		
	}

}
