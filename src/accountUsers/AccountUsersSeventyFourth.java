package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class AccountUsersSeventyFourth extends Variables {
			
	@Test
	public void test() throws InterruptedException{
		//74-��������� ��������� ��� ��������� ������ ���������� � �������� "������ ��������"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceManZapr(driver);
						
		//�������� ���������
		String toolTipText = pvPage.promptPvDontOpen(driver);
				
		//��������� ���������
		if (promptZaprPv.equals(toolTipText))
			System.out.println("AccountUsers Seventy-fourth test is pass");
			else
				System.out.println("AccountUsers Seventy-fourth test is false");
		
		//��������� ����
		driver.quit();
				
	}

}
