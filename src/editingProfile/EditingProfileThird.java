package editingProfile;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileThird extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//3-E-mail ��� �������� �������� � � ������ ������� �������������
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
		
		//��������� ���������
		if (mail.equals(profilePage.fieldEmail.getAttribute("value")))
			System.out.println("EditingProfile Third test is pass");
			else
				System.out.println("EditingProfile Third test is false");
				
		// ��������� ����
		driver.quit();
	}

}
