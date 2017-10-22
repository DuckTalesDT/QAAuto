package common;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import forTests.EntrancePage;
import forTests.Variables;

public class CommonTenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 10-������� ������ "������/���������"
		EntrancePage entrancePage = new EntrancePage();
																		
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
								
		//������������� "������/���������"
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.xpath(optionTarif))).perform();
						
		//��������� ���������
		Thread.sleep(1000);
		if(partPayment.equals(driver.findElement(By.xpath(optionPay)).getText()))
			System.out.println("Common Tenth test is pass");
			else
				System.out.println("Common Tenth test is false");
						
		//��������� ����
		driver.quit();
	}

}
