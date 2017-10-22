package common;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.MainPage;
import forTests.Variables;

public class CommonEighteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//18-�������� "��������� ��� �������� �����������" �� �������� ����������� � �� �������� ������� �������������
		EntrancePage entrancePage = new EntrancePage();
		MainPage mainPage = new MainPage();
																		
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
								
		//��������� ���������
		if (home.equals(mainPage.fieldName.getText()))
			System.out.println("Common Eighteenth test is pass");
			else
				System.out.println("Common Eighteenth test is false");
						
		//��������� ����
		driver.quit();
	}

}
