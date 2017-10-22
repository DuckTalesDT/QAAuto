package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.PvPage;
import forTests.Variables;

public class EditingProfileSixthPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//6-������ ����� "E-mail" ��������
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
		PvPage pvPage = new PvPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceNewMail(driver);
								
		//��������� ���������
		if (pageSistem.equals(pvPage.buttonPv.getText()))
			System.out.println("EditingProfile sixth test is pass");
			else 
				System.out.println("EditingProfile sixth test is false");
										
		//��������� "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
		
		//���������� "Email"
		profilePage.fieldEmail.sendKeys(Keys.END);
		profilePage.fieldEmail.sendKeys(empty_35);
		profilePage.fieldEmail.sendKeys(mail);
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parol);
		profilePage.save(driver);
				
		//��������� ����
		driver.quit();
	}

}
