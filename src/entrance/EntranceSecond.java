package entrance;

import org.junit.Test;

import forTests.EntrancePage;
import forTests.PvPage;
import forTests.Variables;

public class EntranceSecond extends Variables  {
	
	@Test
	public void test() throws InterruptedException{
		// 2-��� ���������� �������� ������ ��� ����������� ���-����������� ���������� ���� � �������
		EntrancePage entrancePage = new EntrancePage();
		PvPage pvPage = new PvPage();
		
		//��������� ����
		driver.get(adressSyteEntrance);
		
		//�������� ������ "����"
		entrancePage.buttonSyteEntrance.click();
										
		//�������� E-mail � ���� "E-mail"
		entrancePage.fieldEntranceEmail.sendKeys(mail);
						
		//�������� ������ � ���� "������"
		entrancePage.fieldEntranceParol.sendKeys(parol);
							
		//�������� �� ������ "�����"
		entrancePage.buttonEntrance.click();
						
		//��������� ���������
		Thread.sleep(3000);
		if (pageSistem.equals(pvPage.buttonPv.getText()))
			System.out.println("Entrance Second test is pass");
			else 
				System.out.println("Entrance Second test is false");
											
		//��������� ����
		driver.quit();
	}

}
