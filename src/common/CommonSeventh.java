package common;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.MainPage;
import forTests.Variables;

public class CommonSeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 7-������� ������ "� �������"
		EntrancePage entrancePage = new EntrancePage();
		MainPage mainPage = new MainPage();
																		
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
											
		//��������� ���������
		if (partAbout.equals(mainPage.buttonAboutService.getText()))
			System.out.println("Common Seventh test is pass");
			else
				System.out.println("Common Seventh test is false");
						
		//��������� ����
		driver.quit();
	}

}
