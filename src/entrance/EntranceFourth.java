package entrance;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.Variables;

public class EntranceFourth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//4-��� ������������ �������� ������ ���� � ������� �� ����������
		EntrancePage entrancePage = new EntrancePage();
		
		//��������� ����
		driver.get(adressSyteEntrance);
		
		//�������� ������ "����"
		entrancePage.buttonSyteEntrance.click();
									
		//�������� E-mail � ���� "E-mail"
		entrancePage.fieldEntranceEmail.sendKeys(mail);
								
		//�������� ������ � ���� "������" ��������
		entrancePage.fieldEntranceParol.sendKeys(parolIncorrect);
								
		//�������� �� ������ "�����"
		entrancePage.buttonEntrance.click();
								
		//��������� ���������
		Thread.sleep(1000);
		if (pageEntrance.equals(entrancePage.LabelEntrance.getText()))
			System.out.println("Entrance Fourth test is pass");
		  	else
		  		System.out.println("Entrance Fourth test is false");
								
		//��������� ����
		driver.quit();
	}

}
