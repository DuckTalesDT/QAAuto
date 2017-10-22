package salesForecast;

import org.junit.Test;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PvPage;
import forTests.UdpPage;
import forTests.Variables;

public class SalesForecastFortyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//48-����������� ����� �� ������� ����� ���� ����� � ����� ����������� �����
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
		
		//������� 3 ��
		for(int i = 0; i < 3; i++){
			centersPage.addCenterThisMonth(driver);
			}
		
		//�������� "���������� ��������� ��������"
		udpPage.optionUdp(driver);
			
		//������� ������� ����
		int today = udpPage.FindToday(driver);
				
		//���������� �������� ��� ��������
		String data = "";
		if (today < 10)
			data = data_3000;
			else if (today >= 10 && today < 20)
				data = data_6000;
				else if (today >=20 && today < 28)
					data = data_9000;
					else if (today >=28)
						data = data_12000;
		
		//�������� "������� �������"
		pvPage.optionPv(driver);
					
		//������ ����� �� �� �1
		pvPage.fieldCenterFirst.click();
		Thread.sleep(3000);
		pvPage.inputKassa(driver);
		
		//������ ����� �� �� �2
		pvPage.fieldCenterSecond.click();
		Thread.sleep(3000);
		pvPage.inputKassa(driver);
				
		//������ ����� �� �� �3
		pvPage.fieldCenterThird.click();
		Thread.sleep(3000);
		pvPage.inputKassa(driver);
						
		//���������� "����������� �����"
		pvPage.buttonFactKassa.click();	
		Thread.sleep(1000);
		
		//���������� "����� �������"
		pvPage.buttonTotalPrognoz.click();	
		Thread.sleep(1000);
						
		//��������� ���������
		if (data.equals(pvPage.fieldFactKassaTotal.getText()))
			System.out.println("SalesForecast Forty-eighth test is pass");
			else
				System.out.println("SalesForecast Forty-eighth test is false");
		
		//������������ "����������� �����"
		pvPage.buttonFactKassa.click();	
		Thread.sleep(1000);
		
		//��-���������� "����� �������"
		pvPage.buttonTotalPrognoz.click();	
		Thread.sleep(1000);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
						
		//������� �� ���� ��� ����
		centersPage.deleteAllCenter(driver);
										
		//��������� ����
		driver.quit();
	}
}
