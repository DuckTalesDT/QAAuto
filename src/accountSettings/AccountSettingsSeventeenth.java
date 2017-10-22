package accountSettings;

import org.junit.Test;

import forTests.AccountPage;
import forTests.EntrancePage;
import forTests.UdpPage;
import forTests.Variables;

public class AccountSettingsSeventeenth extends Variables {
	
	@Test
	public void test() throws InterruptedException{
		//17-�������� ��������� ��� �������������� ������������ �� �������� � ������ ����������� ������������ "���������� ������������� ����"
		EntrancePage entrancePage = new EntrancePage();
		AccountPage accountPage = new AccountPage();
		UdpPage udpPage = new UdpPage();
						
		//��������� ���������� � �������� �����������
		entrancePage.entrance(driver);
				
		//��������� ������ "��������� ��������"
		accountPage.goOptionAccountSettinth(driver);
							
		//�������� ����� ���������� ������������� ���� = 3
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_3);
										
		//��������� ���������
		accountPage.buttonSave.click();
				
		//��������� ���
		udpPage.optionUdp(driver);
		
		//������� ����� ���
		udpPage.DeleteListUdp(driver);
				
		//������� ���� ���
		udpPage.AddListUslugaRoznica(driver);
						
		//��������� �� ����� �����
		udpPage.GoBeforeMonth(driver);
						
		//������� �� ������ ��� ����� ��������
		udpPage.fieldIncome_5_1.click();
								
		//������ ��������
		udpPage.fieldInputData_1.sendKeys(dataCeloe_1000);
				
		//�������� ����� ���������
		String promptBefore = udpPage.labelPromptIncorrectDay.getText();
		String promptAfter = promptBefore.split("\\! ���")[0];
		
		//��������� ���������
		if (promptCorrectMoreDays.equals(promptAfter))
			System.out.println("AccountSettings Seventeenth test is pass");
			else
				System.out.println("AccountSettings Seventeenth test is false");
				
		//��������� ����������� ����
		udpPage.buttonPromptIncorrectDay.click();
		Thread.sleep(1000);
				
		//������� ����� ���
		udpPage.DeleteListUdp(driver);
		
		//��������� ������ "��������� ��������"
		accountPage.goOptionAccountSettinth(driver);
								
		//���������� "K��������� ������������� ����" = 60
		accountPage.fieldDays.sendKeys(empty_2);
		accountPage.fieldDays.sendKeys(date_60);
										
		//��������� ���������
		accountPage.buttonSave.click();
				
		//��������� ����
		driver.quit();
	}

}
