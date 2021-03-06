package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//5-������ ����� "���" ��������
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
		
		//�������� ����� ���
		profilePage.fieldName.sendKeys(Keys.END);
		profilePage.fieldName.sendKeys(empty_35);
		profilePage.fieldName.sendKeys(nameNew);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
		
		//���������� ���
		if (nameNew.equals(profilePage.fieldName.getAttribute("value")))
			{
			//�������� ������ ��������
			profilePage.fieldName.sendKeys(Keys.END);
			profilePage.fieldName.sendKeys(empty_35);
			profilePage.fieldName.sendKeys(name);
			profilePage.fieldPassword.sendKeys(Keys.END);
			profilePage.fieldPassword.sendKeys(empty_15);
			profilePage.fieldPassword.sendKeys(parol);
			profilePage.save(driver);
				
			//��������� ���������
			if (name.equals(profilePage.fieldName.getAttribute("value")))
				System.out.println("EditingProfile Fifth test is pass");
				else
					System.out.println("EditingProfile Fifth test part �2 is false");
			}
			else
				System.out.println("EditingProfile Fifth test part �1 is false");
		
		// ��������� ����
		driver.quit();
	}

}
