package editingProfile;

import org.junit.Test;
import org.openqa.selenium.Keys;

import forTests.EntrancePage;
import forTests.ProfilePage;
import forTests.PvPage;
import forTests.Variables;

public class EditingProfileNinthPartTwo extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//9-������ ������� ��������
		EntrancePage entrancePage = new EntrancePage();
		ProfilePage profilePage = new ProfilePage();
		PvPage pvPage = new PvPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceNewParol(driver);
		
		//��������� ���������
		if (pageSistem.equals(pvPage.buttonPv.getText()))
			System.out.println("EditingProfile Ninth test is pass");
			else 
				System.out.println("EditingProfile Ninth test is false");
		
		//��������� "�������������� �������"
		profilePage.goOptionEditingProfile(driver);
		
		//���������� ������ �������
		profilePage.buttonChangeParol.click();
		profilePage.fieldPassword.sendKeys(Keys.END);
		profilePage.fieldPassword.sendKeys(empty_15);
		profilePage.fieldPassword.sendKeys(parolNew);
		profilePage.fieldNewPassword.sendKeys(Keys.END);
		profilePage.fieldNewPassword.sendKeys(empty_15);
		profilePage.fieldNewPassword.sendKeys(parol);
		profilePage.fieldRepeatPassword.sendKeys(Keys.END);
		profilePage.fieldRepeatPassword.sendKeys(empty_15);
		profilePage.fieldRepeatPassword.sendKeys(parol);
		profilePage.save(driver);
		
		//��������� ����
		driver.quit();
	}

}
