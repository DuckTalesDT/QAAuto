package editingProfile;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileSecond extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//2-��� ��� �������� �������� � � ������ ������� �������������
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
		
		//��������� ���������
		if (name.equals(profilePage.fieldName.getAttribute("value")))
			System.out.println("EditingProfile Second test is pass");
			else
				System.out.println("EditingProfile Second test is false");
				
		// ��������� ����
		driver.quit();
	}

}
