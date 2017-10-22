package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileThirtyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//38-�������� ������ �������� ��� ����� ������ �� ��������
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
		
		//������ ������� �� �������� ������
		profilePage.fieldTelephone.sendKeys(Keys.END);
		profilePage.fieldTelephone.sendKeys(empty_15);
		profilePage.fieldTelephone.sendKeys(telephoneSmaller);
		//profilePage.fieldPassword.sendKeys(Keys.END);
		//profilePage.fieldPassword.sendKeys(empty_11);
		//profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
			
		//��������� ��������
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//���������� �������
		if (telephone.equals(profilePage.fieldTelephone.getAttribute("value")))
			{
			//���������� �������
			profilePage.fieldTelephone.sendKeys(Keys.END);
			profilePage.fieldTelephone.sendKeys(empty_15);
			profilePage.fieldTelephone.sendKeys(telephone);
			profilePage.fieldPassword.sendKeys(Keys.END);
			profilePage.fieldPassword.sendKeys(empty_15);
			profilePage.fieldPassword.sendKeys(parol);
			profilePage.save(driver);
			Thread.sleep(1000);
			
			//��������� ���������
			if (telephone.equals(profilePage.fieldTelephone.getAttribute("value")))
				System.out.println("EditingProfile Thirty-eighth test is pass");
				else
					System.out.println("EditingProfile Thirty-eighth test part �2 is false");
			}
			else
				System.out.println("EditingProfile Thirty-eighth test part �1 is false");
				
		// ��������� ����
		driver.quit();
	}

}
