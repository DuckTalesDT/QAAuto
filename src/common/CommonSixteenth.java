package common;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.MainPage;
import forTests.Variables;

public class CommonSixteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 16-������� ���������� � ������ ��������
		EntrancePage entrancePage = new EntrancePage();
		MainPage mainPage = new MainPage();
																		
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
								
		//��������� ���������
		if (infoReliz.equals(mainPage.labelVersion.getText()))
			System.out.println("Common Sixteenth test is pass");
			else
				System.out.println("Common Sixteenth test is false");

		//�a������� ����
		driver.quit();
	}

}
