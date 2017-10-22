package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateOneHundred extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//100-������� �� ����� "�����������" � ������ ���������� ������� �� Max ���������� ������� ����� �� ��������
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
		CentersPage centersPage = new CentersPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entranceMaxim(driver);
		
		//������� ������������� � ��
		tarifPage.deleteForChangeTarif(driver);
		
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
		
		//��������� 6 ��
		for(int i = 0 ; i < 6 ; i ++){
			centersPage.addCenterThisMonth(driver);
		}
		
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� �� ����� �����������
		tarifPage.changeTarifStand(driver);	
		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//��������� ���������
		if (driver.findElements(By.xpath(tarifBack)).size() == 0)
			System.out.println("Rate One hundred test is pass");
			else
				{
				System.out.println("Rate One hundred test is false");
			
				//������ ����� �� ������������
				tarifPage.changeTarifMaxim(driver);	
				}								
				
		//������� ������������� � ��
		tarifPage.deleteForChangeTarif(driver);
					
		//��������� ����
		driver.quit();	
	}

}
