package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileFourteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//14-�������� ������ �������� ��� �������� ����� "�������" �� ��������
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
		
		//������� ������ � ����e "�������"
		profilePage.fieldTelephone.sendKeys(Keys.END);
		profilePage.fieldTelephone.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
				
		//��������� ��������
		driver.navigate().refresh();
		Thread.sleep(3000);
				
		//��������� ���������
		if (telephone.equals(profilePage.fieldTelephone.getAttribute("value")))
			System.out.println("EditingProfile Fourteenth test is pass");
			else
				System.out.println("EditingProfile Fourteenth test is false");
		
		//���������� "�������"
		profilePage.fieldTelephone.sendKeys(Keys.END);
		profilePage.fieldTelephone.sendKeys(empty_15);
		profilePage.fieldTelephone.sendKeys(telephone);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
			
		//��������� ����
		driver.quit();
	}

}
