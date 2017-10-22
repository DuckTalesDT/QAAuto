package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class AccountUsersSeventyFourthPartTwo extends Variables {
		
	@Test
	public void test() throws InterruptedException{
		//74-��������� ��������� ��� ��������� ������ ���������� � �������� "������ ��������"
		EntrancePage entrancePage = new EntrancePage();
		UdpPage udpPage = new UdpPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceManZapr(driver);
						
		//�������� ���������
		String toolTipText = udpPage.promptUdpDontOpen(driver);

		//��������� ���������
		if (promptZaprUdp.equals(toolTipText))
			System.out.println("AccountUsers Seventy-fourth test is pass");
			else
				System.out.println("AccountUsers Seventy-fourth test is false");
		
		//��������� ����
		driver.quit();
		
	}

}
