package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class AccountUsersSeventyEighthPartTwo extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//78-��������� ��������� ��� ��������� ������ ������������� � �������� "������ ��������"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrancePolZapr(driver);
						
		//�������� ���������
		String toolTipText = udpPage.promptUdpDontOpen(driver);

		//��������� ���������
		if (promptZaprUdp.equals(toolTipText))
			System.out.println("AccountUsers Seventy-eighth test is pass");
			else
				System.out.println("AccountUsers Seventy-eighth test is false");
		
		//��������� ����
		driver.quit();
		
	}

}
