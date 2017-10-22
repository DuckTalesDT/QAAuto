package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class AccountUsersSeventyNinthPartTwo extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//79-��������� ��������� ��� �������������� ������ ������������� � �������� "������ ��������"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrancePolZapr(driver);
						
		//�������� ���������
		String toolTipText = udpPage.promptUdpDontOpen(driver);

		//��������� ���������
		if (promptZaprUdp.equals(toolTipText))
			System.out.println("AccountUsers Seventy-ninth test is pass");
			else
				System.out.println("AccountUsers Seventy-ninth test is false");
		
		//��������� ����
		driver.quit();
		
	}

}
