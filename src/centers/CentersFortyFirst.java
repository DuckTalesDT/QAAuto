package centers;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.CentersPage;
import forTests.EntrancePage;
import forTests.Variables;

public class CentersFortyFirst extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//41-����������� ���� �������� ������ �����
		EntrancePage entrancePage = new EntrancePage();
		CentersPage centersPage = new CentersPage();
								
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
												
		//��������� "������ �����"
		centersPage.goOptionCenters(driver);
			
		//������� ������ 
		centersPage.deleteAllGrup(driver);
		
		//������� �� 
		centersPage.deleteAllCenter(driver);
		
		//������� �� 
		centersPage.addCenterThisMonth(driver);
		
		//�������� ID ������� ��
		Thread.sleep(3000);
		String id = (centersPage.fieldCenterId.getAttribute("id"));
		
		//������� �� 
		centersPage.deleteCenter(driver);
					
		//������ �������� "���������� ��������� ������ �����"
		centersPage.buttonPeriod.click();
		
		//��������� ���������
		Thread.sleep(3000);
		if (centersThisMonth.equals(driver.findElement(By.xpath("//li[@id='"+ id +"']/div[3]")).getText()))
			System.out.println("Centers Forty-first test is pass");
			else
				System.out.println("Centers Forty-first test is false");
		
		//������ �� �������� "���������� ��������� ������ �����"
		centersPage.buttonPeriod.click();
		
		//������� �� 
		centersPage.deleteAllCenter(driver);
						
		//��������� ����
		driver.quit();
	}

}
