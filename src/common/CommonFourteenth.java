package common;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import forTests.EntrancePage;
import forTests.Variables;

public class CommonFourteenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 14-������� ������ "�������"
		EntrancePage entrancePage = new EntrancePage();
																		
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
								
		///������������� "�������"
		Actions builder = new Actions (driver);
		builder.moveToElement(driver.findElement(By.xpath(optionAll))).perform();
				
		//��������� ���������
		Thread.sleep(1000);
		if(partEvents.equals(driver.findElement(By.xpath(optionEvents)).getText()))
			System.out.println("Common Fourteenth test is pass");
			else
				System.out.println("Common Fourteenth test is false");
		
		//��������� ����
		driver.quit();
	}

}
