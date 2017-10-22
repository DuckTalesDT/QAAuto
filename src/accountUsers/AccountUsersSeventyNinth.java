package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class AccountUsersSeventyNinth extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//79-��������� ��������� ��� �������������� ������ ������������� � �������� "������ ��������"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrancePolZapr(driver);
						
		//�������� ���������
		String toolTipText = pvPage.promptPvDontOpen(driver);
				
		//��������� ���������
		if (promptZaprPv.equals(toolTipText))
			System.out.println("AccountUsers Seventy-ninth test is pass");
			else
				System.out.println("AccountUsers Seventy-ninth test is false");
		
		//��������� ����
		driver.quit();
		
	}

}
