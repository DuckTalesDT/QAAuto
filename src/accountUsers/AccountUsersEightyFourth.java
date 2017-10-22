package accountUsers;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class AccountUsersEightyFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//84-�������������� ������ ������������� � �������� "������ ������" �� ��������
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrancePolChten(driver);
		
		//�������� ������� �������
		pvPage.optionPv(driver);
		
		//��������� ���������
		if (checkReadonly.equals(pvPage.fieldPlan_1.getAttribute("readonly")))
			if (checkReadonly.equals(pvPage.fieldKassa_1.getAttribute("readonly")))
				{	
				//��������� ���
				udpPage.optionUdp(driver);
			
				//������� �� ������ ��� ����� �������� � �����������
				udpPage.fieldIncome_5_1.click();
			
				//���������
				if (checkReadonly.equals(udpPage.fieldInputData_1.getAttribute("readonly")))
					{
					//��������� ���� ��� �����
					udpPage.buttonInputDataClose.click();
					
					//������� �� ������ ��� ����� �������� � �������
					udpPage.fieldRashod_3_1.click();
				
					//���������
					if (checkReadonly.equals(udpPage.fieldInputData_1.getAttribute("readonly")))
						{
						//��������� ���� ��� �����
						udpPage.buttonInputDataClose.click();
						
						//������� ������� �� ������ ������
						if (checkReadonly.equals(udpPage.fieldOstatok.getAttribute("readonly")))
							System.out.println("AccountUsers Eighty-fourth test is pass");
							else
								System.out.println("AccountUsers Eighty-fourth test part �5 is false");
						}
						else
							System.out.println("AccountUsers Eighty-fourth test part �4 is false");
					}
					else
						System.out.println("AccountUsers Eighty-fourth test part �3 is false");
				}
				else
					System.out.println("AccountUsers Eighty-fourth test part �2 is false");
			else
				System.out.println("AccountUsers Eighty-fourth test part �1 is false");
						
		//��������� ����
		driver.quit();
		
	}

}
