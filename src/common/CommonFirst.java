package common;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.MainPage;
import forTests.Variables;

public class CommonFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//1-����������� ������ �����������
		EntrancePage entrancePage = new EntrancePage();
		MainPage mainPage = new MainPage();
																				
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//�������� �� ������� "finance controlling"
		mainPage.buttonLogo.click();
								
		//��������� ���������
		if (textHello.equals(mainPage.labelTitle.getText()))
			System.out.println("Common First test is pass");
			else
				System.out.println("Common First test is false");
		
		//��������� ����
		driver.quit();
	}

}
