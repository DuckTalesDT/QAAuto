package editingProfile;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.Variables;

public class EditingProfileFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//1-������� ��� �������� �������� � � ������ ������� �������������
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
										
		//��������� ������ "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
		
		//��������� ���������
		if (telephone.equals(profilePage.fieldTelephone.getAttribute("value")))
			System.out.println("EditingProfile First test is pass");
			else
				System.out.println("EditingProfile First test is false");
				
		// ��������� ����
		driver.quit();
	}

}
