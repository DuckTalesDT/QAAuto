package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class AccountUsersEightyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//88-�������� ������ ������������� � �������� "��������������" ��������
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
										
		//��������� ���������� � �������� �����������
		entrancePage.entrancePolRedact(driver);
				
		//�������� ������� �������
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (partPv.equals(pvPage.labelTitle.getText()))
			{	
			//�������� ���
			udpPage.optionUdp(driver);
			
			//���������
			if (partUdp.equals(udpPage.labelTitle.getText()))
				System.out.println("AccountUsers Eighty-eighth test is pass");
				else
					System.out.println("AccountUsers Eighty-eighth test part �2 is false");
			}
			else
				System.out.println("AccountUsers Eighty-eighth test part �1 is false");
							
		//��������� ����
		driver.quit();
	}

}
