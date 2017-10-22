package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateNinetyNinth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//99-������� �� ����� "�����������" � ������ ���������� ������� �� Max ���������� ������� ����� �� ��������
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
		
		//��������� 10 ��
		for(int i = 0 ; i < 10 ; i ++){
			centersPage.addCenterThisMonth(driver);
		}
		
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
		
		//��������� �� ����� �����������
		tarifPage.changeTarifOptim(driver);	
		
		//��������� �������/���������
		payPage.goOptionPay(driver);
				
		//��������� ���������
		if (driver.findElements(By.xpath(tarifBack)).size() == 0)
			System.out.println("Rate Ninty-ninth test is pass");
			else
				{
				System.out.println("Rate Ninty-ninth test is false");
			
				//������ ����� �� ������������
				tarifPage.changeTarifMaxim(driver);	
				}								
				
		//������� ������������� � ��
		tarifPage.deleteForChangeTarif(driver);
					
		//��������� ����
		driver.quit();	
	}

}
