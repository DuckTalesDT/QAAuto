package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileSeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//7-������ ����� "���-�����������" �������� �� "��"
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
		
		//������������� ���-����������� = ��
		profilePage.fieldSms.sendKeys(smsYes);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
		
		//������������� ���-����������� = ���
		if (smsYes.equals(profilePage.fieldSms.getText()))
			{
			//������������� ���-����������� = ���
			Thread.sleep(1000);
			profilePage.fieldSms.sendKeys(smsNo);
			profilePage.fieldPassword.sendKeys(Keys.END);
			profilePage.fieldPassword.sendKeys(empty_15);
			profilePage.fieldPassword.sendKeys(parol);
			profilePage.save(driver);
			
			//��������� �������� ���������
			if (smsNo.equals(profilePage.fieldSms.getText()))
				System.out.println("EditingProfile Seventh test is pass");
				else
					System.out.println("EditingProfile Seventh test part �2 is false");
			}
			else
				System.out.println("EditingProfile Seventh test part �1 is false");
		
		//��������� ����
		driver.quit();
	}

}
