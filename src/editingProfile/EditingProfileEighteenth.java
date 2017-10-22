package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileEighteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//18-��������� ������ ������� �� ����������� ��� �������� ���������� ����� "������� ������"
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
															
		//�������� ������ � ����e "Email" ������ �� ������ ������
		profilePage.fieldEmail.sendKeys(Keys.END);
		profilePage.fieldEmail.sendKeys(empty_35);
		profilePage.fieldEmail.sendKeys(mailNew);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parolIncorrect);
		profilePage.save(driver);
				
		//��������� ��������
		driver.navigate().refresh();
		Thread.sleep(3000);
						
		//��������� ���������
		if (mail.equals(profilePage.fieldEmail.getAttribute("value")))
			System.out.println("EditingProfile Eighteenth test is pass");
			else
				System.out.println("EditingProfile Eighteenth test is false");
		
		//���������� "Email"
		profilePage.fieldEmail.sendKeys(Keys.END);
		profilePage.fieldEmail.sendKeys(empty_35);
		profilePage.fieldEmail.sendKeys(mail);
		profilePage.fieldEmail.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
					
		//��������� ����
		driver.quit();
	}

}
