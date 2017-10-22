package common;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.MainPage;
import forTests.Variables;

public class CommonNinteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//19-E-mail �������� � �� �������� ������� �������������
		EntrancePage entrancePage = new EntrancePage();
		MainPage mainPage = new MainPage();
																		
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
														
		//��������� ���������
		if(textVievMail.equals(mainPage.fieldEmail.getText()))
			System.out.println("Common Ninteenth test is pass");
			else
				System.out.println("Common Ninteenth test is false");
				
		//��������� ����
		driver.quit();
	}

}
