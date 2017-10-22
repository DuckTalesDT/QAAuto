package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.MainPage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class AccountUsersSeventySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//77-�������������� ������ ������������� � �������� "������ ��������" �� ��������
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
		MainPage mainPage = new MainPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrancePolZapr(driver);
				
		//�������� ������� �������
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (textHello.equals(mainPage.labelTitle.getText()))
			{	
			//�������� ���
			udpPage.optionUdp(driver);
			
			//���������
			if (textHello.equals(mainPage.labelTitle.getText()))
				System.out.println("AccountUsers Seventy-seventh test is pass");
				else
					System.out.println("AccountUsers Seventy-seventh test part �2 is false");
			}
			else
				System.out.println("AccountUsers Seventy-seventh test part �1 is false");
							
		//��������� ����
		driver.quit();
	}

}
