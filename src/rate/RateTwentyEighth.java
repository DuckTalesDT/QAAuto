package rate;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.EntrancePage;
import forTests.PayPage;
import forTests.TarifPage;
import forTests.Variables;

public class RateTwentyEighth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//28-����� �� ��������� ������
		EntrancePage entrancePage = new EntrancePage();
		TarifPage tarifPage = new TarifPage();
		PayPage payPage = new PayPage();
														
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
		
		//��������� "���������� � �������"
		tarifPage.goOptionAboutTarif(driver);
				
		//�������� ����� "Vip"
		tarifPage.buttonTarifVip.click();
							
		//�������� "�������� �������� ����"
		tarifPage.buttonChangeTarif.click();
							
		//�������� "��������"
		tarifPage.buttonDontAgreeChangeTarif.click();
		Thread.sleep(1000);
						
		//��������� �������/���������
		payPage.goOptionPay(driver);
		
		//��������� ���������
		if (driver.findElements(By.xpath(tarifBack)).size() == 0)
			System.out.println("Rate Twenty-eighth test is pass");
			else
				System.out.println("Rate Twenty-eighth test is false");
				
		//��������� ����
		driver.quit();
	}

}
