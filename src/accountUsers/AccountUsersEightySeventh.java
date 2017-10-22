package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class AccountUsersEightySeventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//87-�������������� ������ ���������� � �������� "��������������" ��������
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entranceManRedact(driver);
		
		//�������� ������� �������
		pvPage.optionPv(driver);
					
		//������ ���� � �����
		pvPage.inputPlanFirst_1000(driver);
		pvPage.inputKassaFirst_1000(driver);
		
		//��������� ���������
		if (dataCeloe_1000.equals(pvPage.fieldPlan_1.getAttribute("value")))
			if (data_1000.equals(pvPage.fieldKassa_1.getAttribute("value")))
				{	
				//��������� ���
				udpPage.optionUdp(driver);
												
				//������ ��������
				udpPage.InputDataIncome_5_1(driver);
				udpPage.InputDataRashod_3_1(driver);
				udpPage.InputOstatok(driver);
																
				//���������
				if (dataCeloe_1000.equals(udpPage.fieldIncome_5_1.getText()))
					if (dataCeloe_1000.equals(udpPage.fieldRashod_3_1.getText()))
						if(dataCeloe_1000.equals(udpPage.fieldOstatok.getAttribute("value")))
							System.out.println("AccountUsers Eighty-seventh test is pass");
							else
								System.out.println("AccountUsers Eighty-seventh test part �5 is false");
						else
							System.out.println("AccountUsers Eighty-seventh test part �4 is false");
					else
						System.out.println("AccountUsers Eighty-seventh test part �3 is false");
				}
				else
					System.out.println("AccountUsers Eighty-seventh test part �2 is false");
			else
				System.out.println("AccountUsers Eighty-seventh test part �1 is false");
								
		//��������� ����
		driver.quit();
		
	}
}
