package entrance;

import org.junit.Test;
import org.openqa.selenium.By;

import forTests.EntrancePage;
import forTests.Variables;

public class EntranceTenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		// 10-��������� ��������� ��� ����� � ������� � �������� �������
		EntrancePage entrancePage = new EntrancePage();
		
		//��������� ����
		driver.get(adressSyteEntrance);
		
		//�������� ������ "����"
		entrancePage.buttonSyteEntrance.click();
		
		//�������� E-mail � ���� "E-mail"
		entrancePage.fieldEntranceEmail.sendKeys(mail);
						
		//�������� ������ � ���� "������" �� ������
		entrancePage.fieldEntranceParol.sendKeys(parolIncorrect);
							
		//�������� �� ������ "�����"
		entrancePage.buttonEntrance.click();
								
		//��������� ���������
		Thread.sleep(1000);
		if (promptIncorrectMailEntrance.equals(driver.findElement(By.id("pre-login-error")).getText()))
			System.out.println("Entrance Tenth test is pass");
			else
				System.out.println("Entrance Tenth test is false");
								
		//��������� ����
		Thread.sleep(1000);
		driver.close();
	}

}
