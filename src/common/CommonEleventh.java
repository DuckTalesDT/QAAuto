package common;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import forTests.EntrancePage;
import forTests.Variables;

public class CommonEleventh extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 11-������� ������ "������ �����"
		EntrancePage entrancePage = new EntrancePage();
																				
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
								
		//������������� "������ �����"
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.xpath(optionAll))).perform();
						
		//��������� ���������
		Thread.sleep(1000);
		if(partCenters.equals(driver.findElement(By.xpath(optionCenters)).getText()))
			System.out.println("Common Eleventh test is pass");
			else
				System.out.println("Common Eleventh test is false");
											
		//��������� ����
		driver.quit();
	}

}
