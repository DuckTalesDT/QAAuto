package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateOneHundredFifth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//105-�������� ��������� ��� �������� �� ����� "�����������" � ������ ���������� ������� �� Max ���������� ������� �����
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
				
		//�������� ����� "�����������"
		tarifPage.buttonTarifOptim.click();
									
		//�������� "�������� �������� ����"
		tarifPage.buttonChangeTarif.click();
									
		//�������� "��������"
		tarifPage.buttonAgreeChangeTarif.click();
		Thread.sleep(1000);
														
		//��������� ���������
		if (promptChangePakegeLimit.equals(tarifPage.promptChangeTarif.getText()))
			System.out.println("Rate One hundred fifth test is pass");
			else
				System.out.println("Rate One hundred fifth test is false");
		
		//��������� ����������� ���������
		tarifPage.buttonChangeTarifWindowClose.click();
		Thread.sleep(1000);
			
		//���������� ����� �� ������������
		payPage.goOptionPay(driver);
		if (driver.findElements(By.xpath(tarifBack)).size() == 1)
			{	
			//������ ����� �� ������������
			tarifPage.changeTarifMaxim(driver);	
			}
		
		//������� ������������� � ��
		tarifPage.deleteForChangeTarif(driver);
							
		//��������� ����
		driver.quit();	
	}

}
