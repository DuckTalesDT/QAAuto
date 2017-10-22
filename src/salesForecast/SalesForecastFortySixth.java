package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class SalesForecastFortySixth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//46-����������� ����������� �����
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
		PvPage pvPage = new PvPage();
		UdpPage udpPage = new UdpPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
		
		//������� ��
		centersPage.addCenterThisMonth(driver);
		
		//�������� "���������� ��������� ��������"
		udpPage.optionUdp(driver);
			
		//������� ������� ����
		int today = udpPage.FindToday(driver);
				
		//���������� �������� ��� ��������
		String data = "";
		if (today < 10)
			data = data_1000;
			else if (today >= 10 && today < 20)
				data = data_2000;
				else if (today >=20 && today < 28)
					data = data_3000;
					else if (today >=28)
						data = data_4000;
		
		//�������� "������� �������"
		pvPage.optionPv(driver);
			
		//������ �����
		pvPage.inputKassa(driver);
								
		//���������� "����������� �����"
		pvPage.buttonFactKassa.click();	
		Thread.sleep(1000);
						
		//��������� ���������
		if (data.equals(pvPage.fieldFactKassa_1.getText()))
			System.out.println("SalesForecast Forty-sixth test is pass");
			else
				System.out.println("SalesForecast Forty-sixth test is false");
		
		//������������ "����������� �����"
		pvPage.buttonFactKassa.click();	
		Thread.sleep(1000);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}
