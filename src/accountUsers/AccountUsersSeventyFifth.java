package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class AccountUsersSeventyFifth extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//75-��������� ��������� ��� �������������� ������ ���������� � �������� "������ ��������"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceManZapr(driver);
						
		//�������� ���������
		String toolTipText = pvPage.promptPvDontOpen(driver);
				
		//��������� ���������
		if (promptZaprPv.equals(toolTipText))
			System.out.println("AccountUsers Seventy-fifth test is pass");
			else
				System.out.println("AccountUsers Seventy-fifth test is false");
		
		//��������� ����
		driver.quit();
		
	}

}
