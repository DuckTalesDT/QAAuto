package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class AccountUsersSeventyEighth extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//78-��������� ��������� ��� ��������� ������ ������������� � �������� "������ ��������"
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrancePolZapr(driver);
						
		//�������� ���������
		String toolTipText = pvPage.promptPvDontOpen(driver);
				
		//��������� ���������
		if (promptZaprPv.equals(toolTipText))
			System.out.println("AccountUsers Seventy-eightn test is pass");
			else
				System.out.println("AccountUsers Seventy-eightn test is false");
		
		//��������� ����
		driver.quit();
		
	}

}
